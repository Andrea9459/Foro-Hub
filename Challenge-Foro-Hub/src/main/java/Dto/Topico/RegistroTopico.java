package Dto.Topico;

public record RegistroTopico(
    @NotBlank
    String titulo,
    @NotBlank
    String mensaje ,
    @NotNull
    Long autorId,
    @NotNull
    Long cursoId) {
}
