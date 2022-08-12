# Inversion de dependencia
## Modulos de alto y bajo nivel
- Los módulos de alto nivel serían aquellos que tradicionalmente tienen dependencias.
- Los módulos de bajo nivel de los que dependen.
    - Esto quiere decir que un módulo de alto nivel seria donde se invoca la acción y de bajo nivel donde se realiza la acción.
    - Una conclusión razonable a sacar de este principio es que no debe existir una dependencia entre concreciones sino que se debe depender de una abstracción
    - Cuando hablamos de módulos de alto nivel nos referimos aquellos que están mas cerca de nuestros clientes, y los de bajo nivel son los que están mas cerca al núcleo o centro de nuestro sistema.

## Ventajas del Principio de inversion de dependencias:

- Hacemos que el código sea más flexible y escalable asi realizar los cambios sin afectar multiples lugares es mucho mas fácil.
- Se ocultan los detalles de implementación.
- Facilita la realizacion de pruebas unitarias ya que la pruebas puede inyectar mockups de los servicios a utilizar dentro del contructor.


https://es.wikipedia.org/wiki/Principio_de_inversi%C3%B3n_de_la_dependencia

http://xurxodev.com/profundizando-en-la-inversion-de-dependencia/

https://medium.com/@ricardo.zelaya/principio-de-inversi%C3%B3n-de-dependencias-dependency-inversion-2c48cd6dc0f8


# Inversion de Control

- Forma Tradicional: el programados es el encargado de definir la secuencia de operaciones que se deben de realizar para llegar a un resultado.
## Gráficamente

![IC](https://oscarblancarteblog.com/wp-content/uploads/2016/11/InversionOfControl.png)

- Pero qué pasaría si invirtiéramos la forma de trabajo, y que en lugar de que la App llame funciones del Framework, sea el Framework el que ejecute operaciones sobre la App

![IC](https://oscarblancarteblog.com/wp-content/uploads/2016/11/InversionOfControl2.png)

-IoC se basa en la introspección (en Java llamado Reflection) el cual es un procedimiento por el cual leemos metadatos de la App que nos permita entender cómo funciona, los metadatos pueden estar expresados principalmente de dos formas, la primera es mediante archivos de configuración como XML o con metadados directamente definidos sobre las clases de nuestro programa, en Java estos metadatos son las @Annotations o anotaciones y es por medio de estos metadatos y con técnicas de introspección que es posible entender el funcionamiento de la App
https://www.oscarblancarteblog.com/2016/12/01/concepto-inversion-of-control/

# Inyeccion de dependencia

- En informática, inyección de dependencias (en inglés Dependency Injection, DI) es un patrón de diseño orientado a objetos, en el que se suministran objetos a una clase en lugar de ser la propia clase la que cree dichos objetos.
- Esos objetos cumplen contratos que necesitan nuestras clases para poder funcionar (de ahí el concepto de dependencia).
- Nuestras clases no crean los objetos que necesitan, sino que se los suministra otra clase 'contenedora' que inyectará la implementación deseada a nuestro contrato.1​

# Implementación del patrón en Java: El contenedor
- La forma habitual de implementar este patrón es mediante un "Contenedor DI", también llamado "Contenedor IoC" y objetos planos o simples por ejemplo los llamados POJO en Java.
    - El contenedor inyecta a cada objeto los objetos necesarios según las relaciones de dependencia registradas en la configuración previa.
- Típicamente este contenedor es implementado por un framework externo a la aplicación (como Spring entre otros), por lo cual en la aplicación también se utilizará inversión de control al ser el contenedor (almacenado en una biblioteca) quien invoque el código de la aplicación.

https://es.wikipedia.org/wiki/Inyecci%C3%B3n_de_dependencias


