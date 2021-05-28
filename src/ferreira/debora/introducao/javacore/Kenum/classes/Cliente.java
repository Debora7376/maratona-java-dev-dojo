package ferreira.debora.introducao.javacore.Kenum.classes;

public class Cliente {
    private String nome;
    private TipoDePessoa tipo;

    public Cliente() {
    }

    public Cliente(String nome, TipoDePessoa tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo=" + tipo +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoDePessoa getTipo() {
        return tipo;
    }

    public void setTipo(TipoDePessoa tipo) {
        this.tipo = tipo;
    }
}
