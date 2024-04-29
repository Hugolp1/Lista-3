package br.edu.up.modelos;

public class CalculadoraCustoCarro {
    // Método para calcular o custo ao consumidor do carro
    public static double calcularCustoConsumidor(double custoFabrica) {
        double porcentagemDistribuidor = 0.28;
        double porcentagemImpostos = 0.45;
        
        return custoFabrica + (custoFabrica * porcentagemImpostos) + (custoFabrica * porcentagemDistribuidor);
    }
}
