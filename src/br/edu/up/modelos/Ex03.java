package br.edu.up.modelos;

public class Ex03 {
    public static void executar() {
        try {
            Vendedor vendedor = Vendedor.lerDetalhesDoUsuario();
            double salarioFinal = vendedor.calcularSalarioFinal();
            
            System.out.println("Nome do vendedor: " + vendedor.nome);
            System.out.println("Salário fixo: R$ " + vendedor.salarioFixo);
            System.out.println("Salário no final do mês: R$ " + salarioFinal);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro. Certifique-se de digitar valores válidos.");
        }
    }
}
