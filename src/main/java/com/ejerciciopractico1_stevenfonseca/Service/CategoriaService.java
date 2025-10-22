package com.ejerciciopractico1_stevenfonseca.Service;

import com.ejerciciopractico1_stevenfonseca.Domain.Categoria;
import java.util.List;


public interface CategoriaService {
    List<Categoria> listarTodos();
    Categoria guardar(Categoria categoria);
    Categoria obtenerPorId(Long id);
    void eliminar(Long id);
}

