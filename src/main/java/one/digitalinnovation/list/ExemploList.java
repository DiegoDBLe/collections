package one.digitalinnovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {

        //Criando uma lista de nomes simples
        List<String> nomes = new ArrayList<>();
        nomes.add("Diego");
        nomes.add("Levi");
        nomes.add("Thyci");
        nomes.add("Max");
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carlos");

        System.out.println(nomes);

        //Coloca os nomes em ordem alfabetica
        Collections.sort(nomes);

        System.out.println(nomes);

        //Método set() recebe o indice e o elemente novo. Ou seja mudar o nome na posição 1 "Bruno" para "Bruna"
        nomes.set(1,"Bruna");

        System.out.println(nomes);

        //Método remove(index); remove o elemento do indice que passarmos nos () neste exemplo vai remover o nome Bruna
        nomes.remove(1);

        System.out.println(nomes);

        //Método remove(objeto); remove o elemento neste exemplo vai remover o nome Carlos que passamos
        nomes.remove("Carlos");
        System.out.println(nomes);

        //Método get();; recebe um indice para mostrar qual o valor daquele indice. Cria-se uma variavel para retornar o valor
        //Nesse exemplo vai mostrar o nome Diego
        String nome = nomes.get(1);
        System.out.println(nome);

        //Método size(); Mostra quantos elementos tem minha lista, cria-se uma variavel int para armazenar o valor
        int tamanho = nomes.size();

        System.out.println(tamanho);

        //Método contains("Diego"); retorna um boolean e verifica se tem o elemento passado na lista. Neste exemplo se tem o Diego
        boolean temSim = nomes.contains("Diego");

        System.out.println(temSim);

        //Método isEmpty(); não recebe parametro e retorna boolean. Se a lista está vazia
        boolean listaVazia = nomes.isEmpty();

        System.out.println(listaVazia);

        //Método indexOf("Levi"); Mostra a posição do elemento passado no parametro. Neste exemplo Levi: indice 2
        //Se for passado no parametro um elemento que não consta na lista ele retorna posição de indice -1
        int indice = nomes.indexOf("Levi");

        System.out.println(indice);

        //Método Foreach recebe string e o tipo da lista, nome : nome da lista. vai interagir com todos os elementos da lista
        for (String nomesDaLinha: nomes) {

            System.out.println("--> " + nomesDaLinha);
        }

        //Método Iterator; mesma coisa do foreach, faz a intereção atraves do método hasNext() e para imprimir é o .next()
        //É o mais usado no java
        Iterator<String> interator = nomes.iterator();

        while (interator.hasNext()){
            System.out.println("------> " + interator.next());
        }


        //Esvaziar a lista
        nomes.clear();

        //Método isEmpty(); não recebe parametro e retorna boolean. Se a lista está vazia
        boolean listaVazia1 = nomes.isEmpty();

        System.out.println("List is empty? " + listaVazia1);

    }
}
