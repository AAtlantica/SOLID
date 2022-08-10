package o.correcto;


public interface EmpleadoServicio {

    abstract void guadarEmpleado(EmpleadoDTO empleadoDTO);

    abstract void leerBD();
}
