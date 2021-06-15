package ferreira.debora.introducao.javacore.Sstrings.testes;

public class StringBuilderTeste {
    public static void main(String[] args) {
        String s = "uma frase comum";
        StringBuilder ab = new StringBuilder();
        ab.append("def").insert(3,"ghi").reverse().delete(2,4);
        System.out.println(ab);
    }

}
