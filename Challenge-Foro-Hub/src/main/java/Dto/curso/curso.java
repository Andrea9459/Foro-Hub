package Dto.curso;

import Controller.Curso;

public record curso(String nombre, String categoria) {
    public curso(Curso curso) {
        this(curso.getNombre(), curso.getCategoria());{

            }
        }
}
