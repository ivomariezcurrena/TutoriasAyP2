public class TiposDeDatos {
    public static void main(String[] args) {
        // Tipos de datos primitivos
        byte edad = 30; // 1 byte
        short edad2 = 30; // 2 bytes
        int edad3 = 30; // 4 bytes
        long edad4 = 30; // 8 bytes
        float precio = 10.5f; // 4 bytes
        double precio2 = 10.5; // 8 bytes
        char letra = 'a'; // 2 bytes
        boolean verdadero = true; // 1 byte

        // Tipos de datos no primitivos
        String nombre = "Juan"; // Objeto String

        System.out.println("Edad: " + edad);
        System.out.println("Precio: " + precio);
        System.out.println("Nombre: " + nombre);
        System.out.println("Verdadero: " + verdadero);
        System.out.println("Letra: " + letra);
    }
}
