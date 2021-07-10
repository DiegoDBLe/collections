package one.digitalinnovation.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {

    public static void main(String[] args) {

        Map<String,Integer> campeosMundialFifa = new HashMap<>();

        //Adiciona os Campeões mundiais no Map
        campeosMundialFifa.put("Brasil",5);
        campeosMundialFifa.put("Alemanha",4);
        campeosMundialFifa.put("Italia",4);
        campeosMundialFifa.put("Uruguai",2);
        campeosMundialFifa.put("Argentina",2);
        campeosMundialFifa.put("França",2);
        campeosMundialFifa.put("Inglaterra",1);
        campeosMundialFifa.put("Espanha",1);

        System.out.println("Campeoes Mundiais Fifa: " + campeosMundialFifa);

        //Atualiza o valor para a chave Brasil
        campeosMundialFifa.put("Brasil",6);

        System.out.println("Atualizando: " + campeosMundialFifa);

        //Retorna o valor do parametro Argentina. No exemplo retorna quantos vezes argentina foi campeã
        System.out.println("Mostrando quantos titulos Argentina tem?: " + campeosMundialFifa.get("Argentina"));

        //Retorna se existe um campão mundial chamado França
        System.out.println("Contém a seleção da França?: " + campeosMundialFifa.containsKey("França"));

        // Remova a França
        campeosMundialFifa.remove("França");

        System.out.println(campeosMundialFifa);

        //Retorna se existe um campão mundial chamado França
        System.out.println("França ainda está no Map? " + campeosMundialFifa.containsKey("França"));

        //Retorna se existe ou não alguma seleção hexe campeã
        System.out.println("Existe alguma seleção Hexacampão?: " + campeosMundialFifa.containsValue(6));

        // Retorna o tamanho do Map
        System.out.println("Tamanho do Map: " + campeosMundialFifa.size());

        //Navegar nos registros do Map
        for (Map.Entry<String,Integer> entry : campeosMundialFifa.entrySet()){
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }

        //Outra forma de Navegar nos registros do Map
        for(String key : campeosMundialFifa.keySet()){
            System.out.println(key + " =====> " + campeosMundialFifa.get(key));
        }

        System.out.println(campeosMundialFifa);

        //Verifica se contem a Key Estados Unidos está no Map
        System.out.println(campeosMundialFifa.containsKey("Estados Unidos"));

        //Verifica se o mapa contem o valor 5
        System.out.println(campeosMundialFifa.containsKey(5));

    }
}
