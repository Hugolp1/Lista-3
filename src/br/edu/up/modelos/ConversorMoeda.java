package br.edu.up.modelos;

import java.util.Scanner;

public class ConversorMoeda {
    private double cotacaoDolar;

    public ConversorMoeda(double cotacaoDolar) {
        this.cotacaoDolar = cotacaoDolar;
    }

    public double calcularValorEmReais(double quantidadeDolares) {
        return quantidadeDolares * cotacaoDolar;
    }
}