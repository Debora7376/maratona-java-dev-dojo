package ferreira.debora.introducao.javacore.Kenum.testes;

import ferreira.debora.introducao.javacore.Kenum.classes.Cliente;
import ferreira.debora.introducao.javacore.Kenum.classes.TipoDePessoa;

public class ClienteTeste  {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Kiba", (TipoDePessoa.PESSOA_FISICA));
        System.out.println(cliente);
    }
}
