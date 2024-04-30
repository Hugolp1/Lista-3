package br.edu.up.modelos;

import java.util.Scanner;

public class GerenciadorDeTriangulos {
public void processarTriangulo() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite os valores dos três lados do triângulo:");
        int lado1 = leitor.nextInt();
        int lado2 = leitor.nextInt();
        int lado3 = leitor.nextInt();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

        if (triangulo.eTrianguloValido()) {
            System.out.println("Os lados formam um " + triangulo.determinarTipo() + ".");
        } else {
            System.out.println("Os valores não podem formar um triângulo.");
        }
    }
}

