package br.edu.up.modelos;

import java.util.Scanner;

public class GerenciadorDeEmpregados {
 public void processarEmpregado() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do empregado: ");
        String nomeEmpregado = leitor.nextLine();

        System.out.println("Digite o salário do empregado em reais: ");
        double salarioEmpregado = leitor.nextDouble();

        System.out.println("Digite o valor do salário mínimo em reais: ");
        double salarioMinimo = leitor.nextDouble();

        Empregado empregado = new Empregado(nomeEmpregado, salarioEmpregado, salarioMinimo);

        double reajuste = empregado.calcularReajuste();
        double novoSalario = empregado.getNovoSalario();

        System.out.println("Nome do empregado: " + empregado.getNome());
        System.out.println("Reajuste: R$" + reajuste);
        System.out.println("Novo salário: R$" + novoSalario);

        System.out.println("A empresa aumentará sua folha de pagamento em R$" + reajuste);
    }
}

