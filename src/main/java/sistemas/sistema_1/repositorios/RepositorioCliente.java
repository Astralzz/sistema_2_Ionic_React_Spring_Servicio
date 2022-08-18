package sistemas.sistema_1.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sistemas.sistema_1.entidades.Cliente;

@Repository
public interface RepositorioCliente extends CrudRepository<Cliente, Long> {
}
