package one.digitalinnovation.exercicio_stream;

import java.util.Collection;

public class Estudante implements Comparable<Estudante>{

    private final String nome;
    private final String sexo;
    private final Integer idade;

    public Estudante(String nome, String sexo, Integer idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public int compareTo(Estudante o) {
        return getIdade() - o.getIdade();
    }


}
