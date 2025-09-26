package com.example.lista009_ex01;

import com.example.lista009_ex01.CarroInput;
import com.example.lista009_ex01.FipeOutput;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
public class FipeController {

    private static final String API_BASE_URL = "https://brasilapi.com.br/api/";

    private final RestClient restClient = RestClient.create(API_BASE_URL);

    @PostMapping("/fipe")
    public FipeOutput buscarValorFipe(@RequestBody CarroInput carro) {

        System.out.println("Consulta recebida para: " + carro.getMarca() + " " + carro.getModelo() + " de " + carro.getAno());

        try {
            restClient.get()
                    .uri("/fipe/marcas/v1")
                    .retrieve()
                    .toBodilessEntity();

            System.out.println("API externa acessível. Status OK.");

        } catch (Exception e) {
            System.err.println("Erro ao tentar acessar a API FIPE externa: " + e.getMessage());
            return new FipeOutput(0.0, "Erro na comunicação com a API FIPE");
        }

        return new FipeOutput(
                50000.0,
                "Setembro de 2024"
        );
    }
}