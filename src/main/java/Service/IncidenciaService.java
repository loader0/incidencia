package Service;

import Persistence.Entity.Incidencia;
import Persistence.IncidenciaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class IncidenciaService {

    @Autowired
    private IncidenciaRepository incidenciaRepository;

    public Incidencia getIncidencia(int incidenciaId){
        return incidenciaRepository.getIncidencia(incidenciaId);
    }

    public Incidencia getByOperador(int operadorId){
        return incidenciaRepository.getByOperador(operadorId);
    }

}
