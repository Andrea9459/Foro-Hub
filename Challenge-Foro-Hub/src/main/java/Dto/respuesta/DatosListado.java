package Dto.respuesta;

import Controller.Respuesta;

public record DatosListado() {

    public DatosListado(Respuesta respuesta) {
        this(respuesta.getId(), respuesta.getMensaje(), respuesta.getTopico().getTitulo(), respuesta.getAutor().getNombre());
    }
}
