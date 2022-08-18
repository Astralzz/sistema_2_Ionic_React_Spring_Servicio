package sistemas.sistema_1.servicios;

import sistemas.sistema_1.entidades.Trabajador;

import java.util.List;

//Interface de servicio de trabajadores
public interface ISevicioTrabajador {

    List<Trabajador> getAll();

    Trabajador getById(Long id);

    void removeById(Long id);

    void saveTrabajador(Trabajador trabajador);

}
