package mx.rafex.cursos.estructuraDeDatosYAlgoritmos.listasEnlazadas.simples;

public class UsandoListaSimpleEnlazada {

    public static void main(String[] args) {

        ListaSimpleEnlazada lista = new ListaSimpleEnlazada();

        System.out.println("Lista vacía: " + lista.vacia());

        lista.agregar(3);
        lista.agregar("Raúl");
        lista.agregar(34);

        System.out.println("Nodo 2: " + lista.obtener(2));
        System.out.println("Último nodo: " + lista.obtener(lista.getLongitud()));

        System.out.println("Número de nodos: " + lista.getLongitud());
        System.out.println("Lista vacía: " + lista.vacia());

        for (int i = 1; i <= lista.getLongitud(); i++) {
            System.out.println(lista.obtener(i));
        }


    }
}
