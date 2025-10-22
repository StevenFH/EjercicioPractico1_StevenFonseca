package com.ejerciciopractico1_stevenfonseca.Service;

import com.ejerciciopractico1_stevenfonseca.Domain.Queja;
import com.ejerciciopractico1_stevenfonseca.Repository.QuejaRepository;
import com.ejerciciopractico1_stevenfonseca.Service.QuejaService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class QuejaServiceImpl implements QuejaService {
    private final QuejaRepository quejaRepo;

    public QuejaServiceImpl(QuejaRepository quejaRepo) {
        this.quejaRepo = quejaRepo;
    }

    @Override
    public List<Queja> listarTodos() {
        return quejaRepo.findAll();
    }

    @Override
    public Queja guardar(Queja libro) {
        return quejaRepo.save(libro);
    }

    @Override
    public Queja obtenerPorId(Long id) {
        return quejaRepo.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        quejaRepo.deleteById(id);
    }
}