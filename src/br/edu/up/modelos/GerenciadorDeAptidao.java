package br.edu.up.modelos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorDeAptidao {
    private int totalAptas;
    private int totalInaptas;
    private List<Candidato> candidatos;

    public GerenciadorDeAptidao() {
        totalAptas = 0;
        totalInaptas = 0;
        candidatos = new ArrayList<>();
    }

    public void coletarInformacoes() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número de pessoas: ");
        int numeroPessoas = leitor.nextInt();

        for (int i = 1; i <= numeroPessoas; i++) {
            System.out.println("\nDigite os dados da pessoa " + i + ":");

            System.out.println("Nome: ");
            String nome = leitor.next();

            System.out.println("Sexo (M para masculino, F para feminino): ");
            char sexo = leitor.next().toUpperCase().charAt(0);

            System.out.println("Idade: ");
            int idade = leitor.nextInt();

            System.out.println("Saúde (A para apto, I para inapto): ");
            char saude = leitor.next().toUpperCase().charAt(0);

            Candidato candidato = new Candidato(nome, sexo, idade, saude);
            candidatos.add(candidato);

            if (candidato.estaApto()) {
                totalAptas++;
            } else {
                totalInaptas++;
            }

            System.out.println(candidato);
        }
    }

    public void exibirTotais() {
        System.out.println("Total de pessoas aptas: " + totalAptas);
        System.out.println("Total de pessoas inaptas: " + totalInaptas);
    }
}

