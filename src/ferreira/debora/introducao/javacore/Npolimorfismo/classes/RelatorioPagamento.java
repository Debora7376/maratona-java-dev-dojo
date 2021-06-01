package ferreira.debora.introducao.javacore.Npolimorfismo.classes;

public class RelatorioPagamento {
//    public void relatorioPagamentoGerente(Gerente gerente){
//        System.out.println("Gerando relatorio de pagamento para a gerencia");
//        gerente.calcularPagamento();
//        System.out.println("Nome: "+gerente.getNome());
//        System.out.println("Salario desse mês: "+gerente.getSalario());
//    }
//    public void relatorioPagamentoVendedor(Vendedor vendedor){
//        System.out.println("Gerando relatorio de pagamento para os vendedores");
//        vendedor.calcularPagamento();
//        System.out.println("Nome: "+vendedor.getNome());
//        System.out.println("Salario desse mês: "+vendedor.getSalario());
//    }

    // parametros polimorficos ---------->
    public void relatorioPagamentoGenerico(Funcionario funcionario) {
        System.out.println("Relatorio de pagamento");
        funcionario.calcularPagamento();
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salario desse mês: " + funcionario.getSalario());
        // Duas formas de fazer if com instanceof
        if (funcionario instanceof Gerente) {
            Gerente gerente = (Gerente) funcionario;
            System.out.println("Participacao dos lucro: " + gerente.getPnl());
        }
        if (funcionario instanceof Vendedor){
            System.out.println("Total de vendas: "+ ((Vendedor) funcionario).getTotalVendas());
        }
    }
}
