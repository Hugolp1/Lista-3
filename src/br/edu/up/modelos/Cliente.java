package br.edu.up.modelos;

public class Cliente {
    private int tipoCliente;
    private double consumo;

    public Cliente(int tipoCliente, double consumo) {
        this.tipoCliente = tipoCliente;
        this.consumo = consumo;
    }

    public double getValorKwh() {
        switch (tipoCliente) {
            case 1:
                return 0.60;
            case 2:
                return 0.48;
            case 3:
                return 1.29;
            default:
                throw new IllegalArgumentException("Tipo de cliente inválido.");
        }
    }

    public double calcularValorConta() {
        return consumo * getValorKwh();
    }

    public int getTipoCliente() {
        return tipoCliente;
    }

    public double getConsumo() {
        return consumo;
    }
}

