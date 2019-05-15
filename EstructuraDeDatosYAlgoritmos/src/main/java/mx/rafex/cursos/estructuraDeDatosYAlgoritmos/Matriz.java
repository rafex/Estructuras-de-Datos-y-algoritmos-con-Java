package mx.rafex.cursos.estructuraDeDatosYAlgoritmos;

/**
 *
 * @author rafex
 */
public class Matriz {

    public static void main(final String[] args) {

        // int[][] matriz = new int[6][6];

        final int[][] matriz = { { 0, 1, 0, 1, 0, 1 }, { 0, 1, 0, 1, 0, 1 }, { 0, 1, 0, 1, 0, 1 }, { 0, 1, 0, 1, 0, 1 },
                { 0, 1, 0, 1, 0, 1 }, { 0, 1, 0, 1, 0, 1 } };

        final Object objeto;

        for (final int[] element : matriz) {
            System.out.println();
            for (int y = 0; y < element.length; y++) {
                System.out.print("[" + element[y] + "]");
            }

        }

    }

}
