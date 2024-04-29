package br.edu.up.modelos;
import java.util.Scanner;

public class Automovel {
    private double distanciaTotalPercorrida;
    private double totalCombustivelGasto;

    public Automovel(double distanciaTotalPercorrida, double totalCombustivelGasto) {
        this.distanciaTotalPercorrida = distanciaTotalPercorrida;
        this.totalCombustivelGasto = totalCombustivelGasto;
    }

    public double calcularConsumoMedio() {
        if (totalCombustivelGasto == 0) {
            throw new ArithmeticException("Divisão por zero. O total de combustível gasto não pode ser zero.");
        }
        return distanciaTotalPercorrida / totalCombustivelGasto;
    }

    public static Automovel lerDetalhesDoUsuario() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a distância total percorrida (em km): ");
        double distanciaTotalPercorrida = leitor.nextDouble();

        System.out.println("Digite o total de combustível gasto (em litros): ");
        double totalCombustivelGasto = leitor.nextDouble();

        return new Automovel(distanciaTotalPercorrida, totalCombustivelGasto);
    }
}

