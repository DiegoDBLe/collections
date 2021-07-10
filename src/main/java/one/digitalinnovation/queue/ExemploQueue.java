package one.digitalinnovation.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {

    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();
        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println("---> " + filaBanco);

        //Método poll(); mostra o primeiro elemento da fila e remove da fila. Neste exemplo Patricia
        String clienteASerAtendido = filaBanco.poll();

        System.out.println(clienteASerAtendido);

        //Mostrando que Patricia não faz mais parte da fila
        System.out.println("---> " + filaBanco);

        //Método peek(); mostra o primeiro elemento da lista e não remove o elemento da fila. Porém se a fila estiver vazia o retorno é null
        String primeiroElemento = filaBanco.peek();
        System.out.println(primeiroElemento);

        //Confirmando que o elemento não foi removido da fila.
        System.out.println("---> " + filaBanco);

////      // Mesma coisa do peek(); ele mostra o elemento porém não remove da file, se a fila estiver vazia mostra uma exception
//        String primeiroClienteOuErro = filaBanco.element();
//        System.out.println(primeiroClienteOuErro);
//
//        System.out.println("---> " + filaBanco);

        //filaBanco.clear();

        System.out.println("A file está vazia? " +  filaBanco.isEmpty());

//      //Mostrando a exceptio pois a fila está vazia
        String primeiroClienteOuErro = filaBanco.element();
        System.out.println(primeiroClienteOuErro);

        System.out.println("---> " + filaBanco);

        for (String cliente: filaBanco) {
            System.out.println(cliente);
        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();

        while (iteratorFilaBanco.hasNext()){
            System.out.println("-----> " + iteratorFilaBanco.next());
        }

        System.out.println("Tamanho da fila: " + filaBanco.size());



    }
}
