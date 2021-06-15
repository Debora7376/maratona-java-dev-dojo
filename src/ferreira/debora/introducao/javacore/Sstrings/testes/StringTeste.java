package ferreira.debora.introducao.javacore.Sstrings.testes;

import java.util.Locale;

public class StringTeste {
    public static void main(String[] args) {
        String nome = "Debora";
        nome = nome.concat(" Ferreira");
        String nome2 = "Debora";
        String nome3 = new String("Andre"); // 1- variavel de referencia 2- um objeto do tipo string 3- uma string de pool de String

        String teste = "Goku";
        String teste2 = "goku";
        String teste3 = "AaaOoo";
        String teste4 = "0123456789";
        String teste5 = "      0123456789    ";

        System.out.println(teste.charAt(3));
        System.out.println(teste.equalsIgnoreCase(teste2));
        System.out.println(teste.length());
        System.out.println(teste3.replace('a', 'o'));
        System.out.println(teste.toLowerCase());
        System.out.println(teste2.toUpperCase());
        System.out.println(teste4.substring(0,5));
        System.out.println(teste5.trim());
    }
}
