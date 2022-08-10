package d;

public class EmpleadoMapper {
    public EmpleadoEntity toEntity(EmpleadoDTO empleadoDTO){
        EmpleadoEntity empleadoEntity = new EmpleadoEntity();
        empleadoEntity.setNombre(empleadoDTO.getNombre());
        empleadoEntity.setApellido(empleadoDTO.getApellido());
        return  empleadoEntity;
    }
}
