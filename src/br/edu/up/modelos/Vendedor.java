package br.edu.up.modelos;

import java.util.Scanner;

public class Vendedor {
    String nome;
    double salarioFixo;
    double totalVendas;

    public Vendedor(String nome, double salarioFixo, double totalVendas) {
        this.nome = nome;
        this.salarioFixo = salarioFixo;
        this.totalVendas = totalVendas;
    }

    public double calcularSalarioFinal() {
        double comissao = totalVendas * 0.15;
        return salarioFixo + comissao;
    }

    public static Vendedor lerDetalhesDoUsuario() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o nome do vendedor: ");
        String nome = leitor.nextLine();

        System.out.println("Digite o salário fixo do vendedor: ");
        double salarioFixo = leitor.nextDouble();

        System.out.println("Digite o total de vendas efetuadas no mês: ");
        double totalVendas = leitor.nextDouble();

        return new Vendedor(nome, salarioFixo, totalVendas);
    }
}
