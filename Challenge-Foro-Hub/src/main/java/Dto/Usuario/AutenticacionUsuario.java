package Dto.Usuario;

public record AutenticacionUsuario(
    @NotBlank
    @Email
    String email,
    @NotBlank
    String contrasena) {
}
