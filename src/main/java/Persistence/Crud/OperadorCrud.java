package Persistence.Crud;

import Persistence.Entity.Incidencia;
import Persistence.Entity.Operador;
import org.springframework.data.repository.CrudRepository;

public interface OperadorCrud  extends CrudRepository {

    Incidencia save(Incidencia incidencia);

    Operador saveOperador(Operador operador);
}
