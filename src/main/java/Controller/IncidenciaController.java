package Controller;

import Service.IncidenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/incidencia")
public class IncidenciaController {

    @Autowired
    private IncidenciaService incidenciaService;

    @GetMapping("/{id}")
    public ResponseEntity getIncidencia(@PathVariable(name = "id") int incidenciaId){
        return new ResponseEntity(incidenciaService.getIncidencia(incidenciaId), HttpStatus.OK);
    }

    @GetMapping("/byOperador/{id}")
    public ResponseEntity getByOperador(@PathVariable(name = "id") int operadorId){
        return new ResponseEntity(incidenciaService.getByOperador(operadorId), HttpStatus.OK);
    }
}
