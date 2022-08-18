package sistemas.sistema_1.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sistemas.sistema_1.entidades.Cliente;
import sistemas.sistema_1.entidades.Proveedor;
import sistemas.sistema_1.servicios.IServicioCliente;
import sistemas.sistema_1.servicios.IServicioProveedor;

import java.util.List;

@RestController
public class ControladorProveedor {
    @Autowired
    private IServicioProveedor servicio;

    //Optener lista de trabajadores
    @GetMapping("/api/proveedores")//Ruta
    public List<Proveedor> getAll() {

        //Retornamos el servicio
        return servicio.getAll();

    }

    //Optener trabajador por id
    @GetMapping("/api/proveedor/{id}")//Ruta
    public Proveedor getByIdl(@PathVariable String id) {

        //Convertimos a Long
        Long NewId = Long.parseLong(id);

        //Retornamos el servicio
        return servicio.getById(NewId);

    }

    @DeleteMapping("/api/proveedor/eliminar/{id}")//Ruta
    public void removeById(@PathVariable String id) {

        //Convertimos a Long
        Long NewId = Long.parseLong(id);

        //Eliminamos por el servicio
        servicio.removeById(NewId);

    }

    @PostMapping("/api/proveedor/guardar")//Ruta
    public void saveProveedor(@RequestBody Proveedor proveedor) {

        //Guardamos por el servicio
        servicio.saveProveedor(proveedor);

    }
}
