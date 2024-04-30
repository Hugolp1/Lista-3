package br.edu.up.modelos;

public class Estudante {
    private double notaLaboratorio;
    private double notaSemestral;
    private double notaExameFinal;

    public Estudante(double notaLaboratorio, double notaSemestral, double notaExameFinal) {
        if (notaLaboratorio < 0 || notaLaboratorio > 10 ||
            notaSemestral < 0 || notaSemestral > 10 ||
            notaExameFinal < 0 || notaExameFinal > 10) {
            throw new IllegalArgumentException("As notas devem estar no intervalo de 0 a 10.");
        }

        this.notaLaboratorio = notaLaboratorio;
        this.notaSemestral = notaSemestral;
        this.notaExameFinal = notaExameFinal;
    }

    public double calcularNotaFinal() {
        return (notaLaboratorio * 2 + notaSemestral * 3 + notaExameFinal * 5) / 10;
    }
}

