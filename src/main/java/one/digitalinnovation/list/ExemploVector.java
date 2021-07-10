package one.digitalinnovation.list;

import java.util.List;
import java.util.Vector;

public class ExemploVector {

    public static void main(String[] args) {

        List<String> esportes = new Vector<>();

        //Adicionando 4 esportes na lista
        esportes.add("Futebol");
        esportes.add("BasqueteBol");
        esportes.add("Tênis de Mesa");
        esportes.add("Handbol");

        System.out.println(esportes);

        // Alterar o esporte na posição 2
        esportes.set(2,"Ping Pong");

        System.out.println(esportes);

        //Remover o esporte no indice 2
        esportes.remove(2);

        System.out.println(esportes);

        //Remover o Handbol
        esportes.remove("Handbol");

        System.out.println(esportes);

        //Retorna o primeiro item do vetor
        System.out.println(esportes.get(0));

        //Navegar nos esportes
        for (String esporte : esportes ) {
            System.out.println("----> " + esporte);
         }

    }
}
