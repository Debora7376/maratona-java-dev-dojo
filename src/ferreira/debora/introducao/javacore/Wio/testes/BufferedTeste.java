package ferreira.debora.introducao.javacore.Wio.testes;

import java.io.*;

public class BufferedTeste {
    public static void main(String[] args) throws IOException {
        File file = new File("Arquivo.txt");

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            BufferedReader br = new BufferedReader(new FileReader(file))) {
            bw.write("Escrevendo uma mensagem no arquivo");
            bw.newLine();
            bw.write("E pulando uma linha 3");
            bw.flush();
            String a;
            while ((a = br.readLine()) != null) {
                System.out.println(a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//        try {
//            FileWriter fw = new FileWriter(file);
//            BufferedWriter bw = new BufferedWriter(fw);
//
//            bw.write("Escrevendo uma mensagem no arquivo");
//            bw.newLine();
//            bw.write("E pulando uma linha 3");
//            bw.flush();
//            bw.close();
//
//            FileReader fr = new FileReader(file);
//            BufferedReader br = new BufferedReader(fr);
//            String s = null;
//            while ((s = br.readLine()) != null) {
//                System.out.println(s);
//            }
//            br.close();
//        }catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
