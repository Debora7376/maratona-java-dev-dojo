package ferreira.debora.introducao.javacore.Bintroducaometodos.testes;

import ferreira.debora.introducao.javacore.Bintroducaometodos.classes.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.setNome("Rock Lee");
        estudante.setIdade(13);
        estudante.setNotas(new double[]{9,7,9.8});
        estudante.print();
        estudante.tirarMedia();
        System.out.println("Aprovado? "+estudante.isAprovado());

    }
}
