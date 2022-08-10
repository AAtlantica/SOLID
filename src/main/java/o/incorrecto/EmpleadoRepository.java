package o.incorrecto;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoRepository {

    private int contarEmpleados = 0;
    EmpleadoMapper empleadoMapper = new EmpleadoMapper();
    //Simulacion de BD
    List<EmpleadoEntity> empleadoEntities = new ArrayList<EmpleadoEntity>();

    public void  guardarEmpleadoEntity(EmpleadoDTO empleadoDTO){
        EmpleadoEntity empleadoEntity = empleadoMapper.toEntity(empleadoDTO);
        empleadoEntities.add(empleadoEntity);
        contadorEmpleados();
    }

    public void leerBD(){
        for(EmpleadoEntity empleado : this.empleadoEntities){
            System.out.println(empleado);
        }
    }

    public void contadorEmpleados(){
        contarEmpleados++;
    }
}
