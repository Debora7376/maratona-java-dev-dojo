package ferreira.debora.introducao.javacore.Kenum.testes;

import ferreira.debora.introducao.javacore.Kenum.classes.Cliente;
import ferreira.debora.introducao.javacore.Kenum.classes.TipoCliente;

public class ClienteTeste  {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Kiba", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.APRAZO);
        System.out.println(TipoCliente.PESSOA_JURIDICA.getId());
        System.out.println(TipoCliente.PESSOA_FISICA.getId());
        System.out.println(cliente);
    }
}
