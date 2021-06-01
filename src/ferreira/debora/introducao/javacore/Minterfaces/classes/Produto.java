package ferreira.debora.introducao.javacore.Minterfaces.classes;

public class Produto implements Tributavel, Tranportavel{
    public String nome;
    private double peso;
    private double preco;
    private double precoFinal;
    private double valorFrete;

    @Override
    public void calculaImposto() {
        precoFinal = this.preco + (this.preco * imposto);
    }

    @Override
    public void calculaFrete() {
        this.valorFrete = this.preco / peso * 0.1;
    }

    public Produto(String nome, double peso, double preco) {
        this.nome = nome;
        this.peso = peso;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                ", preco=" + preco +
                ", precoFinal com Imposto=" + precoFinal +
                ", valorFrete=" + valorFrete +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public void setPrecoFinal(double precoFinal) {
        this.precoFinal = precoFinal;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(double valorFrete) {
        this.valorFrete = valorFrete;
    }

}
