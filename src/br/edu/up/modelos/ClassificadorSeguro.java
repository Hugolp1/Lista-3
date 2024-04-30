package br.edu.up.modelos;

import java.util.Scanner;

public class ClassificadorSeguro {
    // Método para classificar o pretendente em uma categoria de seguro
    public static String classificarSeguro(String nome, int idade, String grupoRisco) {
        if (idade < 17 || idade > 70) {
            return "O pretendente não se enquadra em nenhuma das categorias ofertadas.";
        }
        
        if (idade >= 17 && idade <= 20) {
            if (grupoRisco.equals("baixo")) {
                return "Categoria 1";
            } else if (grupoRisco.equals("médio")) {
                return "Categoria 2";
            } else {
                return "Categoria 3";
            }
        } else if (idade >= 21 && idade <= 24) {
            if (grupoRisco.equals("médio")) {
                return "Categoria 2";
            } else {
                return "Categoria 3";
            }
        } else if (idade >= 25 && idade <= 34) {
            if (grupoRisco.equals("baixo")) {
                return "Categoria 3";
            } else if (grupoRisco.equals("médio")) {
                return "Categoria 4";
            } else {
                return "Categoria 5";
            }
        } else if (idade >= 35 && idade <= 64) {
            if (grupoRisco.equals("baixo")) {
                return "Categoria 4";
            } else if (grupoRisco.equals("alto")) {
                return "Categoria 6";
            } else {
                return "Categoria 7";
            }
        } else {
            if (grupoRisco.equals("alto")) {
                return "Categoria 9";
            } else {
                return "Categoria 7";
            }
        }
    }
}
