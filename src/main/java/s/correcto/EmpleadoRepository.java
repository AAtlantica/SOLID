package s.correcto;

import s.incorrecto.EmpleadoDTO;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoRepository {
    EmpleadoMapper empleadoMapper = new EmpleadoMapper();
    //Simulacion de BD
    List<EmpleadoEntity> empleadoEntities = new ArrayList<EmpleadoEntity>();

    public void  guardarEmpleadoEntity(EmpleadoDTO empleadoDTO){
        EmpleadoEntity empleadoEntity = empleadoMapper.toEntity(empleadoDTO);
        empleadoEntities.add(empleadoEntity);
    }

    public void leerBD(){
        for(EmpleadoEntity empleado : this.empleadoEntities){
            System.out.println(empleado);
        }
    }

}
