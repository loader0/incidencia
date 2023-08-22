package Persistence.Crud;

import Persistence.Entity.Incidencia;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IncidenciaCrud extends CrudRepository {

   Incidencia findyByIncidenciaId(int incidenciaId);

   Incidencia findyByOperadorId(int operadorId);
}
