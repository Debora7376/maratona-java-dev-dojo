package ferreira.debora.introducao.javacore.Zcolecoes.classes;

import java.util.Comparator;

public interface Produtos extends Comparator<Produto> {
    @Override
    int compare(Produto o1, Produto o2);

    @Override
    boolean equals(Object o);

    @Override
    int hashCode();

    @Override
    String toString();

    String getSerialNumber();

    void setSerialNumber(String serialNumber);

    String getNome();

    void setNome(String nome);

    Double getPreco();

    void setPreco(Double preco);

    int compareTo(Produto outroObjeto);
}
