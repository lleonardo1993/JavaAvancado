package Inferencia;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionExemplo {
    public static void main(String[] args) {
        Collection<String> nomes = List.of("Joao", "Paulo", "Pedro", "Leandro");
        System.out.println(nomes);

        List<String> pessoas = Arrays.asList("Joao", "Santos", "Ferreira");
        System.out.println(pessoas);

        //Java 11 usando List e Collection.
    }
}

