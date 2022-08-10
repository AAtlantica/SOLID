package a_estructura_final.repository;

import a_estructura_final.entities.EmpleadoEntity;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoRepository {

    List<EmpleadoEntity> empleadoEntities = new ArrayList<>();

    public void  guardarEmpleadoEntity(EmpleadoEntity empleadoEntity){

        empleadoEntities.add(empleadoEntity);
    }

    public void leerBD(){
        for(EmpleadoEntity empleado : this.empleadoEntities){
            System.out.println(empleado);
        }
    }
}
