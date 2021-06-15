package ferreira.debora.introducao.javacore.Uexpressoesregulares.testes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTeste {
    public static void main(String[] args) {
        String regex = "aba";
        String texto = "abababa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto: " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("exprecoes: " +matcher.pattern());
        System.out.println("posicoes encontradas");
        while (matcher.find()) {
            System.out.println(matcher.start() + " ");
        }
    }
}
