# Explicación: Expresiones y Control de Flujo en Java

En la clase `ControlFlujo` se muestran ejemplos de las estructuras básicas de control de flujo en Java. Estas estructuras permiten tomar decisiones y repetir acciones en un programa.

---

## 1. Sentencia if-else

```java
if (edad >= 18) {
    System.out.println("Mayor de edad");
} else {
    System.out.println("Menor de edad");
}
```

- **¿Qué hace?**  
  Evalúa si la variable `edad` es mayor o igual a 18.  
  Si es cierto, imprime "Mayor de edad".  
  Si no, imprime "Menor de edad".
- **¿Para qué sirve?**  
  Permite que el programa tome decisiones según una condición.

---

## 2. Sentencia switch

```java
switch (dia) {
    case 1:
        System.out.println("Lunes");
        break;
    case 2:
        System.out.println("Martes");
        break;
    case 3:
        System.out.println("Miércoles");
        break;
    default:
        System.out.println("Otro día");
}
```

- **¿Qué hace?**  
  Evalúa el valor de la variable `dia` y ejecuta el bloque de código correspondiente.  
  Si `dia` es 1, imprime "Lunes"; si es 2, "Martes"; si es 3, "Miércoles".  
  Si no es ninguno de esos valores, imprime "Otro día".
- **¿Para qué sirve?**  
  Es útil cuando hay varias opciones posibles para una misma variable.

---

## 3. Bucle for

```java
for (int i = 0; i < 5; i++) {
    System.out.println("i = " + i);
}
```

- **¿Qué hace?**  
  Repite el bloque de código 5 veces, desde `i = 0` hasta `i = 4`.  
  En cada repetición, imprime el valor de `i`.
- **¿Para qué sirve?**  
  Permite ejecutar varias veces una acción, útil para recorrer listas o repetir tareas.
