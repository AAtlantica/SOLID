
## SOLID

En ingeniería de software, SOLID (Single responsibility, Open-closed, Liskov substitution, Interface segregation and Dependency inversion) es un acrónimo mnemónico introducido por Robert C. Martin comienzos de la década del 2000 que representa cinco principios básicos de la programación orientada a objetos y el diseño.

Los principios SOLID son guías que pueden ser aplicadas en el desarrollo de software para eliminar malos diseños provocando que el programador tenga que refactorizar el código fuente hasta que sea legible y extensible.

Puede ser utilizado con el desarrollo guiado por pruebas, y forma parte de la estrategia global del desarrollo ágil de software y desarrollo adaptativo de software.
## Definiciones SOLID

- (S)Single Responsibility Principle:principio de responsabilidad única	
  - "una clase, componente o servicio debe ser responsable de una sola cosa."
 
- (O)Open Close Principle : principio de abierto cerrado	
  - "las entidades de software deber estar abiertas para que las podamos extender pero cerradas a la hora de modificarlas."	
  - usando abstracción de clases(clases abstractas) no tengamos que ir a añadir funciones extras, sino extendiendo clases-

- (L)Liskov principle: principio de sustitución	
  - “objetos de un programa deberían ser reemplazables por instancias de sus subtipos sin alterar el correcto funcionamiento del programa”	
  - una clase hija se puede sustituir por la clase padre, si no podemos sustituir el programa falla y si falla es porque no estamos aplicando su principio	
  - el programa debe tener una jerarquía fácil de entender y además un código reutilizable.

- (I)Interface segregation, principio de segregación de interfaces	
  - “muchas interfaces cliente específicas son mejores que una interfaz de propósito general”.	
  - Las interfaces más grandes deben dividirse en otras más pequeñas. 	
  - Al hacerlo, podemos asegurarnos de que las clases de implementación solo necesitan preocuparse por los métodos que les interesan.
  - Una clase no debe depender de una interfaz que no va a utilizar.

- (D)Dependency inversión, inversión de dependencias	
  - “depender de abstracciones, no depender de implementaciones”	
  - Se refiere al desacoplamiento de módulos de software.	
  - Las dependencias se deben de abstraer y que un módulo de alto nivel no deben depender de un módulo de bajo nivel, ambos dependerán de abstracciones. 	
  - No vamos a utilizar llamadas a métodos muy concretos, sino vamos a intentar implementar métodos más abstractos de forma genérica.
  
## Conceptos

- [Estructura](https://github.com/AAtlantica/SOLID/blob/main/conceptos.md)  
- [Las 3 i](https://github.com/AAtlantica/SOLID/blob/main/lastresi.md)  
  
