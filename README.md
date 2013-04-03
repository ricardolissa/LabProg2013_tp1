
Laboratorio de Programación y Lenguajes TP Nº1
==============================================


Se adjunta un proyecto netbeans con los package a usar en el trabajo.


1 -  Dentro del package “ar.edu.untdf.labprog.tp1.ejer1” se definen 3 clases, referentes a conexiones sql a diferentes servidores de base de datos. La clase Sql hace uso de estas conexiones para ejecutar querys. Se requiere independizar la lógica de la clase Sql del tipo de base de datos a utilizar, para esto utilizar el patrón “Factory Method”.  Escriba las clases refactorizadas en un package con nombre “ar.edu.untdf.labprog.tp1.ejer1.sol”.


2 -  Dentro del package “ar.edu.untdf.labprog.tp1.ejer2” hay una clase mssql, agregue la posibilidad de utilizar Ms Sql a la solución del ejercicio 1, utilizando la clase mssql como driver pero sin modificarla. Utilice el patrón adapter.

3 – Nombre algún Framework en java que utilice el patrón decorator, explique para que funcionalidad y como es utilizado el patrón.       
 

4 – El “ar.edu.untdf.labprog.tp1.ejer4”  contiene una clase ListaInt, implementa una lista de enteros y la ordenación por los algoritmos quicksort y mergesort. Refactorice el código utilizando el patrón strategy  de manera que se pueda utilizar la clase ListaInt independientemente del algoritmo de búsqueda a utilizar.

5 – Implemente el método búsqueda en la clase ListaInt  de manera independiente al algoritmo a usar utilizando el patrón strategy,  implemente la estrategia de búsqueda binaria y la estrategia de búsqueda secuencial a partir de la implementación dada en la página http://www.vogella.de/articles/JavaAlgorithmsSearch/article.html#binarysearch  .

6 -  El package “ar.edu.untdf.labprog.tp1.ejer6”  contiene una simulación del protocolo ftp, se implementan los siguiente comandos:  checkUser (chequea usuario), checkPass(chequea la clave), getFile (toma un archivo del ftp) y close (cierra la conexión),  el comportamiento de lo  comandos son dependientes del estado en que se encuentra el ftp. Refactorice el código utilizando el patrón state. 

7 – En que se diferencia el patrón state del patrón strategy? 

8 – Explique como se utiliza el patrón strategy en la implementación del LayoutManager del  api de java.

9 -  En el package “ar.edu.untdf.labprog.tp1.ejer9” va a encontrar una clase Validador  que extiende un JFrame, en el formulario hay 2 campos de tipo string, uno para documento y otro para email. 
Implemente una clase FieldValidator con un método validate()  que imprima si la validación es valida en la salida estándar. Implemente un método isValid() para los diferentes tipos de campos usando el patrón strategy .     

10 – Agregue a la solución del ejercicio anterior la validación para un campo texto que contenga una provincia argentina valida. No debe modificar la clase FieldValidator.


