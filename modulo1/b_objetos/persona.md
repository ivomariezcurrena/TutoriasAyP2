# Explicación de la clase `Persona` en Java

La clase `Persona` es un ejemplo básico de cómo se definen y utilizan objetos en Java. A continuación se explican sus componentes principales:

## 1. Definición de la clase

```java
public class Persona {
    String nombre;
    int edad;
    boolean esEstudiante;

    public Persona(String nombre, int edad, boolean esEstudiante) {
        this.nombre = nombre;
        this.edad = edad;
        this.esEstudiante = esEstudiante;
    }
}
```

- **Clase:** Es una plantilla para crear objetos. En este caso, la clase se llama `Persona`.
- **Atributos:** Son las características de la persona: `nombre` (texto), `edad` (número entero) y `esEstudiante` (valor verdadero o falso).
- **Constructor:** Es un método especial que se llama al crear un objeto. Permite asignar valores iniciales a los atributos.

## 2. ¿Cómo se usa esta clase?

Para crear un objeto de tipo `Persona` y asignarle valores, se hace así:

```java
Persona persona1 = new Persona("Ana", 25, true);
```

Esto crea una persona llamada Ana, de 25 años, que es estudiante.

## 3. Resumen

Esta clase muestra cómo definir atributos y un constructor en Java, y cómo crear un objeto a partir de esa clase.
