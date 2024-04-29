package br.edu.up.modelos;

public class CalculadoraMediaAluno {
    public static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }
    
    public static String determinarMencao(double media) {
        if (media >= 7.0) {
            return "Aprovado";
        } else if (media < 5.0) {
            return "Reprovado";
        } else {
            return "Recuperação";
        }
    }
}
