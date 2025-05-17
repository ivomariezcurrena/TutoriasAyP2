
public class Persona {
    String nombre;
    int edad;
    boolean esEstudiante;

    public Persona(String nombre, int edad, boolean esEstudiante) {
        this.nombre = nombre;
        this.edad = edad;
        this.esEstudiante = esEstudiante;
    }

    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }

    public static void main(String[] args) {
        Persona p = new Persona("Ivo", 22, true);
        p.saludar();
    }
}
