package sistemas.sistema_1.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sistemas.sistema_1.entidades.Proveedor;

@Repository
public interface RepositorioProveedor extends CrudRepository<Proveedor, Long> {
}
