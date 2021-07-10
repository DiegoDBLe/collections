package one.digitalinnovation.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class ExemploStreamAPI {
    public static void main(String[] args) {

        //Criar uma coleção de estudantes
        List<String> estudantes = new ArrayList<>();

        //Adicionar os estudantes na coleção
        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thyago");
        estudantes.add("Rafel");

        //Retorna a contagem dos elementos do stream
        System.out.println("Contagem do elementos: " + estudantes.stream().count());

        //Retorna o elemento com maior numero de letras
        System.out.println("Maior numero de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));

        //Retorna o elemento com menor numero de letra
        System.out.println("Menor numero de letra: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

        //Retorne os elementos que tem a letrea R no nome
        System.out.println("Somente com a letra R no nome: " + estudantes.stream().filter((estudante) -> estudante.toLowerCase().contains("R"))
                .collect(Collectors.toList()));

        //Retorna uma nova coleção, com os nomes concatenados a quantidade de letras de cada nome
        System.out.println("Retorna uma coleção com a quantidade de letras: " + estudantes.stream().map(estudante ->
                estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        //Retorna os 3 primeiros elementos da coleção
        System.out.println("Retorna os 3 primeiros elementos da coleção" + estudantes.stream().limit(3).collect(Collectors.toList()));

        //Exibe cada elemento no console, e depois retorna a mesma coleção
        System.out.println("Retorna os elementos: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        //Exibe cada elemento no console sem retornar outra coleção
        estudantes.forEach(System.out::println);

        //Retorna True se todos os elementos possuem a letra W no nome//Nesse caso so retorna true se todos os nomes tivesse w, se so um tiver ele retorna false
        System.out.println("Tem alguma elemento com W no nome?: " + estudantes.stream().allMatch((elemento) -> elemento.contains("W")));

        //Retorna true se algum dos elementos possuem a letra minuscula no nome//Esse é ao contrario do allMatch se um for true ele retorna true
        System.out.println("tem algum elemento com a letra minuscula no nome? " + estudantes.stream().anyMatch((elemento) -> elemento.contains("a")));

        //Retorna true se nenhum elemento possue a letra minuscula no nomeEsse é ao contrario do anyMatch se um for false ele retorna false para todas
        System.out.println("Não tem nenhum elemento com a letra minusca no nome: " +estudantes.stream().noneMatch((elemento) -> elemento.contains("a")) );


        //Retorna o primeiro elemento da coleção, se existir exibe no console
        System.out.println("Retorna o primeiro elemento da coleção");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        //Exemplo de opração encadeada
        System.out.println("Opração encadeada: ");
        System.out.println(estudantes.stream().peek(System.out::println)//Mostra o nome
                .map(estudante -> //vai concatenar o lenght
                        estudante.concat(" - ").concat(String.valueOf(estudante.length())))
        .peek(System.out::println)//Mostrar a alteração nome
                .filter((estudante) -> //Filtro pra saber se tem r no nome ou nao
                        estudante.toLowerCase().contains("r"))
                .collect(Collectors.toList())); //Coleciona






    }
}
