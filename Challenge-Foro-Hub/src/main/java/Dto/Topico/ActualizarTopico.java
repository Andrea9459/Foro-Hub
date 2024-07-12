package Dto.Topico;

import org.antlr.v4.runtime.misc.NotNull;

public record ActualizarTopico(
    @NotNull
    Long id,
    @NotBlank
    String titulo,
    @NotBlank
    String mensaje,
    @NotNull
    Estado estado,
    @NotNull
    Long autorId,
    @NotNull
    Long cursoId) {

}
