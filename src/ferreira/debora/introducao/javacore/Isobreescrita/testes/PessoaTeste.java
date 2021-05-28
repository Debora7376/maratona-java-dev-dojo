package ferreira.debora.introducao.javacore.Isobreescrita.testes;

import ferreira.debora.introducao.javacore.Isobreescrita.classes.Pessoa;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Itachi Uchiha");
        pessoa.setIdade(21);
        System.out.println(pessoa);
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Deidara");
        pessoa2.setIdade(19);
        System.out.println(pessoa2);
    }
}
