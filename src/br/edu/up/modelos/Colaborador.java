package br.edu.up.modelos;

public class Colaborador {
    private String nome;
    private int idade;
    private char sexo;
    private double salarioFixo;

    public Colaborador(String nome, int idade, char sexo, double salarioFixo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.salarioFixo = salarioFixo;
    }

    public double calcularAbono() {
        if (sexo == 'M') {
            return idade >= 30 ? 100.00 : 50.00;
        } else if (sexo == 'F') {
            return idade >= 30 ? 200.00 : 80.00;
        } else {
            throw new IllegalArgumentException("Sexo inválido.");
        }
    }

    public double calcularSalarioLiquido() {
        return salarioFixo + calcularAbono();
    }

    public String getNome() {
        return nome;
    }
}

