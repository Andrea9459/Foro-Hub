package Dto.Usuario;

public record RespuestaUsuarioId(String nombre, String email, String contrasena, String tipo) {
    public RespuestaUsuarioId(Usuario usuario) {
        this(usuario.getNombre(), usuario.getEmail(), usuario.getContrasena(), usuario.getTipo().toString());
    }
}
