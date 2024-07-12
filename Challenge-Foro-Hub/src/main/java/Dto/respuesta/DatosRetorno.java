package Dto.respuesta;

import Controller.Respuesta;

public record DatosRetorno(Respuesta respuesta) {
      this(respuesta.getMensaje(), respuesta.getTopico().getTitulo(), respuesta.getAutor().getNombre());
}
}
