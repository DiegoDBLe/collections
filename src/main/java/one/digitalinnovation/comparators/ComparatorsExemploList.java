package one.digitalinnovation.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExemploList {
    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Pedro",19));
        estudantes.add(new Estudante("Carlos",23));
        estudantes.add(new Estudante("Mariana",21));
        estudantes.add(new Estudante("João",18));
        estudantes.add(new Estudante("Thiago",20));
        estudantes.add(new Estudante("George",22));
        estudantes.add(new Estudante("Larissa",21));

        System.out.println("------->Ordem de Inserção<-------");
        System.out.println(estudantes);

        estudantes.sort((first,second) -> first.getIdade() - second.getIdade()); //Sintaxe lambda:Ordem crescente dos numeros (idade)

        System.out.println("------->Ordem natural dos numeros - idade<-------"); //Ordem crescente dos numeros (idade)
        System.out.println(estudantes);

        estudantes.sort((first,second) -> second.getIdade() - first.getIdade());//Sintaxe lambda:Ordem decrescente dos numeros (idade)

        System.out.println("------->Ordem reserva dos numeros - idade <-------");//Ordem decrescente dos numeros (idade)
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));

        System.out.println("------->Ordem natural dos numeros - idade <-------(método reference)");
        System.out.println(estudantes);

        //------>Ordem reversa dos numeros - idade <-------(método reference)
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());//Pode ser feito tanto com sintaxe lambda como com referencia de métodos

        System.out.println("------->Ordem reversa dos numeros - idade <-------(método reference)");
        System.out.println(estudantes);

        //Ordem natural dos numeros - idade <-------(interface Comparable)
        Collections.sort(estudantes);

        System.out.println("------->Ordem natural dos numeros - idade <-------(interface Comparable)");
        System.out.println(estudantes);

        //Ordem reversa dos numeros - idade <-------(interface Comparator
        Collections.sort(estudantes, new EstudanteOrdemIdadeReversaComparator());

        System.out.println("------->Ordem reversa dos numeros - idade <-------(interface Comparator)");
        System.out.println(estudantes);





    }
}
