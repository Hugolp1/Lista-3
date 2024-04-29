package br.edu.up.modelos;

import java.util.Scanner;

public class Ex10 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o número de pessoas: ");
        int numeroPessoas = leitor.nextInt();
        
        VerificadorIdade.verificarMaioridade(leitor, numeroPessoas);
    }
}
