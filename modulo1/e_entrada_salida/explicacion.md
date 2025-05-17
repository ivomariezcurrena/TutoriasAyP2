# Explicación de la clase EntradaSalida

La clase `EntradaSalida` muestra cómo realizar operaciones básicas de entrada y salida en Java usando la clase `Scanner`.

## Conceptos utilizados

- **Importación de clases**:  
  Se importa `java.util.Scanner` para poder leer datos desde la consola.

- **Creación de un objeto Scanner**:  
  `Scanner scanner = new Scanner(System.in);`  
  Se crea un objeto `Scanner` que permite leer datos ingresados por el usuario desde la entrada estándar (teclado).

- **Lectura de Strings**:  
  `String nombre = scanner.nextLine();`  
  Se utiliza el método `nextLine()` para leer una línea completa de texto ingresada por el usuario.

- **Lectura de enteros**:  
  `int edad = scanner.nextInt();`  
  Se utiliza el método `nextInt()` para leer un número entero ingresado por el usuario.

- **Salida de datos**:  
  Se usa `System.out.print` y `System.out.println` para mostrar mensajes y resultados en la consola.

- **Cierre del Scanner**:  
  `scanner.close();`  
  Es recomendable cerrar el objeto `Scanner` al finalizar su uso para liberar recursos.
