package l.correcto;

public class EmpleadoServicioEstadistica extends EmpleadoServicioImpl {
    private int numeroEmpleadosGuardados = 0;
    @Override
    public void guadarEmpleado(EmpleadoDTO empleadoDTO) {
        super.guadarEmpleado(empleadoDTO);
        numeroEmpleadosGuardados++;
    }

    public void obtenerEstadistica() {
        numeroEmpleadosGuardados++;
    }
}
