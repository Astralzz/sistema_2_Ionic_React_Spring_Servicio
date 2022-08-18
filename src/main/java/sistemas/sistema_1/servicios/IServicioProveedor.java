package sistemas.sistema_1.servicios;

import sistemas.sistema_1.entidades.Proveedor;

import java.util.List;

public interface IServicioProveedor {

    List<Proveedor> getAll();

    Proveedor getById(Long id);

    void removeById(Long id);

    void saveProveedor(Proveedor proveedor);
}
