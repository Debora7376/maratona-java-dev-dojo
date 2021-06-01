package ferreira.debora.introducao.javacore.Oexception.runtimeexception;

import sun.plugin.dom.exception.BrowserNotSupportedException;

public class RuntimeexceptionTeste {
    public static void main(String[] args) {
        divisao(10,0);
    }
    private static void divisao (int numero1, int numero2){
        if (numero2 == 0) {
            throw new IllegalArgumentException("Digite um valor diferente de 0 para numero2");
        }
        int result = numero1/numero2;
        System.out.println(result);
    }
}
