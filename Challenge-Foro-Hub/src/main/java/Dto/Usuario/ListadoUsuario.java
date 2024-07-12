package Dto.Usuario;

public record ListadoUsuario(Long id, String nombre, String email, String tipo) {
    public ListadoUsuario(Usuario usuario) {
        this(usuario.getId(), usuario.getNombre(), usuario.getEmail(), usuario.getTipo().toString());
    }
}
