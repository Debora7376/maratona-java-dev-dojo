package ferreira.debora.introducao.javacore.Fmodificadoestatico.testes;

import ferreira.debora.introducao.javacore.Fmodificadoestatico.classes.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(220);
        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Audi", 275);
        Carro carro3 = new Carro("Mecerdes", 290);

        carro1.imprimi();
        carro2.imprimi();
        carro3.imprimi();

        System.out.println("#################");

        carro1.imprimi();
        carro2.imprimi();
        carro3.imprimi();

    }

}
