package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Datas válidas
        Data data1 = new Data(27, 8, 2025);
        Data data2 = new Data(12, 10, 2024);
        Data data3 = new Data(01, 01, 2000);

        System.out.println("Datas válidas:");
        data1.displayData();
        data2.displayData();
        data3.displayData();

        // Datas inválidas
        System.out.println("\nDatas inválidas:");
        Data data4 = new Data(31, 13, 2026);
        data4.displayData();

        Data data5 = new Data(31, 2, 2022);
        data5.displayData();

        Data data6 = new Data(0, 8, 2020);
        data6.displayData();
    }
}