package br.edu.up.modelos;

import java.util.Scanner;

public class Ex01{
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno: ");
        String nome = leitor.nextLine();
        
        System.out.println("Digite a nota da primeira prova: ");
        double nota1 = leitor.nextDouble();
        
        System.out.println("Digite a nota da segunda prova: ");
        double nota2 = leitor.nextDouble();
        
        System.out.println("Digite a nota da terceira prova: ");
        double nota3 = leitor.nextDouble();
        
        Aluno aluno = new Aluno(nome, nota1, nota2, nota3);
        double media = aluno.calcularMedia();
        
        System.out.println("Aluno: " + nome);
        System.out.println("Média: " + media);
    }
}
