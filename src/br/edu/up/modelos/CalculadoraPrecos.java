package br.edu.up.modelos;

public class CalculadoraPrecos {
    public static double calcularValorVenda(double precoCusto, double percentualAcrescimo) {
        return precoCusto * (1 + percentualAcrescimo / 100);
    }
}   
