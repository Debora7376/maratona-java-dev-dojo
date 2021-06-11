package ferreira.debora.introducao.javacore.Oexception.CustomExceptionTest;

public class LoginInvalidoException extends Exception {

    public LoginInvalidoException(){
        super("Usuario ou senha inválidos");
    }
}
