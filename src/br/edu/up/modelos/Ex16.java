package br.edu.up.modelos;

public class Ex16 {
    public static void executar() {
        int numFuncionarios = 584;

        GerenciadorDeReajustes gerenciador = new GerenciadorDeReajustes(numFuncionarios);
        gerenciador.coletarSalarios();
        gerenciador.exibirCustoReajuste();
    }
}
