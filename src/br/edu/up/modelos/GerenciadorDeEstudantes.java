package br.edu.up.modelos;

import java.util.Scanner;

public class GerenciadorDeEstudantes {
 public void processarEstudante() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite as notas do estudante:");

        System.out.println("Nota do trabalho de laboratório (0 a 10):");
        double notaLaboratorio = leitor.nextDouble();

        System.out.println("Nota da avaliação semestral (0 a 10):");
        double notaSemestral = leitor.nextDouble();

        System.out.println("Nota do exame final (0 a 10):");
        double notaExameFinal = leitor.nextDouble();

        try {
            Estudante estudante = new Estudante(notaLaboratorio, notaSemestral, notaExameFinal);
            double notaFinal = estudante.calcularNotaFinal();

            System.out.println("A nota final do estudante é: " + notaFinal);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

