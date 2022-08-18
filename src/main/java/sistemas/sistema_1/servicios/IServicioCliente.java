package sistemas.sistema_1.servicios;

import sistemas.sistema_1.entidades.Cliente;

import java.util.List;

public interface IServicioCliente {

    List<Cliente> getAll();

    Cliente getById(Long id);

    void removeById(Long id);

    void saveCliente(Cliente cliente);
}
