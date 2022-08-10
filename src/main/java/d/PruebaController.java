package d;

public class PruebaController {
    public static void main(String[] args) {
        EmpleadoDTO empleadoDTO = new EmpleadoDTO();
        empleadoDTO.setNombre("Mauricio");
        empleadoDTO.setApellido("Lopez");

        EmpleadoServicio empleadoServicio = new EmpleadoServicioImpl();

        guardarEmpleado(empleadoServicio, empleadoDTO);

    }

    //abstracciones
    public static  void guardarEmpleado(EmpleadoServicio empleadoServicio, EmpleadoDTO empleadoDTO){
        empleadoServicio.guadarEmpleado(empleadoDTO);
    }
}
