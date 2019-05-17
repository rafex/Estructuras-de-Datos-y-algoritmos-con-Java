package mx.rafex.cursos.estructuraDeDatosYAlgoritmos;

public class Burbuja {

    public static void main(final String[] args) {

        final int[] ARREGLO = { 9, 5, 8, 2, 6, 1, 7, 3, 4 };

        System.out.println("Sin arreglar:");
        System.out.print("{");

        for (int i = 0; i < ARREGLO.length; i++) {
            if (i == (ARREGLO.length - 1)) {
                System.out.print(ARREGLO[i]);
            } else {
                System.out.print(ARREGLO[i] + ",");
            }
        }
        System.out.print("}");

        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");
        int intercambios = 0, comparaciones = 0;

        int aux = 0;
        for (int i = 1; i < ARREGLO.length; i++) {

            for (int j = ARREGLO.length - 1; j >= i; j--) {
                comparaciones++;
                if (ARREGLO[j - 1] > ARREGLO[j]) {
                    intercambios++;
                    aux = ARREGLO[j - 1];
                    ARREGLO[j - 1] = ARREGLO[j];
                    ARREGLO[j] = aux;
                }

                System.out.print("Itercambio: " + intercambios + " ");
                System.out.print("{");
                for (int x = 0; x < ARREGLO.length; x++) {
                    if (x == (ARREGLO.length - 1)) {
                        System.out.print(ARREGLO[x]);
                    } else {
                        System.out.print(ARREGLO[x] + ",");
                    }
                }
                System.out.print("}");
                System.out.println();

            }

        }

        System.out.println();

        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");

        System.out.println("Numero de intercambios:" + intercambios);
        System.out.println("Numero de comparaciones:" + comparaciones);

        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");

        System.out.println("Arreglado:");

        System.out.print("{");

        for (int i = 0; i < ARREGLO.length; i++) {
            if (i == (ARREGLO.length - 1)) {
                System.out.print(ARREGLO[i]);
            } else {
                System.out.print(ARREGLO[i] + ",");
            }
        }
        System.out.print("}");

    }

}
