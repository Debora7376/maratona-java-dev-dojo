package ferreira.debora.introducao.javacore.Cintroducaosobrecargametodos.testes;

import ferreira.debora.introducao.javacore.Cintroducaosobrecargametodos.classes.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Luffy", "177.771.187-81", 3400, "51645-2");

        //funcionario.init("Nami", "177.771.187-81", 3400, "51645-2");

        funcionario.imprimi();
    }
}
