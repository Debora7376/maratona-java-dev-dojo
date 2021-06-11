package ferreira.debora.introducao.javacore.Oexception.runtimeexception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultiplasRuntimeExceptionTeste {
    public static void main(String[] args) {
        // Mais generico por ultimo da lista
        try {
            throw new RuntimeException();
        } catch (IllegalArgumentException | IndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }
        System.out.println("Final do programa");

       try {
           talvezLanceException();
       } catch (Exception e) {
       }
    }
    private static void talvezLanceException() throws SQLException, SQLException, IOException {

    }
}
