package d;

public class EmpleadoServicioImpl implements EmpleadoServicio {
    EmpleadoRepository empleadoRepository = new EmpleadoRepository();
    EmpleadoMapper empleadoMapper = new EmpleadoMapper();

    //Concreciones
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
