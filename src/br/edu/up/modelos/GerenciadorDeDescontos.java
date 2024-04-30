package br.edu.up.modelos;

import java.util.Scanner;

public class GerenciadorDeDescontos {
     private int totalCarrosAte2000;
    private int totalGeral;

    public GerenciadorDeDescontos() {
        totalCarrosAte2000 = 0;
        totalGeral = 0;
    }

    public void executar() {
        Scanner leitor = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o ano do veículo: ");
            int ano = leitor.nextInt();

            System.out.println("Digite o valor do veículo: ");
            double valor = leitor.nextDouble();

            Veiculo veiculo = new Veiculo(ano, valor);

            double desconto = veiculo.calcularDesconto();
            double valorFinal = veiculo.calcularValorFinal();

            System.out.println("Desconto: R$" + desconto);
            System.out.println("Valor a ser pago pelo cliente: R$" + valorFinal);

            if (veiculo.isAte2000()) {
                totalCarrosAte2000++;
            }

            totalGeral++;

            System.out.println("Deseja continuar calculando desconto? (S/N): ");
            String continuar = leitor.next();
            if (!continuar.equalsIgnoreCase("S")) {
                break;
            }
        }

        System.out.println("Total de carros até 2000: " + totalCarrosAte2000);
        System.out.println("Total geral de carros: " + totalGeral);
    }
}


