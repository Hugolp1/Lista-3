package br.edu.up.modelos;

public class Ex02 {
    public static void executar() {
        try {
            Automovel automovel = Automovel.lerDetalhesDoUsuario();
            double consumoMedio = automovel.calcularConsumoMedio();
            System.out.printf("O consumo médio do automóvel é de %.2f km/l.\n", consumoMedio);
        } catch (Exception e) {
            System.out.println("Por favor, insira valores numéricos válidos.");
        }
    }
}
