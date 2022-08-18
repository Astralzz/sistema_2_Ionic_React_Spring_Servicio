package sistemas.sistema_1.controladores;

//CONTROLADORES -> PUNTO DE ACCESO

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sistemas.sistema_1.entidades.Trabajador;
import sistemas.sistema_1.servicios.ISevicioTrabajador;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ControladorTrabajador {

    //@GetMapping --> GET/CONSULTAR
    //@PostMapping --> POST/CREAR
    //@DeleteMapping --> DELETE/ELIMINAR

    @Autowired
    private ISevicioTrabajador servicio;

    //Optener lista de trabajadores
    @GetMapping("/api/trabajadores")//Ruta
    public List<Trabajador> getAll() {

        //Retornamos el servicio
        return servicio.getAll();

    }

    //Optener trabajador por id
    @GetMapping("/api/trabajador/{id}")//Ruta
    public Trabajador getByIdl(@PathVariable String id) {

        //Convertimos a Long
        Long NewId = Long.parseLong(id);

        //Retornamos el servicio
        return servicio.getById(NewId);

    }

    @DeleteMapping("/api/trabajador/eliminar/{id}")//Ruta
    public void removeById(@PathVariable String id) {

        //Convertimos a Long
        Long NewId = Long.parseLong(id);

        //Eliminamos por el servicio
        servicio.removeById(NewId);

    }

    @PostMapping("/api/trabajador/guardar")//Ruta
    public void saveTrabajador(@RequestBody Trabajador trabajador) {

        //Guardamos por el servicio
        servicio.saveTrabajador(trabajador);

    }

}
