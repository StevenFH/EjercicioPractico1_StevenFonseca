package com.ejerciciopractico1_stevenfonseca.Controllers;

import com.ejerciciopractico1_stevenfonseca.Domain.Libro;
import com.ejerciciopractico1_stevenfonseca.Service.LibroService;
import com.ejerciciopractico1_stevenfonseca.Service.CategoriaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/libros")
public class LibroController {
    private final LibroService libroService;
    private final CategoriaService categoriaService;

    public LibroController(LibroService libroService, CategoriaService categoriaService) {
        this.libroService = libroService;
        this.categoriaService = categoriaService;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("libros", libroService.listarTodos());
        return "libros/list";
    }

    @GetMapping("/nuevo")
    public String nuevoForm(Model model) {
        model.addAttribute("libro", new Libro());
        model.addAttribute("categorias", categoriaService.listarTodos());
        return "libros/form";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Libro libro) {
        libroService.guardar(libro);
        return "redirect:/libros";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        var libro = libroService.obtenerPorId(id);
        model.addAttribute("libro", libro);
        model.addAttribute("categorias", categoriaService.listarTodos());
        return "libros/form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        libroService.eliminar(id);
        return "redirect:/libros";
    }
}
