package d;

public class EmpleadoMySqlServicio implements EmpleadoServicio {

    @Override
    public void guadarEmpleado(EmpleadoDTO empleadoDTO) {
        System.out.println("Guarde en MySql");
    }

    @Override
    public void leerBD() {
        System.out.println("Estoy leyende desde MySql");

    }
}
