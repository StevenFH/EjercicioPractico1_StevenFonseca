package com.ejerciciopractico1_stevenfonseca.Repository;


import com.ejerciciopractico1_stevenfonseca.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
