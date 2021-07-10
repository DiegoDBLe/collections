package one.digitalinnovation.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

    public static void main(String[] args) {
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        // Adicionando os numeros no set. Ordem de inserção mantida
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);

        System.out.println(sequenciaNumerica);

        //Remove o numero do set
        sequenciaNumerica.remove(4);

        System.out.println(sequenciaNumerica);

        //Retorna a quantidade de itens do set
        System.out.println("Quantidade de itens: " + sequenciaNumerica.size());

        //Navega em todos os itens
        Iterator<Integer> iterator = sequenciaNumerica.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (Integer sequencia: sequenciaNumerica) {
            System.out.println(sequencia);

        }

        //Retorna se está vazio
        System.out.println("Está vazio?: " + sequenciaNumerica.isEmpty());


    }
}
