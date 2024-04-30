package br.edu.up.modelos;

public class Veiculo {
    private int ano;
    private double valor;

    public Veiculo(int ano, double valor) {
        this.ano = ano;
        this.valor = valor;
    }

    public double calcularDesconto() {
        double desconto = (ano <= 2000) ? 0.12 : 0.07;
        return valor * desconto;
    }

    public double calcularValorFinal() {
        return valor - calcularDesconto();
    }

    public boolean isAte2000() {
        return ano <= 2000;
    }

    public int getAno() {
        return ano;
    }

    public double getValor() {
        return valor;
    }
}


