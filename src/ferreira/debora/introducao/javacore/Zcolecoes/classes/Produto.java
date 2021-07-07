package ferreira.debora.introducao.javacore.Zcolecoes.classes;

public class Produto implements Comparable<Produto> {

    private String serialNumber;
    private String nome;
    private Double preco;

    public Produto(String serialNumber, String nome, double preco) {
        this.serialNumber = serialNumber;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return serialNumber != null ? serialNumber .equals(produto.serialNumber) : produto.serialNumber == null;
    }

    @Override
    public int hashCode() {
        return serialNumber != null ? serialNumber.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "serialNumber='" + serialNumber + '\'' +
                ", nome='" + nome + '\'' +
                ", preco='" + preco + '\'' +
                '}';
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Produto outroObjeto) {
        //negativo se thisObject < outroObjeto
        //Zero se thisObject == outroObjeto
        //Positivo se thisObject > outroObjeto
        return 0;
    }
}
