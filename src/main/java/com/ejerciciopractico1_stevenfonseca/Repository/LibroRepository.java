package com.ejerciciopractico1_stevenfonseca.Repository;


import com.ejerciciopractico1_stevenfonseca.Domain.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface LibroRepository extends JpaRepository<Libro, Long> {
    List<Libro> findByTituloContainingIgnoreCase(String titulo);
}
