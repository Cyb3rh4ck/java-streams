# java-streams
En **Java 21**, un **Stream** es una **abstracción** que te permite trabajar con **secuencias de datos** de forma funcional y eficiente. Un *Stream* no es una estructura de datos en sí, sino una forma de procesar datos en colecciones (como listas, conjuntos, etc.) o fuentes de datos, de manera declarativa, usando operaciones como **map**, **filter**, y **reduce**.

##### Características de un StreamCaracterísticas de un Stream
- **Inmutable**: Los Streams no modifican la colección original, sino que crean una nueva con los resultados.

- **Lazy Evaluation**: Las operaciones intermedias (como filter y map) son evaluadas solo cuando se invoca una operación terminal (como collect).

- **Pueden ser paralelizados**: Utilizando parallelStream() para mejorar el rendimiento en sistemas con múltiples núcleos.

##### Operaciones comunes con Streams
- **Intermedias** (no desencadenan la ejecución hasta que se use una operación terminal):
 - **filter()**: Filtrar elementos según una condición.
 
 - **map()**: Transformar cada elemento a otro tipo u otra forma.
 
 - **sorted()**: Ordenar los elementos.
 
 - **distinct()**: Eliminar duplicados.
 
- **Terminales** (desencadenan la ejecución del stream):

 - **forEach()**: Ejecutar una acción para cada elemento.
 
 - **collect()**: Recoger los elementos en una colección.
 
 - **reduce()**: Reducir los elementos a un solo resultado (por ejemplo, sumarlos).
 
 - **count()**: Contar los elementos.
 
##### Ventajas de usar Streams
- Código más **conciso** y **legible**.

- Facilita el **procesamiento paralelo** para mejorar el rendimiento.

- Permite un estilo de programación más **funcional**.

Los Streams son una herramienta muy poderosa en Java, especialmente en las versiones más recientes (como Java 21) que optimizan aún más su uso.

