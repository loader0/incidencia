package Service;

import Persistence.Entity.Incidencia;
import Persistence.Entity.Operador;
import Persistence.OperadorRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class OperadorService {
    @Autowired
    private OperadorRepository operadorRepository;

    public Incidencia save(Incidencia incidencia){
        return operadorRepository.save(incidencia);
    }

    public Operador saveOperador(Operador operador){
        return operadorRepository.saveOperador(operador);
    }
}
