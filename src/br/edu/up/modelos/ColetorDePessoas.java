package br.edu.up.modelos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColetorDePessoas {
    private List<Pessoa> pessoas;
    private int totalHomens;
    private int totalMulheres;

    public ColetorDePessoas() {
        pessoas = new ArrayList<>();
        totalHomens = 0;
        totalMulheres = 0;
    }

    public void coletarInformacoes() {
        Scanner leitor = new Scanner(System.in);

        for (int i = 1; i <= 56; i++) {
            System.out.println("Digite o nome da pessoa " + i + ": ");
            String nome = leitor.nextLine();

            System.out.println("Digite o sexo da pessoa " + i + " (M para masculino, F para feminino): ");
            char sexo = leitor.nextLine().toUpperCase().charAt(0);

            if (sexo == 'M' || sexo == 'F') {
                Pessoa pessoa = new Pessoa(nome, sexo);
                pessoas.add(pessoa);
                System.out.println(pessoa);

                if (sexo == 'M') {
                    totalHomens++;
                } else {
                    totalMulheres++;
                }
            } else {
                System.out.println("Sexo inválido. Por favor, tente novamente.");
                i--; // Volta uma iteração para refazer
            }
        }
    }

    public void exibirTotais() {
        System.out.println("Total de homens: " + totalHomens);
        System.out.println("Total de mulheres: " + totalMulheres);
    }
}
