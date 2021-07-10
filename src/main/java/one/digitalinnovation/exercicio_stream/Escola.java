package one.digitalinnovation.exercicio_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.Locale;

public class Escola {
    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Pedro","Masculilno",17));
        estudantes.add(new Estudante("Thayse","Feminino",19));
        estudantes.add(new Estudante("Marcelo","Masculino",22));
        estudantes.add(new Estudante("Carla","Feminino",21));
        estudantes.add(new Estudante("Juliana","Feminino",23));
        estudantes.add(new Estudante("Thyago","Masculino",24));
        estudantes.add(new Estudante("Rafel","Masculino",18));

        //Assim ou assim:  + estudantes.stream().count());
        System.out.println("Quantidade de Estudantes na escola: " + (long) estudantes.size());

        System.out.println(" ");
        //Alunos Maiores de idade
        System.out.println("Somente os alunos maiores de Idade: " +
         estudantes.stream().filter(estudante -> estudante.getIdade() >= 18.)
                .collect(Collectors.toList()));

        //Exiba cada elemento no console
        System.out.println(" ");
        System.out.println("Todos os Estudantes da Escola: ");
        estudantes.forEach(System.out::println);

        //Retornar estudantes que o nome possui a letra B
        System.out.println("Estudantes que possui a letra B no nome: " +estudantes.stream().filter((estudante) -> estudante
                .toString().toLowerCase().contains("b"))
                .collect(Collectors.toList()));

        //Tem alguma estudante com a letra D ?:
        System.out.println("Tem algum estudante que comece com a letra D ou possui letra D no nome? : " + estudantes.stream()
                .allMatch((letraD) -> letraD.toString().contains("D")));

        //
    }


}
