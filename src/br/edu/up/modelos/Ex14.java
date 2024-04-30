package br.edu.up.modelos;

public class Ex14 {
    public static void executar() {
        GerenciadorDeProdutos gerenciador = new GerenciadorDeProdutos();
        int numeroDeProdutos = 40; // Quantidade de produtos a serem processados

        gerenciador.coletarProdutos(numeroDeProdutos);
        gerenciador.exibirMedias();
    }
}