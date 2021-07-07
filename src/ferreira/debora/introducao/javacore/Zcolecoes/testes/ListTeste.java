package ferreira.debora.introducao.javacore.Zcolecoes.testes;

import java.util.ArrayList;
import java.util.List;

public class ListTeste {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();
        nomes.add("Debora");
        nomes.add("Naruto");
        nomes2.add("Neji");
        nomes2.add("Jiraya");
//        System.out.println("size: " + nomes.size());
//        System.out.println(nomes.remove("Naruto"));
//        System.out.println("size: " + nomes.size());

        nomes.addAll(nomes2);
        int size = nomes.size();
        for (int i = 0; i < size; i++) {
            System.out.println(nomes.get(1));
        }
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        for (Integer num:numeros) {
            System.out.println(num);
        }
    }
}