# Strings, Clases Envoltorio y Tipos Enumerados en Java

En este ejemplo aprenderás tres conceptos muy importantes de Java: cómo manejar textos, cómo trabajar con números como objetos y cómo definir conjuntos de valores posibles usando enumeraciones.

---

## 1. String (Cadenas de texto)

```java
String mensaje = "Java es genial!";
System.out.println("Longitud del mensaje: " + mensaje.length());
```

- **¿Qué es un String?**  
  Es un tipo especial de dato en Java que sirve para guardar texto, como palabras o frases.
- **¿Qué hace `.length()`?**  
  Es un método que te dice cuántos caracteres tiene el texto (incluyendo espacios y signos).
- **¿Qué hace el ejemplo?**  
  Guarda el texto `"Java es genial!"` en la variable `mensaje` y luego imprime cuántos caracteres tiene ese texto.

---

## 2. Envoltorio (Wrapper Classes)

```java
Integer numero = Integer.valueOf(42);
System.out.println("El número más 10 es: " + (numero + 10));
```

- **¿Qué es una clase envoltorio?**  
  Es una forma de usar los tipos de datos básicos (como `int`, `double`, etc.) como si fueran objetos. Esto es útil porque los objetos tienen métodos y pueden usarse en colecciones.
- **¿Qué es `Integer`?**  
  Es la versión objeto del tipo de dato `int` (números enteros).
- **¿Qué hace el ejemplo?**  
  Crea un objeto `Integer` con el valor 42 y luego suma 10, mostrando el resultado.  
  Gracias a Java, puedes sumar directamente como si fuera un número normal.

---

## 3. Tipos Enumerados (enum)

```java
enum DiaSemana {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES
}
```

- **¿Qué es un enum?**  
  Es una forma de crear un tipo de dato que solo puede tener ciertos valores fijos.  
  Por ejemplo, los días de la semana laboral.
- **¿Para qué sirve?**  
  Hace tu código más claro y seguro, porque solo puedes usar los valores que definiste.

```java
DiaSemana dia = DiaSemana.LUNES;
System.out.println("Hoy es: " + dia);
```

- **¿Qué hace el ejemplo?**  
  Crea una variable llamada `dia` que solo puede tener uno de los valores del enum `DiaSemana`.  
  En este caso, se le asigna `LUNES` y luego se imprime ese valor.
