package ferreira.debora.introducao.javacore.Gassociacao.classes;

public class Professor {
    private Seminario[] seminarios;
    private String nome;
    private String especialidade;

    public Professor() {
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void print () {
        System.out.println("-------------Relatorio de professores-------------");
        System.out.println("Nome do professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if (seminarios != null && seminarios.length != 0) {
            System.out.println("Seminario participantes");
            for (Seminario seminario : seminarios) {
                System.out.println(seminario.getTitulo());
            }
            return;
        }
        System.out.println("Professor não vinculado a nenhum seminario");
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
