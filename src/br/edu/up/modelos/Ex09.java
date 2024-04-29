package br.edu.up.modelos;
import java.util.Scanner;

public class Ex09 {
     public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        int quantidadeNoIntervalo = VerificadorIntervalo.verificarQuantidadeNoIntervalo(leitor);
        
        System.out.println("Quantidade de números no intervalo entre 10 e 150: " + quantidadeNoIntervalo);
    }
}
