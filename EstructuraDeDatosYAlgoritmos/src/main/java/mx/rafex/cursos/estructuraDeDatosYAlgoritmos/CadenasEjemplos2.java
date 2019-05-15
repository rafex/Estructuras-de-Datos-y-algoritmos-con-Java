package mx.rafex.cursos.estructuraDeDatosYAlgoritmos;

public class CadenasEjemplos2 {

    public static void main(final String[] args) {

        final String nombre = "RAUL EDUARDO GONZALEZ ARGOTE";

        // "raul eduardo gonzalez argote".{'r','a','u','l',' ','e'}
        final char[] arregloNombre = nombre.toLowerCase().toCharArray();

        int valorNombre = 0;

        for (final char caracter : arregloNombre) {
            System.out.println(Integer.valueOf(caracter) + ":" + caracter);
            if (' ' != caracter) {
                valorNombre = valorNombre + caracter;
            }
        }

        System.out.println("El valor del nombre: " + nombre.toLowerCase() + " es de: " + valorNombre);

    }

}
