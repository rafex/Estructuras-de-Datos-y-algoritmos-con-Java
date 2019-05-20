package mx.rafex.cursos.estructuraDeDatosYAlgoritmos.tablaHash;

import mx.rafex.cursos.estructuraDeDatosYAlgoritmos.listasEnlazadas.simples.ListaSimpleEnlazada;

public class ProbandoTablaHash {

    public static void main(String[] args) {

        TablaHash miTabla = new TablaHash(10);

        miTabla.insertar("jose");
        miTabla.insertar("pedro");
        miTabla.insertar("rosa");
        miTabla.insertar("luis");
        miTabla.insertar("maria");
        miTabla.insertar("luna");
        int hash = miTabla.insertar("sol");

        ListaSimpleEnlazada lista = miTabla.obtener(hash);

        for (int i = 0; i < lista.getLongitud(); i++) {
            System.out.println(lista.obtener(i));
        }

        int nuevoHash = miTabla.seEncuentra("sol");
        System.out.println("sol esta en la posicion " + nuevoHash);

        boolean resultado = miTabla.eliminar("sol");

        if (resultado) {
            System.out.println("Si se elimino sol");
        }

        nuevoHash = miTabla.seEncuentra("sol");
        System.out.println("sol esta en la posicion " + nuevoHash);

    }

}
