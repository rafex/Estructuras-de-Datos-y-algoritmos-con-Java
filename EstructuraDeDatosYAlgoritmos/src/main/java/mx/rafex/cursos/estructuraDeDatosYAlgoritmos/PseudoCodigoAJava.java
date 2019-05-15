package mx.rafex.cursos.estructuraDeDatosYAlgoritmos;

public class PseudoCodigoAJava {

    public static void main(final String[] args) {

        final int[] PUNTOS = { 23, 4, 12, 323, 433, 12, 12, 1232 };
        System.out.println("número de datos " + PUNTOS.length);
        int suma = 0;
        System.out.println("datos del array");
        for (int i = 0; i < PUNTOS.length; i++) {
            System.out.println(PUNTOS[i]);
            suma = suma + PUNTOS[i];
        }
        final int media = suma / PUNTOS.length;
        System.out.println("La media es " + media);

    }

}
