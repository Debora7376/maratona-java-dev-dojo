package ferreira.debora.introducao.javacore.Jmodificadorfinal.testes;

import ferreira.debora.introducao.javacore.Jmodificadorfinal.classes.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(carro.getComprador());
        carro.getComprador().setNome("Tsunade");
        System.out.println(carro.getComprador());

    }
}
