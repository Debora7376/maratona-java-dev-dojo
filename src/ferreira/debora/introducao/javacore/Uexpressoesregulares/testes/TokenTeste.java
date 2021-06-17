package ferreira.debora.introducao.javacore.Uexpressoesregulares.testes;

public class TokenTeste {
    public static void main(String[] args) {
        String str = "Deidara, Sasori, Konan, Obito, Kisame, Hidan";
        String[] tokens = str.split(",");
        for (String arr: tokens) {
            System.out.println(arr.trim());
        }
    }
}
