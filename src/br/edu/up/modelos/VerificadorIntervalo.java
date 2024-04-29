package br.edu.up.modelos;

import java.util.Scanner;

public class VerificadorIntervalo {
    public static int verificarQuantidadeNoIntervalo(Scanner leitor) {
        int contador = 0;
        
        for (int i = 1; i <= 80; i++) {
            System.out.println("Digite o " + i + "º número: ");
            int numero = leitor.nextInt();
            
            if (numero >= 10 && numero <= 150) {
                contador++;
            }
        }
        
        return contador;
    }
}
