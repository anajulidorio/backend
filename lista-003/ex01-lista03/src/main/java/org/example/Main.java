package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Fatura f1 = new Fatura("12345", "Monitor", 1, 150.0);
        Fatura f2 = new Fatura("67890", "Espelho", 2, 200.0);

        System.out.println("Fatura nº: " + f1.getNumero());
        System.out.println("Descrição: " + f1.getDescricao());
        System.out.println("Quantidade: " + f1.getQuantidade());
        System.out.println("Preço por item: " + f1.getPrecoPorItem());
        System.out.println("Total: R$ " + f1.getTotalFatura());

        System.out.println("\nFatura número: " + f2.getNumero());
        System.out.println("Descrição: " + f2.getDescricao());
        System.out.println("Quantidade: " + f2.getQuantidade());
        System.out.println("Preço por item: " + f2.getPrecoPorItem());
        System.out.println("Total: R$ " + f2.getTotalFatura());
    }
}