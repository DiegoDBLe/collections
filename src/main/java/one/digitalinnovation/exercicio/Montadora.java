package one.digitalinnovation.exercicio;

public class Montadora implements Comparable<Montadora>{

    private final String nome;
    private final Integer anoFabricao;

    public Montadora(String nome, Integer anoFabricao) {
        this.nome = nome;
        this.anoFabricao = anoFabricao;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAnoFabricao() {
        return anoFabricao;
    }

    @Override
    public String toString() {
        return "Montadora{" +
                "nome='" + nome + '\'' +
                ", anoFabricao=" + anoFabricao +
                '}';
    }

    @Override
    public int compareTo(Montadora o) {
        return this.getAnoFabricao() - o.getAnoFabricao();
    }
}
