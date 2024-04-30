package br.edu.up.modelos;

import java.util.Scanner;

public class GerenciadorDeColaboradores {
    public void processarColaborador() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do colaborador:");
        String nome = leitor.nextLine();

        System.out.println("Digite a idade do colaborador:");
        int idade = leitor.nextInt();

        System.out.println("Digite o sexo do colaborador (M/F):");
        char sexo = leitor.next().charAt(0);

        System.out.println("Digite o salário fixo do colaborador:");
        double salarioFixo = leitor.nextDouble();

        try {
            Colaborador colaborador = new Colaborador(nome, idade, sexo, salarioFixo);

            double salarioLiquido = colaborador.calcularSalarioLiquido();

            System.out.println("Nome do colaborador: " + colaborador.getNome());
            System.out.println("Salário líquido acrescido do abono: R$" + salarioLiquido);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

