package br.edu.up.modelos;

public class Ex15 {
    public static void executar() {
        GerenciadorDeTransacoes gerenciador = new GerenciadorDeTransacoes();

        gerenciador.coletarTransacoes();
        gerenciador.exibirResultados();
    }
}