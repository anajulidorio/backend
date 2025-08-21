package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exercicio08();
    }

    static void exercicio00() {
        // cria um scanner na memória
        Scanner leitor = new Scanner(System.in);
        // pede pro usuário digitar o nome
        System.out.println("Digite seu nome: ");
        // lê o nome e grava numa variável
        String nome = leitor.nextLine();
        // concatena a mensagem com a variável nome
        String mensagem = "Olá, " + nome + "!";
        // mostra a mensagem final
        System.out.println(mensagem);
    }

    static void exercicio01() {
        System.out.println("Bem-vindo ao Sistema de Geração de Jogadores!");
    }

    static void exercicio02() {
        String nome = "Mariana Silva";
        String cargo = "Analista de Sistemas";
        Double salario = 4500.00;
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$" + salario);
    }

    static void exercicio03() {
        String produto = "Teclado";
        Integer codigo = 12345;
        Double preco = 99.90;
        Boolean promocao = true;
        System.out.println("Produto: " + produto);
        System.out.println("Código: " + codigo);
        System.out.println("Preço: R$" + preco);
        System.out.println("Promoção: " + promocao);
    }

    static void exercicio04() {
        Scanner preco = new Scanner(System.in);
        System.out.println("Digite o valor da compra: R$");
        Double valor = preco.nextDouble();

        if (valor > 100) {
            Double valorDesconto = valor * 0.9;
            System.out.println("Valor final com desconto: R$ " + valorDesconto);
        } else {
            System.out.println("Valor final sem desconto: R$ " + valor);
        }
    }

    static void exercicio05() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        Integer idade = leitor.nextInt();

        if (idade < 12) {
            System.out.println("Categoria: Infantil");
        } else if (idade >= 12 && idade <= 17) {
            System.out.println("Categoria: Adolescente");
        } else {
            System.out.println("Categoria: Adulto");
        }
    }

    static void exercicio06() {
        int[] notas = {7, 8, 6, 9, 10};
        Double soma = 0.0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        Double media = (Double) soma / notas.length;
        System.out.println("Notas: " + Arrays.toString(notas));
        System.out.println("A média das notas é: " + media);
    }

    static void exercicio07() {
        Scanner leitorAltura = new Scanner(System.in);
        System.out.println("Digite a sua altura: ");
        double altura = leitorAltura.nextDouble();

        Scanner leitorPeso = new Scanner(System.in);
        System.out.println("Digite a sua peso: ");
        double peso = leitorPeso.nextDouble();

        double imc = peso/(altura*altura);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("IMC calculado: " + imc);
    }

    static void exercicio08() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
        String nome = leitor.nextLine();

        String nomeSemEspacos = nome.replace("", "");
        Integer numCarac = nomeSemEspacos.length();
        String nomeMaiusculas = nome.toUpperCase();
        boolean contemSilva = nome.contains("Silva");

        System.out.println("Número de caracteres do nome: " + numCarac);
        System.out.println("Nome em letras maiúsculas: " + nomeMaiusculas);
        System.out.println("Contém \"Silva\": " + contemSilva);
    }
}