
package com.ejerciciopractico1_stevenfonseca.Service;
import com.ejerciciopractico1_stevenfonseca.Domain.Libro;
import com.ejerciciopractico1_stevenfonseca.Repository.LibroRepository;
import com.ejerciciopractico1_stevenfonseca.Service.LibroService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LibroServiceImpl implements LibroService {
    private final LibroRepository libroRepo;

    public LibroServiceImpl(LibroRepository libroRepo) {
        this.libroRepo = libroRepo;
    }

    @Override
    public List<Libro> listarTodos() {
        return libroRepo.findAll();
    }

    @Override
    public Libro guardar(Libro libro) {
        return libroRepo.save(libro);
    }

    @Override
    public Libro obtenerPorId(Long id) {
        return libroRepo.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        libroRepo.deleteById(id);
    }
}

