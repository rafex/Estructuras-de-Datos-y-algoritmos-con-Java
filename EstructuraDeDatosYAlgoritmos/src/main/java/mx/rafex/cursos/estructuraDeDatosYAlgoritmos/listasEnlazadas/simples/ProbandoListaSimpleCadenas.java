package mx.rafex.cursos.estructuraDeDatosYAlgoritmos.listasEnlazadas.simples;

import mx.rafex.cursos.estructuraDeDatosYAlgoritmos.listasEnlazadas.Lista;

public class ProbandoListaSimpleCadenas {

    public static void main(String[] args) {

        Lista<String> l = new ListaSimpleEnlazada<>();

        l.agregar("jose");
        l.agregar("pedro");
        l.agregar("marco");

        for (int i = 0; i < l.getLongitud(); i++) {
            System.out.println(l.obtener(i));
        }

        System.out.println("----------");

        l.ordenar();

        for (int i = 0; i < l.getLongitud(); i++) {
            System.out.println(l.obtener(i));
        }
    }
}
