package br.edu.up.modelos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorDeReajustes {
    private List<Funcionario> funcionarios;
    private double custoReajuste;

    public GerenciadorDeReajustes(int numFuncionarios) {
        funcionarios = new ArrayList<>(numFuncionarios);
        custoReajuste = 0.0;
    }

    public void coletarSalarios() {
        Scanner leitor = new Scanner(System.in);

        for (int i = 1; i <= funcionarios.size(); i++) {
            System.out.println("Digite o salário do funcionário " + i + " em reais:");
            double salario = leitor.nextDouble();

            Funcionario funcionario = new Funcionario(salario);
            funcionarios.add(funcionario);

            double reajuste = funcionario.calcularReajuste();
            custoReajuste += reajuste;

            System.out.println("O funcionário " + i + " receberá um reajuste de R$" + reajuste);
        }
    }

    public void exibirCustoReajuste() {
        System.out.println("Custo total do reajuste para todos os funcionários: R$" + custoReajuste);
    }
}

