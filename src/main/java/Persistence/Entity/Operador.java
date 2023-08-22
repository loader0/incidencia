package Persistence.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "operadores")
public class Operador {

    @Id
    @Column(name = "operador_id")
    private Integer operadorId;

    @Column(name = "operador_name")
    private String operadorName;

    @Column(name = "operador_lastname")
    private String operadorLastName;


    @OneToMany
    @JsonBackReference
    private Incidencia incidencia;

    public Integer getOperadorId() {
        return operadorId;
    }

    public void setOperadorId(Integer operadorId) {
        this.operadorId = operadorId;
    }

    public String getOperadorName() {
        return operadorName;
    }

    public void setOperadorName(String operadorName) {
        this.operadorName = operadorName;
    }

    public String getOperadorLastName() {
        return operadorLastName;
    }

    public void setOperadorLastName(String operadorLastName) {
        this.operadorLastName = operadorLastName;
    }

    public Incidencia getIncidencia() {
        return incidencia;
    }

    public void setIncidencia(Incidencia incidencia) {
        this.incidencia = incidencia;
    }

    public Operador() {

    }

    public Operador(Integer operadorId, String operadorName, String operadorLastName, Incidencia incidencia) {
        this.operadorId = operadorId;
        this.operadorName = operadorName;
        this.operadorLastName = operadorLastName;
        this.incidencia = incidencia;
    }
}
