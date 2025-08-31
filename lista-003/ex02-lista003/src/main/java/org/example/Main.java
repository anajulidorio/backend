package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Empregado emp1 = new Empregado("Ana", "Lidorio", 3000.0);
        Empregado emp2 = new Empregado("Lara", "Dondossola", 4500.0);

        System.out.println("Salário Original:");
        System.out.println("O empregado " + emp1.getNome() + " " + emp1.getSobrenome() + " recebe R$" + emp1.getSalarioMensal() + " por mês." );
        System.out.println("O salário anual dele(a) é de: R$ " + emp1.getSalarioAnual());

        System.out.println("\nO empregado " + emp2.getNome() + " " + emp2.getSobrenome() + " recebe R$" + emp2.getSalarioMensal() + " por mês." );
        System.out.println("O salário anual dele(a) é de: R$ " + emp2.getSalarioAnual());

        //aplicar aumento
        emp1.aplicarAumento(15.0);
        emp2.aplicarAumento(10.0);

        System.out.println("\nSalário com aumento:");
        System.out.println("O empregado " + emp1.getNome() + " " + emp1.getSobrenome() + " recebe R$ " + emp1.getSalarioMensal() + " por mês." );
        System.out.println("O salário anual dele(a) é de: R$ " + emp1.getSalarioAnual());

        System.out.println("\nO empregado " + emp2.getNome() + " " + emp2.getSobrenome() + " recebe R$" + emp2.getSalarioMensal() + " por mês." );
        System.out.println("O salário anual dele(a) é de: R$ " + emp2.getSalarioAnual());
    }
}