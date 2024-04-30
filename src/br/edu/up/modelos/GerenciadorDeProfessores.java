package br.edu.up.modelos;

import java.util.Scanner;

public class GerenciadorDeProfessores {
 public void processarProfessor() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número de horas/aula trabalhadas:");
        int horasAula = leitor.nextInt();

        System.out.println("Digite o nível do professor (1, 2 ou 3):");
        int nivel = leitor.nextInt();

        try {
            Professor professor = new Professor(horasAula, nivel);

            double salario = professor.calcularSalario();

            System.out.println("O salário do professor é: R$" + salario);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

