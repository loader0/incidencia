package Persistence;

import Persistence.Crud.IncidenciaCrud;
import Persistence.Entity.Incidencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class IncidenciaRepository {

    @Autowired
    private IncidenciaCrud incidenciaCrud;

    public Incidencia getIncidencia(int incidenciaId){
        return incidenciaCrud.findyByIncidenciaId(incidenciaId);
    }

    public Incidencia getByOperador(int operadorId){
        return incidenciaCrud.findyByOperadorId(operadorId);
    }
}
