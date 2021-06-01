package ferreira.debora.introducao.javacore.Minterfaces.testes;

import ferreira.debora.introducao.javacore.Minterfaces.classes.Produto;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 4, 3000);
        produto.calculaImposto();
        produto.calculaFrete();
        System.out.println(produto);
    }
}
