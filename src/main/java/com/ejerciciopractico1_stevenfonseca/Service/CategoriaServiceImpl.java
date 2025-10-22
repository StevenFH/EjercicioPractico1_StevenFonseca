

package com.ejerciciopractico1_stevenfonseca.Service;
import com.ejerciciopractico1_stevenfonseca.Domain.Categoria;
import com.ejerciciopractico1_stevenfonseca.Repository.CategoriaRepository;
import com.ejerciciopractico1_stevenfonseca.Service.CategoriaService;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class CategoriaServiceImpl implements CategoriaService {
    private final CategoriaRepository categoriaRepo;

    public CategoriaServiceImpl(CategoriaRepository categoriaRepo) {
        this.categoriaRepo = categoriaRepo;
    }

    @Override
        public List<Categoria> listarTodos() {
        return categoriaRepo.findAll();
    }

    @Override
    public Categoria guardar(Categoria libro) {
        return categoriaRepo.save(libro);
    }

    @Override
    public Categoria obtenerPorId(Long id) {
        return categoriaRepo.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        categoriaRepo.deleteById(id);
    }
}


