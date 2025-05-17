# Explicación de los conceptos en las clases `Main` y `Saludo`

## 1. Paquetes (`package`)
Ambas clases usan la declaración `package modulo1.f_Paquetes_importacion;`.  
Esto organiza las clases dentro de un paquete, lo que ayuda a estructurar el proyecto y evitar conflictos de nombres.

## 2. Importación de clases (`import`)
En la clase `Main`, se usa `import modulo1.f_Paquetes_importacion.Saludo;` para poder utilizar la clase `Saludo` definida en el mismo paquete.

## 3. Definición de clases
- `public class Saludo`: Define una clase pública llamada `Saludo`.
- `public class Main`: Define la clase principal donde se ejecuta el programa.

## 4. Métodos
- `public void decirHola()`: Método de la clase `Saludo` que imprime un mensaje en consola.
- `public static void main(String[] args)`: Método principal que se ejecuta al iniciar el programa.

## 5. Creación de objetos
En `Main`, se crea un objeto de la clase `Saludo` con:
```java
Saludo saludo = new Saludo();