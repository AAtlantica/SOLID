package a_estructura_final.controller;


import a_estructura_final.dto.EmpleadoDTO;
import a_estructura_final.mapper.EmpleadoMapper;
import a_estructura_final.repository.EmpleadoRepository;
import a_estructura_final.service.EmpleadoServicio;
import a_estructura_final.service.impl.EmpleadoServicioImpl;

public class prueba {
    private static final EmpleadoMapper empleadoMapper = new EmpleadoMapper();
    private static final EmpleadoRepository empleadoRepository = new EmpleadoRepository();

    //Aplicando Inyección de Dependencia
    private static final EmpleadoServicio empleadoServicio = new EmpleadoServicioImpl(empleadoMapper, empleadoRepository);
    public static void main(String[] args) {

        EmpleadoDTO empleadoDTO = new EmpleadoDTO();
        empleadoDTO.setNombre("Mauricio");
        empleadoDTO.setApellido("Lopez");

        //llamadas a funciones
        guardarEmpleado(empleadoServicio, empleadoDTO);

        leerBD(empleadoServicio);

    }

    public static  void guardarEmpleado(EmpleadoServicio empleadoServicio, EmpleadoDTO empleadoDTO){
        empleadoServicio.guadarEmpleado(empleadoDTO);
    }

    public static void leerBD(EmpleadoServicio empleadoServicio){
        empleadoServicio.leerBD();
    }
}
