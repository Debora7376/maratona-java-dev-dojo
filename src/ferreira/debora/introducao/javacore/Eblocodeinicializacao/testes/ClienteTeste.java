package ferreira.debora.introducao.javacore.Eblocodeinicializacao.testes;

import ferreira.debora.introducao.javacore.Eblocodeinicializacao.classes.Cliente;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        System.out.println("Exibindo quantidade de parcelas possiveis");
        for ( int parcela : cliente.getParcelas()) {
            System.out.print(parcela + " ");
        }
    }
}
