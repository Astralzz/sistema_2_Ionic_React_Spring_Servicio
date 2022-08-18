package sistemas.sistema_1.entidades;

//ENTIDADES -> MODELOS

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

import javax.persistence.*;


/*se puede poner el @Getter y @Setter
arriba de la clase para abarcar
toda la clase*/

@Table(name = "trabajadores") //Esta clase es una tabla
@Entity //Esta clase es una entidad
@ToString
public class Trabajador {

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter
    @Setter
    private String nombre;
    @Getter
    @Setter
    private String apellido_m;
    @Getter
    @Setter
    private String apellido_p;
    @Getter
    @Setter
    private String telefono;
    @Getter
    @Setter
    private String sexo;
    @Getter
    @Setter
    private String email;
    @Getter
    @Setter
    private String direccion;
    @Getter
    @Setter
    private String cargo;
    @Getter
    @Setter
    private double salario;

}
