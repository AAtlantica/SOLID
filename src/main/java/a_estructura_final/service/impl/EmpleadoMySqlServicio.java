package a_estructura_final.service.impl;

import a_estructura_final.dto.EmpleadoDTO;
import a_estructura_final.service.EmpleadoServicio;

public class EmpleadoMySqlServicio implements EmpleadoServicio {

    @Override
    public void guadarEmpleado(EmpleadoDTO empleadoDTO) {
        System.out.println("Guarde en MySql");
    }

    @Override
    public void leerBD() {
        System.out.println("Estoy leyende desde MySql");

    }
}
