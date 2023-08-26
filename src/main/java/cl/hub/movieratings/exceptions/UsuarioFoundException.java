package cl.hub.movieratings.exceptions;

public class UsuarioFoundException extends Exception {

    public UsuarioFoundException(){
        super("Usuario ya existe, no se puede crear");
    }

    public UsuarioFoundException(String mensaje){
        super(mensaje);
    }

}
