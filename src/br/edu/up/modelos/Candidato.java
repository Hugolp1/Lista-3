package br.edu.up.modelos;

public class Candidato {
    private String nome;
    private char sexo;
    private int idade;
    private char saude;

    public Candidato(String nome, char sexo, int idade, char saude) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.saude = saude;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }

    public char getSaude() {
        return saude;
    }

    public boolean estaApto() {
        if (sexo == 'M' && idade >= 18 && saude == 'A') {
            return true;
        } else if (sexo == 'F' && idade >= 18 && idade <= 45 && saude == 'A') {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return nome + (estaApto() ? " está apto para o serviço militar obrigatório." : " não está apto para o serviço militar obrigatório.");
    }
}


