package ferreira.debora.introducao.operadores;

public class OperadoresDeAtribuicao {
    public static void main(String[] args) {
        // =, -=, +=, *=, /=, %=
        int salario = 1800;
        salario = salario + 1000;
        salario -= 1000;
        int numero = 11;
        numero %= 2;
        numero = numero % 2;
        System.out.println(numero);
        System.out.println(salario);
    }
}
