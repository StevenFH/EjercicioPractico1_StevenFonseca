package com.ejerciciopractico1_stevenfonseca.Service;

import com.ejerciciopractico1_stevenfonseca.Domain.Libro;
import java.util.List;
public interface LibroService {
    List<Libro> listarTodos();
    Libro guardar(Libro libro);
    Libro obtenerPorId(Long id);
    void eliminar(Long id);
}

