package br.edu.up.modelos;

public class CalculadoraCustoCarro {
    public static double calcularCustoConsumidor(double custoFabrica) {
        double porcentagemDistribuidor = 0.28;
        double porcentagemImpostos = 0.45;
        
        return custoFabrica + (custoFabrica * porcentagemImpostos) + (custoFabrica * porcentagemDistribuidor);
    }
}
