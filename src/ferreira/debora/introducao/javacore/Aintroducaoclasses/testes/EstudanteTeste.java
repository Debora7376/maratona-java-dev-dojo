package ferreira.debora.introducao.javacore.Aintroducaoclasses.testes;

import ferreira.debora.introducao.javacore.Aintroducaoclasses.classes.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.setNome("Debora");
        estudante.setIdade(24);
        estudante.setMatricula("1212");
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.matricula);
    }
}
