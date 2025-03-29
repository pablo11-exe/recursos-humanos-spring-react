package pr.rh.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity //representa la tabla de base de datos
@Data //se generan los metodos get y set por cada atributo de la clase
@NoArgsConstructor
@AllArgsConstructor //Los constructores no es necesario codearlos, Lombok los agrega
@ToString //metodo simple de toString, se ahorra código
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Se genera de manera automática la llave primaria
    Integer idEmpleado;
    String nombre;
    String departamento;
    Double sueldo;
}
