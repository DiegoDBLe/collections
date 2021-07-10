package one.digitalinnovation.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {
        Set<Double> notasAlunos = new HashSet<>();

       //Adiciona nota no set e o HashSet não garante a ordem de inserção. No print consguimos ver que a ordem está diferente da adicionada
        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);

        //Motra todos da lista
        System.out.println(notasAlunos);

        //Remove a nota do set. No caso como Set não tem indice, passa-se como parametro o valor que desejo remover
        notasAlunos.remove(3.8);

        System.out.println(notasAlunos);

        //Retorna a quantidade de itens do set
        System.out.println("Quantidade de itens: " + notasAlunos.size());

        //Navega em todos os itens do iterator
        Iterator<Double> iterator = notasAlunos.iterator();

        while (iterator.hasNext()){
            System.out.println("-----> " + iterator.next());
        }

        //Navega em todos os itens do foreach
        for (Double nota : notasAlunos) {
            System.out.println(nota);

        }

        //Limpa o set
        notasAlunos.clear();

        //Retorna se o set está vazio
        System.out.println("Está vazio? " + notasAlunos.isEmpty());


    }
}
