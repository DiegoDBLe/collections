package one.digitalinnovation.optional;

import java.util.Optional;

public class ExemploOptional {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Valor opcional");

        System.out.println(optionalString.isPresent()); //Tem algo presente ? True, pq tem algo no .of
        System.out.println(optionalString.isEmpty()); //Está vazio? False, pq tem algo no .of

        //Optional tem algo no .of? Se sim, mostre. Se não mostre a outra mensagem ->
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Valor está presente") );



        if(optionalString.isPresent()){
            String valor = optionalString.get();

            System.out.println(valor);
        }
        optionalString.map((valor) -> valor.concat("****")).ifPresent(System.out::println);

        optionalString.orElseThrow(IllegalStateException::new); // Se tiver valor presente ele mostra, se nao tiver ele mostra um exception

    }
}
