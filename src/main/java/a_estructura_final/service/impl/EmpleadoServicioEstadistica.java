package a_estructura_final.service.impl;

import a_estructura_final.dto.EmpleadoDTO;
import a_estructura_final.mapper.EmpleadoMapper;
import a_estructura_final.repository.EmpleadoRepository;
import a_estructura_final.service.EmpleadoEstadisticaServicio;

public class EmpleadoServicioEstadistica extends EmpleadoServicioImpl implements EmpleadoEstadisticaServicio {
    private int numeroEmpleadosGuardados = 0;

    public EmpleadoServicioEstadistica(EmpleadoMapper empleadoMapper, EmpleadoRepository empleadoRepository) {
        super(empleadoMapper, empleadoRepository);
    }


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
