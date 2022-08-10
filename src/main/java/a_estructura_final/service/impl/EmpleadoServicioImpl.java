package a_estructura_final.service.impl;

import a_estructura_final.dto.EmpleadoDTO;
import a_estructura_final.entities.EmpleadoEntity;
import a_estructura_final.mapper.EmpleadoMapper;
import a_estructura_final.repository.EmpleadoRepository;
import a_estructura_final.service.EmpleadoServicio;

public class EmpleadoServicioImpl implements EmpleadoServicio {
    EmpleadoRepository empleadoRepository = new EmpleadoRepository();
    EmpleadoMapper empleadoMapper = new EmpleadoMapper();

    @Override
    public void guadarEmpleado(EmpleadoDTO empleadoDTO) {
      EmpleadoEntity empleadoEntity = empleadoMapper.toEntity(empleadoDTO);
      empleadoRepository.guardarEmpleadoEntity(empleadoEntity);
        System.out.println("Guarde en Empleado Servicio");
    }

    @Override
    public void leerBD() {
        empleadoRepository.leerBD();
    }

}
