package br.edu.up.modelos;

import java.util.Scanner;

public class ClassificadorEstudante {
    // Método para calcular a nota final do estudante
    public static double calcularNotaFinal(double notaLaboratorio, double notaSemestral, double notaExameFinal) {
        return (notaLaboratorio * 2 + notaSemestral * 3 + notaExameFinal * 5) / 10;
    }
    
    // Método para determinar a classificação do estudante com base na nota final
    public static String determinarClassificacao(double notaFinal) {
        if (notaFinal >= 8) {
            return "A";
        } else if (notaFinal >= 7) {
            return "B";
        } else if (notaFinal >= 6) {
            return "C";
        } else if (notaFinal >= 5) {
            return "D";
        } else {
            return "R";
        }
    }
}