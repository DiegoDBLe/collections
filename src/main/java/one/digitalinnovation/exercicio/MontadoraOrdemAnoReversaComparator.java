package one.digitalinnovation.exercicio;

import java.util.Comparator;

public class MontadoraOrdemAnoReversaComparator implements Comparator<Montadora> {

    @Override
    public int compare(Montadora o1, Montadora o2) {
        return o1.getAnoFabricao() - o2.getAnoFabricao();
    }
}
