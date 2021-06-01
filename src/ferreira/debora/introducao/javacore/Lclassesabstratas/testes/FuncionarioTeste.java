package ferreira.debora.introducao.javacore.Lclassesabstratas.testes;

import ferreira.debora.introducao.javacore.Lclassesabstratas.classes.Funcionario;
import ferreira.debora.introducao.javacore.Lclassesabstratas.classes.Gerente;
import ferreira.debora.introducao.javacore.Lclassesabstratas.classes.Vendedor;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Ino", "20102-8", 1500, 5000);
        Gerente gerente = new Gerente("Sai", "11192-8", 2000);
        vendedor.calculaSalario();
        gerente.calculaSalario();
        System.out.println(vendedor);
        System.out.println("------------------------------------");
        System.out.println(gerente);
    }
}
