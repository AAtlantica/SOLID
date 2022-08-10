package a_estructura_final.mapper;

import a_estructura_final.dto.EmpleadoDTO;
import a_estructura_final.entities.EmpleadoEntity;

public class EmpleadoMapper {
    public EmpleadoEntity toEntity(EmpleadoDTO empleadoDTO){
        EmpleadoEntity empleadoEntity = new EmpleadoEntity();
        empleadoEntity.setNombre(empleadoDTO.getNombre());
        empleadoEntity.setApellido(empleadoDTO.getApellido());
        return  empleadoEntity;
    }
}
