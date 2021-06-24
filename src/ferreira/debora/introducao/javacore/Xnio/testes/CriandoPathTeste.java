package ferreira.debora.introducao.javacore.Xnio.testes;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CriandoPathTeste {
    public static void main(String[] args) {
        //C:\Users\Pr5\Documents\workdev\projects\projects-cursos\maratona-java
        Path p1 = Paths.get("C:\\Users\\Pr5\\Documents\\workdev\\projects\\projects-cursos\\maratona-java\\Arquivo.txt");
        Path p2 = Paths.get("C:\\Users\\Pr5\\Documents\\workdev\\projects\\projects-cursos\\maratona-java", "Arquivo.txt");
        Path p3 = Paths.get("C:","Users\\Pr5\\Documents\\workdev\\projects\\projects-cursos\\maratona-java\\Arquivo.txt");
        Path p4 = Paths.get("C:","Users", "Pr5", "Documents", "workdev", "projects", "projects-cursos", "maratona-java","Arquivo.txt");
    }
}
