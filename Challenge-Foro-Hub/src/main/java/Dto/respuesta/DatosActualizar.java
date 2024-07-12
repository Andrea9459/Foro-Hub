package Dto.respuesta;

public record DatosActualizar(
    @NotNull
    Long id,
    @NotBlank
    String mensaje,
    @NotNull
    Long topicoId,
    @NotBlank
    Long autorId,
    @NotNull
    Boolean solucion) {
}
