package sistemas.sistema_1.servicios;

//SERVICIOS -> LOGICA DE NEGOCIO

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sistemas.sistema_1.entidades.Trabajador;
import sistemas.sistema_1.repositorios.RepositorioTrabajador;

import java.util.List;

@Service//Servicios de trabajador
public class ServicioTrabajador implements ISevicioTrabajador {

    @Autowired //Inyeccion de dependecias
    private RepositorioTrabajador repositorio;

    @Override //Lista implementada
    public List<Trabajador> getAll() {
        //Llama al repositorio y todo lo de la BD
        return (List<Trabajador>) repositorio.findAll();
    }

    @Override//Trabajador por id
    public Trabajador getById(Long id) {
        //Devolvemos un trabajador (get)
        return (Trabajador) repositorio.findById(id).get();
    }

    @Override//Eliminar por id
    public void removeById(Long id) {
        //Eliminamos por el id
        repositorio.deleteById(id);
    }

    @Override//Guardar
    public void saveTrabajador(Trabajador trabajador) {
        //Guardamos trabajador
        repositorio.save(trabajador);
    }


}
