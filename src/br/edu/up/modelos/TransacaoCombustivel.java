package br.edu.up.modelos;

public class TransacaoCombustivel {
    private String tipoCombustivel;
    private double valorVeiculo;
    private double desconto;
    private double valorFinal;

    public TransacaoCombustivel(String tipoCombustivel, double valorVeiculo) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorVeiculo = valorVeiculo;
        this.desconto = calcularDesconto();
        this.valorFinal = valorVeiculo - desconto;
    }

    private double calcularDesconto() {
        switch (tipoCombustivel.toLowerCase()) {
            case "álcool":
                return valorVeiculo * 0.25;
            case "gasolina":
                return valorVeiculo * 0.21;
            case "diesel":
                return valorVeiculo * 0.14;
            default:
                throw new IllegalArgumentException("Combustível inválido: " + tipoCombustivel);
        }
    }

    public double getDesconto() {
        return desconto;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
}

