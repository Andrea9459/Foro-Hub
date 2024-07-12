package Dto.Topico;

public class RespuestaTopico(String titulo, String mensaje, String autor, String curso) {
    public RespuestaTopico(Topico topico) {
        this(topico.getTitulo(), topico.getMensaje(), topico.getAutor().getNombre(), topico.getCurso().getNombre());
    }
}
