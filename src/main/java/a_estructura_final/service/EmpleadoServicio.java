package a_estructura_final.service;


import a_estructura_final.dto.EmpleadoDTO;

public interface EmpleadoServicio {
    void guadarEmpleado(EmpleadoDTO empleadoDTO);
    void leerBD();
}
