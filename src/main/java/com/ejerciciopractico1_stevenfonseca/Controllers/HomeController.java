
package com.ejerciciopractico1_stevenfonseca.Controllers;


import com.ejerciciopractico1_stevenfonseca.Service.LibroService;
import com.ejerciciopractico1_stevenfonseca.Domain.Libro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private final LibroService libroService;
    public HomeController(LibroService libroService) {
        this.libroService = libroService;
    }

    @GetMapping({"/", "/home"})
    public String home(Model model) {
        // traer 1 libro nuevo (por ejemplo el último)
        var libros = libroService.listarTodos();
        Libro nuevo = libros.isEmpty() ? null : libros.get(libros.size()-1);
        model.addAttribute("nuevo", nuevo);
        return "home";
    }
}

