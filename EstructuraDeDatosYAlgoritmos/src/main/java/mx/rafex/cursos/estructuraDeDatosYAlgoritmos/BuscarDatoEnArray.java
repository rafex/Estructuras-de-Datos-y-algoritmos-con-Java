package mx.rafex.cursos.estructuraDeDatosYAlgoritmos;

public class BuscarDatoEnArray {

    public static void main(final String[] args) {

        final int[] vector = { 34, 23, 42, 234, 45, 65, 56, 53, 23, 4, 25364 };
        final int valorBuscado = 65;

        boolean encontrado = false;

        int i = 0;

        while ((i < vector.length) && (encontrado == false)) {
            if (valorBuscado == vector[i]) {
                System.out.println("Se encontró el elemento buscado en la posición " + i);
                encontrado = true;
            } else {
                i = i + 1;
            }
        }

        if (i == (vector.length - 1)) {
            System.out.println("No se encuentra el elemento");
        } else {
            System.out.println("El elemento se encuentra en la posición " + i);

        }

    }

}
