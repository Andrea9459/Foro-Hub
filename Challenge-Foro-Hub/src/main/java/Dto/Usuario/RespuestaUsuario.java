package Dto.Usuario;

public record RespuestaUsuario(String nombre, String email, String tipo) {
    public RespuestaUsuario(Usuario usuario) {
        this(usuario.getNombre(), usuario.getEmail(), usuario.getTipo().toString());
    }
}
