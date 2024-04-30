package br.edu.up.modelos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorDeTransacoes {
 private List<TransacaoCombustivel> transacoes;
    private double totalDesconto;
    private double totalPago;

    public GerenciadorDeTransacoes() {
        transacoes = new ArrayList<>();
        totalDesconto = 0;
        totalPago = 0;
    }

    public void coletarTransacoes() {
        Scanner leitor = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o tipo de combustível (álcool, gasolina, diesel) ou 'zero' para encerrar: ");
            String combustivel = leitor.nextLine();

            if (combustivel.equalsIgnoreCase("zero")) {
                break;
            }

            System.out.println("Digite o valor do veículo: ");
            double valorVeiculo = leitor.nextDouble();
            leitor.nextLine(); // Limpar o buffer do scanner

            try {
                TransacaoCombustivel transacao = new TransacaoCombustivel(combustivel, valorVeiculo);
                transacoes.add(transacao);

                totalDesconto += transacao.getDesconto();
                totalPago += transacao.getValorFinal();

                System.out.println("Desconto: R$" + transacao.getDesconto());
                System.out.println("Valor a ser pago pelo cliente: R$" + transacao.getValorFinal());

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                continue;
            }
        }
    }

    public void exibirResultados() {
        System.out.println("Total de desconto: R$" + totalDesconto);
        System.out.println("Total pago pelos clientes: R$" + totalPago);
    }
}

