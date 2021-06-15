package ferreira.debora.introducao.javacore.Tdatas;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateTeste {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        String mascara = "'Atlanta,' dd 'de' MMM 'de' yyyy";
        SimpleDateFormat formatador = new SimpleDateFormat(mascara);
        System.out.println(formatador.format(c.getTime()));
    }
}
