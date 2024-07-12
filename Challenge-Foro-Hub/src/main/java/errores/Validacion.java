package errores;

public class Validacion extends RuntimeException{
    private static final long serialVersionUID = 1L;
    public Validacion(String s){
        super(s);
    }
}



