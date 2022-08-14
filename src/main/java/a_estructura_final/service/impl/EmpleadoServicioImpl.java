package a_estructura_final.service.impl;


import a_estructura_final.dto.EmpleadoDTO;
import a_estructura_final.entities.EmpleadoEntity;
import a_estructura_final.mapper.EmpleadoMapper;
import a_estructura_final.repository.EmpleadoRepository;
import a_estructura_final.service.EmpleadoServicio;

public class EmpleadoServicioImpl implements EmpleadoServicio {

    private final EmpleadoMapper empleadoMapper;
    private final EmpleadoRepository empleadoRepository;
    public EmpleadoServicioImpl(EmpleadoMapper empleadoMapper,
                                EmpleadoRepository empleadoRepository){
        this.empleadoMapper = empleadoMapper;
        this.empleadoRepository = empleadoRepository;

    }

    //EmpleadoMapper empleadoMapper = new EmpleadoMapper();
    //EmpleadoRepository empleadoRepository = new EmpleadoRepository();


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
