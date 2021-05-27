package ferreira.debora.introducao.javacore.Dsobrecargaconstrutores.testes;

import ferreira.debora.introducao.javacore.Dsobrecargaconstrutores.classes.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("15756", "Zoro", new double[]{3,7,9}, "04/10/2020");
        estudante.imprimi();
    }
}
