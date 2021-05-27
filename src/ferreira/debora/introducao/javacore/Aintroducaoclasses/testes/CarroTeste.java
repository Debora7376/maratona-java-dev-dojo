package ferreira.debora.introducao.javacore.Aintroducaoclasses.testes;

import ferreira.debora.introducao.javacore.Aintroducaoclasses.classes.Carro;

public class CarroTeste {

        public static void main(String[] args) {
            Carro carro = new Carro();
            carro.modelo = "Fusca";
            carro.placa = "QWJ1029";
            carro.velocidadeMaxima = 120f;
            System.out.println(carro.placa);
            System.out.println(carro.modelo);
            System.out.println(carro.velocidadeMaxima);
        }
    }
