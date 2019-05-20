package mx.rafex.cursos.estructuraDeDatosYAlgoritmos.listasEnlazadas.simples;

import mx.rafex.cursos.estructuraDeDatosYAlgoritmos.listasEnlazadas.Lista;

public class UsandoListaSimpleEnlazada {

    public static void main(String[] args) {

        Lista<Object> l = new ListaSimpleEnlazada<>();

        //System.out.println("Lista vacía: " + l.estaVacia());

        l.agregar(3);
        l.agregar("Jesus");
        l.agregar("Roberto");
        l.agregar('F');
        l.agregar("Jose");
        l.agregar("Laura");
        l.agregar(true);
        l.agregar(3.2);

        /*System.out.println("Nodo 2: " + l.obtener(2));
        System.out.println("Último nodo: " + l.obtener(l.getLongitud() - 1));

        System.out.println("Número de nodos: " + l.getLongitud());
        System.out.println("Lista vacía: " + l.estaVacia());*/

        for (int i = 0; i < l.getLongitud(); i++) {
            System.out.println(l.obtener(i));
        }

        int posicion = l.buscar("Jose");

        //System.out.println("El dato 'Jose' está en la posición: " + posicion);

        l.eliminar(2);

        System.out.println("---------");
        System.out.println("---------");

        for (int i = 0; i < l.getLongitud(); i++) {
            System.out.println(l.obtener(i));
        }

        System.out.println("---------");
        System.out.println("---------");

        l.eliminar(0);

        for (int i = 0; i < l.getLongitud(); i++) {
            System.out.println(l.obtener(i));
        }

        System.out.println("---------");
        System.out.println("---------");

        l.eliminar(l.getLongitud()-1);

        for (int i = 0; i < l.getLongitud(); i++) {
            System.out.println(l.obtener(i));
        }


    }
}
