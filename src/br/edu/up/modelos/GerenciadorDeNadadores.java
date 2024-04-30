package br.edu.up.modelos;

import java.util.Scanner;

public class GerenciadorDeNadadores {
 public void processarNadador() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a idade do nadador:");
        int idade = leitor.nextInt();

        Nadador nadador = new Nadador(idade);

        System.out.println("Categoria do nadador: " + nadador.determinarCategoria());
    }
}

