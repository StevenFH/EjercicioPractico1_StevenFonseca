

package com.ejerciciopractico1_stevenfonseca.Service;
import com.ejerciciopractico1_stevenfonseca.Domain.Queja;
import java.util.List;
public interface QuejaService {
    List<Queja> listarTodos();
    Queja guardar(Queja libro);
    Queja obtenerPorId(Long id);
    void eliminar(Long id);
}
