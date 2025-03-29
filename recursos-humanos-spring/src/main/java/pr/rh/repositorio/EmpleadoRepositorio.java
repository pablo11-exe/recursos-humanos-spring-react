package pr.rh.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import pr.rh.modelo.Empleado;

public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer> {
    //Sirve para hacer las consultas a la base de datos de nuestra clase Entidad
}
