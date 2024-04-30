package br.edu.up.modelos;

public class Empregado {
    private String nome;
    private double salario;
    private double salarioMinimo;

    public Empregado(String nome, double salario, double salarioMinimo) {
        this.nome = nome;
        this.salario = salario;
        this.salarioMinimo = salarioMinimo;
    }

    public double calcularReajuste() {
        if (salario < 3 * salarioMinimo) {
            return salario * 0.50; 
        } else if (salario >= 3 * salarioMinimo && salario <= 10 * salarioMinimo) {
            return salario * 0.20; 
        } else if (salario > 10 * salarioMinimo && salario <= 20 * salarioMinimo) {
            return salario * 0.15; 
        } else {
            return salario * 0.10; 
        }
    }

    public double getNovoSalario() {
        return salario + calcularReajuste();
    }

    public String getNome() {
        return nome;
    }
}

