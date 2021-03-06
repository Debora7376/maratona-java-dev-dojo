package ferreira.debora.introducao.javacore.Uexpressoesregulares.testes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTeste {
    public static void main(String[] args) {
        // \d - todos os digitos
        // \D - tudo o que não for digitos
        // \s - espaços em branco
        // \S - caracteres que não é branco
        // \w - caracteres de palavras a-z A-Z, digitos e _
        // \W - tudo que não for caractere de palavras, digitos e _
        // []
        // ? - zaro ou uma
        // * - zero ou mais
        // + - uma ou mais
        // {n,m} de n ate m
        // ( ) agrupamento
        // | OU
        // $ final de linha
        // . coringa 1.3 = 123,133,1A3,1#3, 1 3
        int hex = 0x1;
       /* String regex = "0[xX]([0-9a-fA-F])+[\\s|$]";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";*/
       /* String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "fulano@hotmail.com, 102Abc@gmail.com, #@!abrao@mail.br, teste@gmail.com.br, teste@mail";*/

//        String regex = "\\d\\d/\\d\\d/(\\d\\d\\d\\d|\\d\\d)";
//        String texto = "05/10/2010 05/05/2015 1/1/01 01/05/95"; //dd/MM/yyyy

        String regex = "proj([^,])*";
        String texto = "proj1.bkp, proj1.class, proj1.java, proj1final.java, proj2.bkp, proj3.java, diagrama, texto, foto";
//        System.out.println("Email valido? " + "#@!abrao@mail.br".matches(regex));
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto: " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("exprecoes: " +matcher.pattern());
        System.out.println("posicoes encontradas");
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
