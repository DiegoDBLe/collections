package one.digitalinnovation.exercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExercicioComparable {
    public static void main(String[] args) {

        List<Montadora> carros = new ArrayList<>();

        carros.add(new Montadora("Ford",2010));
        carros.add(new Montadora("GM",2012));
        carros.add(new Montadora("Honda",2019));
        carros.add(new Montadora("Fiat",2021));
        carros.add(new Montadora("VW",2009));
        carros.add(new Montadora("Peugeot",2006));
        carros.add(new Montadora("Toyota",2014));

        System.out.println("-------> Ordem de Inserção <-------");
        System.out.println(carros);
        System.out.println(" ");

        System.out.println("-------> Ordem Natural das Montadoras (Ordem Crescente do ano) <-------");
        carros.sort((first,second) -> first.getAnoFabricao() - second.getAnoFabricao());
        System.out.println(carros);
        System.out.println(" ");

        System.out.println("------->Ordem reversa das montadoras - ano (Ordem Decrescente do ano) <-------");
        carros.sort((first,second) -> second.getAnoFabricao() - first.getAnoFabricao());
        System.out.println(carros);
        System.out.println(" ");

        System.out.println("------->Ordem reversa das montadoras - ano <-------(método referenceTeste)");
        System.out.println(carros);
        carros.sort(Comparator.comparingInt(Montadora::getAnoFabricao));
        System.out.println(" ");

        System.out.println("------->Ordem natural das montadoras - ano <-------(método reference)");
        System.out.println(carros);
        carros.sort((Comparator.comparingInt(Montadora::getAnoFabricao)));
        System.out.println(" ");

        System.out.println("------->Ordem reversa das montadoras - ano <-------(interface Comparable)");
        System.out.println(carros);
        Collections.sort(carros);
        System.out.println(" ");

        System.out.println("------->Ordem natural ddas montadoras - ano <-------(interface Comparator)");
        System.out.println(carros);
        carros.sort(new MontadoraOrdemAnoReversaComparator());




    }
}
