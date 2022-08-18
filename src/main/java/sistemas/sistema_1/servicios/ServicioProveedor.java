package sistemas.sistema_1.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sistemas.sistema_1.entidades.Proveedor;
import sistemas.sistema_1.repositorios.RepositorioProveedor;

import java.util.List;

@Service
public class ServicioProveedor implements IServicioProveedor {

    @Autowired
    private RepositorioProveedor repositorio;

    @Override
    public List<Proveedor> getAll() {
        return (List<Proveedor>) repositorio.findAll();
    }

    @Override
    public Proveedor getById(Long id) {

        return (Proveedor) repositorio.findById(id).get();

    }

    @Override
    public void removeById(Long id) {

        repositorio.deleteById(id);

    }

    @Override
    public void saveProveedor(Proveedor proveedor) {

        repositorio.save(proveedor);

    }
}
