package br.edu.up.modelos;

import java.util.Scanner;

public class Ex26 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o nome do pretendente: ");
        String nome = leitor.nextLine();
        
        System.out.println("Digite a idade do pretendente: ");
        int idade = leitor.nextInt();
        
        System.out.println("Digite o grupo de risco do pretendente (baixo, médio, alto): ");
        String grupoRisco = leitor.next().toLowerCase();
        
        String categoria = ClassificadorSeguro.classificarSeguro(nome, idade, grupoRisco);
        
        System.out.println("Dados do pretendente:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Grupo de risco: " + grupoRisco);
        System.out.println("Categoria de seguro: " + categoria);
    }
}