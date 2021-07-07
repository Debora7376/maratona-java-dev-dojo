package ferreira.debora.introducao.javacore.Zcolecoes.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListTeste {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Tenten");
        nomes.add("Gai");
        nomes.add("Gaara");
        nomes.add("Shino");
        nomes.add("Ino");
        nomes.add(0, "Kiba");
        Collections.sort(nomes);
        List<Double> numeros = new ArrayList<>();
        numeros.add(1.5);
        numeros.add(1.3);
        numeros.add(1.9);
        numeros.add(2d);
        Collections.sort(numeros);
        for (String nome: nomes) {
            System.out.println(nome);
        }
        for (Double numero: numeros) {
            System.out.println(numero);
        }
    }
}
