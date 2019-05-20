package mx.rafex.cursos.estructuraDeDatosYAlgoritmos;

public class CadenasEjemplos {

    public static void main(final String[] args) {

        final String nombre = "raul";

        final char[] arregloNombre = nombre.toCharArray();

        int valorNombre = 0;

        for (final char caracter : arregloNombre) {
            System.out.println(Integer.valueOf(caracter) + ":" + caracter);
            if (' ' != caracter) {
                valorNombre = valorNombre + caracter;
            }
        }

        System.out.println("El valor del nombre: " + nombre + " es de: " + valorNombre%2);

        valorNombre = 0;
        int i = 0;
        while (i < arregloNombre.length) {
            if (' ' != arregloNombre[i]) {
                valorNombre = valorNombre + arregloNombre[i];
            }
            i++;
        }

        System.out.println("El valor del nombre: " + nombre + " es de: " + valorNombre);

    }

}
