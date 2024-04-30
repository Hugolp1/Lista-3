package br.edu.up.modelos;

import java.util.Scanner;

public class Ex23 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o nome da pessoa: ");
        String nome = leitor.nextLine();
        
        System.out.print("Digite o sexo da pessoa (M/F): ");
        char sexo = leitor.next().charAt(0);
        
        System.out.println("Digite a altura da pessoa (em metros): ");
        double altura = leitor.nextDouble();
        
        System.out.println("Digite a idade da pessoa: ");
        int idade = leitor.nextInt();
        
        double pesoIdeal = CalculadoraPesoIdeal.calcularPesoIdeal(nome, sexo, altura, idade);
        
        if (pesoIdeal != -1) {
            System.out.println("Nome da pessoa: " + nome);
            System.out.println("Peso ideal: " + pesoIdeal + " kg");
        }
    }
}
