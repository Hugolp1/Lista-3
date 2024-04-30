package br.edu.up.modelos;

import java.util.Scanner;

public class GerenciadorDeContasDeLuz {
public void processarContaDeLuz() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tipo de cliente:");
        System.out.println("1 - Residência");
        System.out.println("2 - Comércio");
        System.out.println("3 - Indústria");
        int tipoCliente = scanner.nextInt();

        if (tipoCliente < 1 || tipoCliente > 3) {
            System.out.println("Tipo de cliente inválido.");
            return;
        }

        System.out.println("Digite o consumo em kWh:");
        double consumo = scanner.nextDouble();

        try {
            Cliente cliente = new Cliente(tipoCliente, consumo);

            double valorConta = cliente.calcularValorConta();

            System.out.println("O valor da conta de luz é: R$" + valorConta);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

