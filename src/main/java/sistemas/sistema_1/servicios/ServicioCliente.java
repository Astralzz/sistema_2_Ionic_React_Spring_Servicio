package sistemas.sistema_1.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sistemas.sistema_1.entidades.Cliente;
import sistemas.sistema_1.repositorios.RepositorioCliente;

import java.util.List;

@Service
public class ServicioCliente implements IServicioCliente {

    @Autowired
    private RepositorioCliente repositorio;

    @Override
    public List<Cliente> getAll() {
        return (List<Cliente>) repositorio.findAll();
    }

    @Override
    public Cliente getById(Long id) {

        return (Cliente) repositorio.findById(id).get();

    }

    @Override
    public void removeById(Long id) {

        repositorio.deleteById(id);

    }

    @Override
    public void saveCliente(Cliente cliente) {

        repositorio.save(cliente);

    }
}
