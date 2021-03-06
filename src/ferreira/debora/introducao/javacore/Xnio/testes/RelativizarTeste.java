package ferreira.debora.introducao.javacore.Xnio.testes;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizarTeste {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/debora");
        Path classe = Paths.get("/home/debora/java/Pessoa.java");
        Path pathClasse = dir.relativize(classe);
        System.out.println(pathClasse);

        Path absolute1 = Paths.get("/home/debora");
        Path absolute2 = Paths.get("/usr/local");
        Path absolute3 = Paths.get("/home/debora/java/Pessoa.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("/temp/Funcionario.java");

        System.out.println("1: "+absolute1.relativize(absolute3));
        System.out.println("2: "+absolute3.relativize(absolute1));
        System.out.println("3: "+absolute1.relativize(absolute2));
        System.out.println("4: "+relativo1.relativize(relativo2));
       // System.out.println("5: "+absolute1.relativize(relativo1));
    }
}
