package ferreira.debora.introducao.javacore.Zcolecoes.testes;

import ferreira.debora.introducao.javacore.Zcolecoes.classes.Produto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortProdutoTeste {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        Produto produto1 = new Produto("123","Laptop Lenovo", 2000.0);
        Produto produto2 = new Produto("456","Picanha", 26.4);
        Produto produto3 = new Produto("789","Teclado Razer", 1000.0);
        Produto produto4 = new Produto("963","Samsung", 3250.5);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        Collections.sort(produtos);
        for (Produto produto: produtos) {
            System.out.println(produto);
        }
    }
}
