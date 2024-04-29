package br.edu.up.modelos;

import java.util.Scanner;

public class Ex07 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o custo de fábrica do carro: ");
        double custoFabrica = leitor.nextDouble();
        
        double custoConsumidor = CalculadoraCustoCarro.calcularCustoConsumidor(custoFabrica);
        
        System.out.println("O custo ao consumidor do carro é: " + custoConsumidor);
    }
}
