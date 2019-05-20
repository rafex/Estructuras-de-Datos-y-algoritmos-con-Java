package mx.rafex.cursos.estructuraDeDatosYAlgoritmos.listasEnlazadas.dobles;

import mx.rafex.cursos.estructuraDeDatosYAlgoritmos.listasEnlazadas.Lista;

public class ProbandoListaDoblementeEnlazada {

    public static void main(String[] args) {

        Lista<String> l = new ListaDoblementeEnlazada<>();

        l.agregar("jose");
        l.agregar("pedro");
        l.agregar("marco");

        for (int i = 0; i < l.getLongitud(); i++) {
            System.out.println(l.obtener(i));
        }

    }
}
