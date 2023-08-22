package Persistence.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "incidencias")
public class Incidencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "incidencia_id")
    private Integer incidenciaId;

    @Id
    @Column(name = "operador_id")
    private Integer operadorId;

    @Column(name = "incidencia_date")
    private LocalDateTime incidenciaDate;

    private String active;

    @ManyToOne
    @JoinColumn(name = "operador_id", updatable = false, insertable = false)
    private  Operador operador;
}
