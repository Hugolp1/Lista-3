package br.edu.up.modelos;

import java.util.Scanner;

public class VerificadorIdade {
    public static void verificarMaioridade(Scanner leitor, int numeroPessoas) {
        for (int i = 1; i <= numeroPessoas; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = leitor.nextInt();
            
            if (idade >= 18) {
                System.out.println("Pessoa " + i + " é maior de idade.");
            } else {
                System.out.println("Pessoa " + i + " é menor de idade.");
            }
        }
    }
}   
