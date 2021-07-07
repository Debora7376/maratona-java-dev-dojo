package ferreira.debora.introducao.javacore.Zcolecoes.testes;

import ferreira.debora.introducao.javacore.Zcolecoes.classes.Celular;

import java.util.ArrayList;
import java.util.List;

public class ListCelularTeste {
    public static void main(String[] args) {
        Celular celular1 = new Celular("Galaxy s7", "123123");
        Celular celular2 = new Celular("IPhone 6S" ,"789789");
        Celular celular3 = new Celular("Sony Xperia", "456456");
        List<Celular> celularList = new ArrayList<>();
        celularList.add(celular1);
        celularList.add(celular2);
        celularList.add(celular3);

        for (Celular celular : celularList) {
            System.out.println(celular);
        }
        Celular celular4 = new Celular("Galaxy s7", "123123");
        System.out.println(celularList.contains(celular4));
    }
}
