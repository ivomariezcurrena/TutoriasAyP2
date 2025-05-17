public class ControlFlujo {
    public static void main(String[] args) {
        int edad = 18;

        // if-else
        if (edad >= 18) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad");
        }

        // switch
        int dia = 3;
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

        // bucle for
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }
    }
}