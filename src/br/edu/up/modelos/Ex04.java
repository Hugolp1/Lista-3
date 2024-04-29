package br.edu.up.modelos;

import java.util.Scanner;

public class Ex04 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.println("Digite a cotação do dólar (R$): ");
            double cotacaoDolar = leitor.nextDouble();

            System.out.println("Digite a quantidade de dólares disponíveis: ");
            double quantidadeDolares = leitor.nextDouble();

            ConversorMoeda conversor = new ConversorMoeda(cotacaoDolar);
            double valorEmReais = conversor.calcularValorEmReais(quantidadeDolares);

            System.out.println("Valor em reais (R$): " + valorEmReais);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro. Certifique-se de digitar valores válidos.");
        }
    }
}
