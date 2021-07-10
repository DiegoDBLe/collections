package one.digitalinnovation.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {
    public static void main(String[] args) {

        //Montando a Arvore: ordem é da esquerda para direita ou seja abaixo é pro lado esquerdo e acima lado direito
        TreeMap<String,String> treeMapCapitais = new TreeMap<>();
        treeMapCapitais.put("SP","São Paulo");
        treeMapCapitais.put("CE","Fortaleza");
        treeMapCapitais.put("RN","Natal");
        treeMapCapitais.put("PB","João Pessoa");
        treeMapCapitais.put("RJ","Rio de Janeiro");
        treeMapCapitais.put("AL","Maceio");

        System.out.println("Montando a Arvore: " + treeMapCapitais);
        System.out.println(" Abaixo <------" + "   " + " Acima ------>>");

        //Retorna a primeira capital no topo da arvore
        System.out.println("Retorna a primeira capital no topo da arvore: " + treeMapCapitais.firstKey());

        //Retorna a ultima capital no final da arvore
        System.out.println("Retorna a ultima capital no final da arvore: " + treeMapCapitais.lastKey());

        //Retorna a primeira capital abaixo da passada em paramentro
        System.out.println("Retorna a primeira capital abaixo da passada em paramentro: "+ treeMapCapitais.lowerKey("CE"));

        //Retorna a primeira capital acima da passada em parametro
        System.out.println("Retorna a primeira capital acima da passada em parametro: " + treeMapCapitais.higherKey("RJ"));

        System.out.println(treeMapCapitais);

        //Retorna a primeira capital no topo da arvore
        System.out.println("Retorna a primeira capital no topo da arvore: " + treeMapCapitais.firstEntry().getKey() + " ----> " + treeMapCapitais.firstEntry().getValue());

        //Retorna a ultima capital no final da arvore
        System.out.println("Retorna a ultima capital no final da arvore: " + treeMapCapitais.lastEntry().getKey() + " ----> " + treeMapCapitais.lastEntry().getValue());

        //Retorna a primeira capital abaixo da passada em paramentro
        System.out.println("Retorna a primeira capital abaixo da passada em paramentro: " + treeMapCapitais.lowerEntry("CE").getKey() + " ----> " + treeMapCapitais.lowerEntry("CE") );

        //Retorna a primeira capital acima da passada em parametro
        System.out.println("Retorna a primeira capital acima da passada em parametro: " + treeMapCapitais.higherEntry("RJ").getKey() + " ----> " + treeMapCapitais.higherEntry("RJ") );

        System.out.println(treeMapCapitais);

        //Retorna a primeira capital no topo da arvore, removendo do Map
        Map.Entry<String, String> firstEntry = treeMapCapitais.pollFirstEntry();
        System.out.println(firstEntry.getKey() + " - " + firstEntry.getValue());

        //Retorna a ultima capital no final da arvore, removendo do Map
        Map.Entry<String,String> lastEntry = treeMapCapitais.pollLastEntry();
        System.out.println(lastEntry.getKey() + " - " + lastEntry.getValue());

        System.out.println(treeMapCapitais);

        //Navegas em todas as chaves do iterator
        Iterator<String> iterator = treeMapCapitais.keySet().iterator();

        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key + " - " + treeMapCapitais.get(key));
        }

        for (String capital: treeMapCapitais.keySet()) {
            System.out.println(capital + " ---> " + treeMapCapitais.get(capital));
         }

        for (Map.Entry<String,String> capital :treeMapCapitais.entrySet()) {
            System.out.println(capital.getKey() + " ====> " + capital.getValue());
        }


    }

}
