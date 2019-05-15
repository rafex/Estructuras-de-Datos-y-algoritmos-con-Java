package mx.rafex.cursos.estructuraDeDatosYAlgoritmos;

public class Cadenas {

    public static void main(final String[] args) {

        final String nombre = "JUAN PEDRO ORTEGA";
        System.out.println("variable nombre: " + nombre + " longitud: " + nombre.length());
        final String subString = nombre.substring(5, 10);
        System.out.println("Substring(5,10): " + subString);

        final char caracter = nombre.charAt(5);
        final int valorCaracter = caracter;
        System.out.println("Con charAt(5): " + caracter + " y el valor del caracter es: " + valorCaracter);
        System.out.println("Con substring(5,6): " + nombre.substring(5, 6));

        final String pedro = "pedro";
        final String jose = "jose";

        if (pedro.compareTo(jose) == 0) {
            System.out.println("Son iguales " + pedro + " y " + jose);
        } else if (pedro.compareTo(jose) < 0) {
            System.out.println("Es Mayor " + pedro + " que " + jose);
        } else if (pedro.compareTo(jose) > 0) {
            System.out.println("Es Menor " + pedro + " que " + jose);
        }

        if ('P' < 'p') {
            System.out.println("Si, 'P' es menor que 'p'");
        }

    }

}
