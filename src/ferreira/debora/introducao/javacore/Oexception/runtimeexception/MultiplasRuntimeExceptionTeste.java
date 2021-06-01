package ferreira.debora.introducao.javacore.Oexception.runtimeexception;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultiplasRuntimeExceptionTeste {
    public static void main(String[] args) {
        // Mais generico por ultimo da lista
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println(" Dentro do IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Dentro do ArithmeticException");
        }catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }
        System.out.println("Final do programa");

       try {
           talvezLanceException();
       }catch (SQLException e){

       }catch (FileNotFoundException e){

       }
    }
    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}
