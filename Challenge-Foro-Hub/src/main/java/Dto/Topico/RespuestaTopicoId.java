package Dto.Topico;

public record RespuestaTopicoId(Long id, String titulo, String mensaje, String fechaCreacion, String estado, DatosRespuestaUsuario autor,
                                DatosRespuestaCurso curso) {
    public RespuestaTopicoId(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFechaCreacion().toString(),
                topico.getEstado().toString(), new DatosRespuestaUsuario(topico.getAutor()),
                new DatosRespuestaCurso(topico.getCurso()));
    }
}
