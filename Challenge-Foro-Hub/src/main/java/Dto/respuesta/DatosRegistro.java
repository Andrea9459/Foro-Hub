package Dto.respuesta;

public class DatosRegistro (
    @NotBlank
    String mensaje,
    @NotNull
    Long topicoId,
    @NotNull
    Long autorId,
    @NotBlank
    Boolean solucion){

}
