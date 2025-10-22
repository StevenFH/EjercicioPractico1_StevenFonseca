package com.ejerciciopractico1_stevenfonseca.Domain;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="queja")
public class Queja {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreCliente;
    private String email;
    private String telefono;

    @Enumerated(EnumType.STRING)
    private TipoQueja tipo = TipoQueja.CONSULTA;

    private String asunto;

    @Column(columnDefinition="TEXT", nullable=false)
    private String mensaje;

    private Boolean tratado = false;

    @Column(name="created_at", updatable=false)
    private LocalDateTime createdAt;

    // getters, setters

    public enum TipoQueja { QUEJA, SUGERENCIA, CONSULTA }
}

