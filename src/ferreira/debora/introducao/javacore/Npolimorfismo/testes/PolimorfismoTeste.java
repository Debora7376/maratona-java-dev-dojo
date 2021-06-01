package ferreira.debora.introducao.javacore.Npolimorfismo.testes;

import ferreira.debora.introducao.javacore.Npolimorfismo.classes.Funcionario;
import ferreira.debora.introducao.javacore.Npolimorfismo.classes.Gerente;
import ferreira.debora.introducao.javacore.Npolimorfismo.classes.RelatorioPagamento;
import ferreira.debora.introducao.javacore.Npolimorfismo.classes.Vendedor;

public class PolimorfismoTeste {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Choji", 5000, 2000);
        Vendedor vendedor = new Vendedor("Shino", 2000, 20000);
        RelatorioPagamento relatorio = new RelatorioPagamento();
//        relatorio.relatorioPagamentoGerente(gerente);
//        System.out.println("----------------------------------");
//        relatorio.relatorioPagamentoVendedor(vendedor);

        relatorio.relatorioPagamentoGenerico(gerente);
        System.out.println("----------------------------------");
        relatorio.relatorioPagamentoGenerico(vendedor);

    }
}
