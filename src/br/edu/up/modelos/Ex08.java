package br.edu.up.modelos;

import java.util.Scanner;

public class Ex08 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno: ");
        String nome = leitor.nextLine();
        
        System.out.println("Digite a primeira nota: ");
        double nota1 = leitor.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        double nota2 = leitor.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        double nota3 = leitor.nextDouble();
        
        double media = CalculadoraMediaAluno.calcularMedia(nota1, nota2, nota3);
        String mencao = CalculadoraMediaAluno.determinarMencao(media);
        
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Média: " + media);
        System.out.println("Menção: " + mencao);
    }
}
