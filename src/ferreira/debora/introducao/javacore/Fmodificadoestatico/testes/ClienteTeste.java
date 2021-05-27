package ferreira.debora.introducao.javacore.Fmodificadoestatico.testes;

import ferreira.debora.introducao.javacore.Eblocodeinicializacao.classes.Cliente;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        System.out.println("Exibindo quantidade de parcelas possiveis");
//        for ( int parcela : cliente.getParcelas()) {
//            System.out.print(parcela + " ");
//        }
        System.out.println("tamanho: " + Cliente.getParcelas().length);
    }
}
