package mx.rafex.cursos.estructuraDeDatosYAlgoritmos.listasEnlazadas.simples;

import mx.rafex.cursos.estructuraDeDatosYAlgoritmos.listasEnlazadas.Lista;

public class ProbandoListaSimpleEnteros {

    public static void main(String[] args) {

        Lista<Double> listaEnteros = new ListaSimpleEnlazada<>();

        listaEnteros.agregar(8.0);
        listaEnteros.agregar(111.0);
        listaEnteros.agregar(9.0);
        listaEnteros.agregar(2.0);
        listaEnteros.agregar(32.2);


        for (int i = 0; i < listaEnteros.getLongitud(); i++) {
            System.out.println("posición: [" + i + "] = " + listaEnteros.obtener(i));
        }

        System.out.println("---------");

        listaEnteros.ordenar(Lista.ASCENDENTE);

        for (int i = 0; i < listaEnteros.getLongitud(); i++) {
            System.out.println("posición: [" + i + "] = " + listaEnteros.obtener(i));
        }


    }

}

