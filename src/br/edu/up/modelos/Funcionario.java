package br.edu.up.modelos;

public class Funcionario {
    private double salario;
    private static final double SALARIO_MINIMO = 1100.0;

    public Funcionario(double salario) {
        this.salario = salario;
    }

    public double calcularReajuste() {
        if (salario < 3 * SALARIO_MINIMO) {
            return salario * 0.50;
        } else if (salario >= 3 * SALARIO_MINIMO && salario <= 10 * SALARIO_MINIMO) {
            return salario * 0.20;
        } else if (salario > 10 * SALARIO_MINIMO && salario <= 20 * SALARIO_MINIMO) {
            return salario * 0.15;
        } else {
            return salario * 0.10;
        }
    }

    public double getSalario() {
        return salario;
    }
}

