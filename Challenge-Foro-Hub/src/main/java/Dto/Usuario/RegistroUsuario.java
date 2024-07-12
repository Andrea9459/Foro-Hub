package Dto.Usuario;

public record RegistroUsuario(
    @NotBlank
    String nombre,
    @NotBlank
    @Email
    String email,
    @NotBlank
    String contrasena,
    @NotNull
    Tipo tipo) {
}
