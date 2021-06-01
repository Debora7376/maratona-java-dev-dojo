package ferreira.debora.introducao.javacore.Npolimorfismo.testes;

import ferreira.debora.introducao.javacore.Npolimorfismo.classes.ArquivoDAOImpl;
import ferreira.debora.introducao.javacore.Npolimorfismo.classes.GenericDAO;

import java.util.LinkedList;
import java.util.List;

public class DAOTeste {
    public static void main(String[] args) {
        GenericDAO arquivoDAO =  new ArquivoDAOImpl();
        arquivoDAO.save();
        List<String> lista = new LinkedList<>();
        lista.add("nome 1");
        lista.add("nome 2");
        lista.add("nome 3");
        lista.add("nome 4");
        for(String nome : lista){
            System.out.println(nome);
        }
    }
}
