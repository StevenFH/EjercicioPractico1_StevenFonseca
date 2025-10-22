package com.ejerciciopractico1_stevenfonseca.Controllers;

import com.ejerciciopractico1_stevenfonseca.Domain.Queja;
import com.ejerciciopractico1_stevenfonseca.Service.QuejaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/contacto")
public class QuejaController {
    private final QuejaService quejaService;
    public QuejaController(QuejaService quejaService) {
        this.quejaService = quejaService;
    }

    @GetMapping
    public String contactoForm(Model model) {
        model.addAttribute("queja", new Queja());
        return "contacto/form";
    }

    @PostMapping("/enviar")
    public String enviar(@ModelAttribute Queja queja) {
        quejaService.guardar(queja);
        return "redirect:/contacto?ok";
    }
}
