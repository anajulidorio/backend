package com.example.lista006;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViagensController {
    @GetMapping("/recomendar")

    public String recomendarDestino (@RequestParam String clima, @RequestParam String estilo) {
        if ("calor".equals(clima) && "natureza".equals(estilo)) {
            return "Rio de Janeiro";
        } else if ("calor".equals(clima) && "historico".equals(estilo)) {
            return "Egito";
        } else if ("frio".equals(clima) && "aventura".equals(estilo)) {
            return "Chile";
        } else if ("frio".equals(clima) && "cultura".equals(estilo)) {
            return "Paris";
        } else if ("calor".equals(clima) && "praias bonitas".equals(estilo)) {
            return "Porto Seguro";
        } else {
            return "Nenhuma combinação encontrada";
        }
    }
}
