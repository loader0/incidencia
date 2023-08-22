package Persistence;

import Persistence.Crud.OperadorCrud;
import Persistence.Entity.Incidencia;
import Persistence.Entity.Operador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OperadorRepository {

    @Autowired
    private OperadorCrud operadorCrud;

    public Incidencia save(Incidencia incidencia){
        return operadorCrud.save(incidencia);
    }

    public Operador saveOperador(Operador operador){
        return  operadorCrud.saveOperador(operador);
    }
}
