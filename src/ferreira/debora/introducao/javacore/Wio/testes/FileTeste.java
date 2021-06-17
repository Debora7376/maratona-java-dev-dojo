package ferreira.debora.introducao.javacore.Wio.testes;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTeste {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        try {
            System.out.println(file.createNewFile());
            boolean exists = file.exists();
            System.out.println("Permissao de leitura? "+file.canRead());
            System.out.println("path "+file.getPath());
            System.out.println("path "+file.getAbsolutePath());
            System.out.println("diretorio? "+file.isDirectory());
            System.out.println("hidden? "+file.isHidden());
            System.out.println("last mofified? "+new Date(file.lastModified()));
            if (exists) {
                System.out.println("Deletando? "+file.delete());
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
