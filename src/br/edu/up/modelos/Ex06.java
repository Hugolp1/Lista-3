package br.edu.up.modelos;

import java.util.Scanner;

public class Ex06 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.println("Digite o preço de custo do produto: R$ ");
            double precoCusto = leitor.nextDouble();

            System.out.println("Digite o percentual de acréscimo (%): ");
            double percentualAcrescimo = leitor.nextDouble();

            double valorVenda = CalculadoraPrecos.calcularValorVenda(precoCusto, percentualAcrescimo);

            System.out.println("O valor de venda do produto é: R$ " + valorVenda);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro. Certifique-se de digitar valores válidos.");
        }
    }
}
