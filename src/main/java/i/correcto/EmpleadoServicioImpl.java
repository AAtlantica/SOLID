package i.correcto;

public class EmpleadoServicioImpl implements EmpleadoServicio {
    EmpleadoRepository empleadoRepository = new EmpleadoRepository();
    EmpleadoMapper empleadoMapper = new EmpleadoMapper();

    @Override
    public void guadarEmpleado(EmpleadoDTO empleadoDTO) {
      EmpleadoEntity empleadoEntity = empleadoMapper.toEntity(empleadoDTO);
      empleadoRepository.guardarEmpleadoEntity(empleadoEntity);
    }

    @Override
    public void leerBD() {
        empleadoRepository.leerBD();
    }

}
