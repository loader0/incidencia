package Controller;

import Persistence.Entity.Incidencia;
import Persistence.Entity.Operador;
import Service.OperadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operador")
public class OperadorController {

    @Autowired
    private OperadorService operadorService;


    @PostMapping("/incidencia")
    public ResponseEntity save( @RequestBody Incidencia incidencia){
       return new ResponseEntity( operadorService.save(incidencia), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveOperador(@RequestBody Operador operador){
        return new ResponseEntity(operadorService.saveOperador(operador), HttpStatus.OK);
    }

}
