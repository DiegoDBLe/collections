package one.digitalinnovation.optional;

import java.util.Optional;

public class ExemploOptionalEstados {
    public static void main(String[] args) {

        Optional<String> stringOptional = Optional.of("Valor presente");
        System.out.println("Valor opcional está presente"); // Que tem valor no meu of
        stringOptional.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente"));

        Optional<String> optionalNull = Optional.ofNullable(null);
        System.out.println("Valor opcional não está presente");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = não está presente"));

        Optional<String> emptyOptional = Optional.empty();
        System.out.println("Valor opcional não está presente");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = não está presente"));

        Optional<String> optionalNullErro = Optional.of(null);
        optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("erro = não está presente"));

    }
}
