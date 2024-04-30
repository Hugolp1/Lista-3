package br.edu.up.modelos;

public class Professor {
    private int horasAula;
    private int nivel;
    private double valorHoraAula;

    public Professor(int horasAula, int nivel) {
        this.horasAula = horasAula;
        this.nivel = nivel;
        definirValorHoraAula();
    }

    private void definirValorHoraAula() {
        switch (nivel) {
            case 1:
                valorHoraAula = 12.00;
                break;
            case 2:
                valorHoraAula = 17.00;
                break;
            case 3:
                valorHoraAula = 25.00;
                break;
            default:
                throw new IllegalArgumentException("Nível de professor inválido: " + nivel);
        }
    }

    public double calcularSalario() {
        return horasAula * valorHoraAula;
    }
}


