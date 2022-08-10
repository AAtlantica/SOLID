## DTO
- Data Transfer Object:
    - Los DTO son un tipo de objetos que sirven únicamente para transportar datos.
    - Normalmente, no provee lógica de negocios o validaciones de ningún tipo.
    - Con este modelo se obtiene, la separación entre el Controlador y el Modelo. 
    - Ante cualquier cambio que se diera en la forma de acceder a los datos, el modelo no se va a modificar, ya que recibe el mismo DTO.

## Entity
- Entidad de Persistencia:
    - Una entidad de persistencia (entity) es una clase de Java ligera, cuyo estado es persistido de manera asociada a una tabla en una base de datos relacional. 
    - Las instancias de estas entidades corresponden a un registro (conjunto de datos representados en una fila) en la tabla.
## Mapper
- El concepto de Java Mapping hace referencia normalmente a operaciones de mapeo o transformación que necesitamos realizar sobre nuestras clases     
## Repository
- Clase que se encarga de gestionar todas las operaciones de persistencia contra una tabla de la base de datos.

## Sevice
- Habitualmente se conecta con varios repositorios y agrupa su funcionalidad
- La capa de servicios de negocio consiste en la lógica que realiza las funciones principales de la aplicación: 
  - procesamiento de datos. 
  - implementación de funciones de negocios. 
  - coordinación de varios usuarios. 
  - administración de recursos externos como, por ejemplo, bases de datos.