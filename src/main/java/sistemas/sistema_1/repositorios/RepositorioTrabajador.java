package sistemas.sistema_1.repositorios;

//REPOSITORIOS -> CONECCION Y LOGICA CON LA BASE DE DATOS

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sistemas.sistema_1.entidades.Trabajador;

@Repository//Acceder y hacer consultas <Clase/Tabla, tipo de dato del id>
public interface RepositorioTrabajador extends CrudRepository<Trabajador, Long> {


}
