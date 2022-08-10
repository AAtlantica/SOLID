package a_estructura_final.service.impl;

import a_estructura_final.dto.EmpleadoDTO;
import a_estructura_final.service.EmpleadoEstadisticaServicio;

public class EmpleadoServicioEstadistica extends EmpleadoServicioImpl implements EmpleadoEstadisticaServicio {
    private int numeroEmpleadosGuardados = 0;
    @Override
    public void guadarEmpleado(EmpleadoDTO empleadoDTO) {
        super.guadarEmpleado(empleadoDTO);
        numeroEmpleadosGuardados++;
    }

    @Override
    public void obtenerEstadistica() {

        numeroEmpleadosGuardados ++;
    }
}
