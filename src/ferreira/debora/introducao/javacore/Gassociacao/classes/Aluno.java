package ferreira.debora.introducao.javacore.Gassociacao.classes;

public class Aluno {
    private Seminario seminario;
    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno() {
    }

    public void print () {
        System.out.println("---------------Relatorio de aluno---------------");
        System.out.println("Nome:" + this.nome);
        System.out.println("Idade " + this.idade);
        if (this.seminario != null) {
            System.out.println("Seminario inscrito: " + this.seminario.getTitulo());
        } else {
            System.out.println("Aluno não esta inscrito em nenhum seminario");
        }
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
