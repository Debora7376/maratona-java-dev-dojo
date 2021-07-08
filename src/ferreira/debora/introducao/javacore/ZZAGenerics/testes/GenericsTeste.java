package ferreira.debora.introducao.javacore.ZZAGenerics.testes;

import ferreira.debora.introducao.javacore.Zcolecoes.classes.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTeste {
    public static void main(String[] args) {
        // type erasure
        List<String> lista = new ArrayList<>();
        lista.add("String");
        lista.add("String");
        lista.add("William Suane");

        for (String obj : lista) {
            System.out.println(obj);
        }
        add(lista, 1L);
    }

    public static void add(List lista, Long l) {
        lista.add(l);
    }
}
