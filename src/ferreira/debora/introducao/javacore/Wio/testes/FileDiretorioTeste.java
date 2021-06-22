package ferreira.debora.introducao.javacore.Wio.testes;

import java.io.File;
import java.io.IOException;

public class FileDiretorioTeste {
    public static void main(String[] args) throws IOException {
        File diretorio = new File("folder");
        boolean mkdir = diretorio.mkdir();
        System.out.println("Diretorio Criado " + mkdir);
        File arquivo = new File(diretorio, "arquivo.txt");
        boolean newFile = arquivo.createNewFile();
        System.out.println("Arquivo criado "+ newFile);
        File arquivoNovoNome = new File(diretorio, "arquivo_renomeado.txt");
        boolean renamed = arquivo.renameTo(arquivoNovoNome);
        System.out.println("Renomeando "+ renamed);
        File diretorioRenomeando = new File("folder2");
        boolean diretorioRenamed = diretorio.renameTo(diretorioRenomeando);
        System.out.println("diretorio renomeado: "+ diretorioRenamed);
        buscarArquivo();
    }

    public static void buscarArquivo(){
        File file = new File("");
        String[] list = file.list();
        for(String arquivo : list) {
            System.out.println(arquivo);
        }
    }
}
