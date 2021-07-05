package ferreira.debora.introducao.javacore.Xnio.testes;

import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipandoTeste {
    public static void main(String[] args) {

        Path dirZip = Paths.get("pasta/subpasta");
        Path dirFiles = Paths.get("pasta/subpasta/subsubpasta");
        Path zipFile = dirZip.resolve("arquivo.zip");
        // Ao ser executado esse try-with-resources vai criar o arquivo.zip imediatamente
        try (ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(zipFile.toFile()));
             // Comos vamos zipar todos os arquivos do diretório dirFiles apenas iteramos sobre eles usando DirectoryStream
             DirectoryStream<Path> stream = Files.newDirectoryStream(dirFiles)) {
            for (Path path : stream) {
                //Adicionamos ao arquivo.zip uma entrada ZipEntry, que será o arquivo que será copiado para dentro do zip
                zip.putNextEntry(new ZipEntry(path.getFileName().toString()));
                // O código abaixo copiará os dados do arquivo para o arquivo dentro do zip
                BufferedInputStream bf = new BufferedInputStream(new FileInputStream(path.toFile()));
                byte[] buff = new byte[2048];
                int bytesRead;
                while ((bytesRead = bf.read(buff)) > 0) {
                    zip.write(buff, 0, bytesRead);
                }
                zip.flush();
                zip.closeEntry();
                bf.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
