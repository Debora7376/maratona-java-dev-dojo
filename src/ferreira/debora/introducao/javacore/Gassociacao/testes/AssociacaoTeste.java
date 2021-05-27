package ferreira.debora.introducao.javacore.Gassociacao.testes;

import ferreira.debora.introducao.javacore.Gassociacao.classes.Aluno;
import ferreira.debora.introducao.javacore.Gassociacao.classes.Local;
import ferreira.debora.introducao.javacore.Gassociacao.classes.Professor;
import ferreira.debora.introducao.javacore.Gassociacao.classes.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Debora Ferreira", 24);
        Aluno aluno2 = new Aluno("Andre Souza", 23);

        Seminario seminario = new Seminario("Como fazer seu gato feliz");
        Professor professor = new Professor("Tanjiro", "Treinamento de demonios");
        Local local = new Local("Rua dos monstros ","Inferno");

        aluno.setSeminario(seminario);
        aluno2.setSeminario(seminario);

        seminario.setProfessor(professor);
        seminario.setLocal(local);
        seminario.setAlunos(new Aluno[]{aluno, aluno2});

        Seminario[] semArray = new Seminario[1];
        semArray[0] = seminario;
        professor.setSeminarios(semArray);

        seminario.print();
        professor.print();
    }
}
