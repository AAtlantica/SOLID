package l.incorrecto;

public class EmpleadoServicioEstadistica extends EmpleadoServicioImpl {
    private int numeroEmpleadosGuardados = 0;
    @Override
    public void guadarEmpleado(EmpleadoDTO empleadoDTO) {
        super.guadarEmpleado(empleadoDTO);
        numeroEmpleadosGuardados++;
    }

    @Override
    public void obtenerEstadistica() {
        numeroEmpleadosGuardados++;
    }
}
