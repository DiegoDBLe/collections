package one.digitalinnovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioList {

    public static void main(String[] args) {
        List<String> namesFive = new ArrayList<>();
        namesFive.add("Juliana");
        namesFive.add("Pedro");
        namesFive.add("Carlos");
        namesFive.add("Larissa");
        namesFive.add("joão");

        for (String namesList : namesFive) {
            System.out.println("name that contains in the list: - " + namesList);
        }

        namesFive.set(2,"Roberto");
        System.out.println(namesFive);

        String posicaoUm = namesFive.get(1);
        System.out.println(posicaoUm);

        namesFive.remove(4);
        System.out.println(namesFive);

        namesFive.remove("joão");
        System.out.println(namesFive);

        int size = namesFive.size();
        System.out.println("Size: " + size);

        boolean contains = namesFive.contains("Juliano");
        System.out.println("Contains name Juliano? " + contains);

        Collections.sort(namesFive);
        System.out.println(namesFive);

        System.out.println("The List is empty? " + namesFive.isEmpty());


    }
}
