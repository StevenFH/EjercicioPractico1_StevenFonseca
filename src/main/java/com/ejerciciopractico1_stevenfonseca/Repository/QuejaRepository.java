package com.ejerciciopractico1_stevenfonseca.Repository;


import com.ejerciciopractico1_stevenfonseca.Domain.Queja;
import org.springframework.data.jpa.repository.JpaRepository;
public interface QuejaRepository extends JpaRepository<Queja, Long> {
}
