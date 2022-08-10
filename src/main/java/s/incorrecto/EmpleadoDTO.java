package s.incorrecto;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoDTO {

    private String nombre;
    private String apellido;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //Simulacion de BD
    List<EmpleadoEntity> empleadoEntities = new ArrayList<EmpleadoEntity>();

    public void  guardarEmpleadoEntity(EmpleadoDTO empleadoDTO){

        EmpleadoEntity empleadoEntity = new EmpleadoEntity();
        empleadoEntity.setNombre(empleadoDTO.getNombre());
        empleadoEntity.setApellido(empleadoDTO.getApellido());
        empleadoEntities.add(empleadoEntity);

        //Lee la BD
        for(EmpleadoEntity empleado : empleadoEntities){
            System.out.println(empleado);
        }

    }
}

class EmpleadoEntity {
    private String nombre;
    private String apellido;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    @Override
    public String toString() {
        return "incorrecto.EmpleadoEntity{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}



