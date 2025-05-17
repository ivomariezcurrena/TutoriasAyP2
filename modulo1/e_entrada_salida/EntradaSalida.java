import java.util.Scanner;

public class EntradaSalida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresá tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("¿Cuántos años tenés?: ");
        int edad = scanner.nextInt();

        System.out.println("Hola " + nombre + ", tenés " + edad + " años.");
        scanner.close();
    }
}
