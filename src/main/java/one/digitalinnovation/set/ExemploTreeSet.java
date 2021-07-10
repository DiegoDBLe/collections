package one.digitalinnovation.set;

import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeCapitais = new TreeSet<>();

        //Montar a Arvore com as capitais
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Fortaleza");
        treeCapitais.add("Salvador");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Natal");
        treeCapitais.add("João Pessoa");

        System.out.println(treeCapitais);

        //Retornar a primeira capital no topo da arvore no caso a ultima a ser adicionada
        System.out.println("Qual a primeira capital da arvore: " + treeCapitais.first());

        // Retorna a ultima capital no final da arvore
        System.out.println("Qual a ultima capital da arvore: " + treeCapitais.last());

        //Retorna a primeira capital abaixo na arvore da capital passada por parametro:
        System.out.println("Capital abaixo da Porto Alegre qual é na arvore?: " + treeCapitais.lower("Porto Alegre"));

        //Retorna a primeira capital acima na arvore da capital passada por parametro:
        System.out.println("Primeira capital acima de Natal na arvore?: " + treeCapitais.higher("Natal"));

        //Exibe todas as capitais da arvore no console
        System.out.println(treeCapitais);

        //Retorna a primeira capital no topo da arvore, revovendo do set
        System.out.println(treeCapitais.pollFirst());

        //Retorna a primeira capital no final da arvore, revovendo do set
        System.out.println(treeCapitais.pollLast());

        //Exibe todas as capitais da arvore no console
        System.out.println(treeCapitais);



    }
}
