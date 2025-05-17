enum DiaSemana {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES
}

public class EjemploEnum {
    public static void main(String[] args) {
        String mensaje = "Java es genial!";
        System.out.println("Longitud del mensaje: " + mensaje.length());

        Integer numero = Integer.valueOf(42);
        System.out.println("El número más 10 es: " + (numero + 10));

        DiaSemana dia = DiaSemana.LUNES;
        System.out.println("Hoy es: " + dia);
    }
}