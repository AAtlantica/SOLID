package a_estructura_final.controller;

import a_estructura_final.dto.EmpleadoDTO;
import a_estructura_final.service.EmpleadoServicio;
import a_estructura_final.service.impl.EmpleadoServicioImpl;

public class prueba {
    public static void main(String[] args) {
        EmpleadoDTO empleadoDTO = new EmpleadoDTO();
        empleadoDTO.setNombre("Mauricio");
        empleadoDTO.setApellido("Lopez");

        EmpleadoServicio empleadoServicio = new EmpleadoServicioImpl();

        guardarEmpleado(empleadoServicio, empleadoDTO);

    }

    public static  void guardarEmpleado(EmpleadoServicio empleadoServicio, EmpleadoDTO empleadoDTO){
        empleadoServicio.guadarEmpleado(empleadoDTO);
    }
}
