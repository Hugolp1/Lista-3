package br.edu.up.modelos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorDeProdutos {
    private List<Produtos> produtos;
    private double somaPrecoCusto;
    private double somaPrecoVenda;

    public GerenciadorDeProdutos() {
        produtos = new ArrayList<>();
        somaPrecoCusto = 0;
        somaPrecoVenda = 0;
    }

    public void coletarProdutos(int quantidade) {
        Scanner leitor = new Scanner(System.in);

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("\nDigite os preços do produto " + i + ":");

            System.out.println("Preço de custo: ");
            double precoCusto = leitor.nextDouble();
            somaPrecoCusto += precoCusto;

            System.out.println("Preço de venda: ");
            double precoVenda = leitor.nextDouble();
            somaPrecoVenda += precoVenda;

            Produtos produto = new Produtos(precoCusto, precoVenda);
            produtos.add(produto);

            System.out.println("Produtos " + i + ": " + ((Produtos) produtos).resultado());
        }
    }

    public void exibirMedias() {
        double mediaPrecoCusto = somaPrecoCusto / produtos.size();
        double mediaPrecoVenda = somaPrecoVenda / produtos.size();

        System.out.println("Média de preço de custo: " + mediaPrecoCusto);
        System.out.println("Média de preço de venda: " + mediaPrecoVenda);
    }
}

