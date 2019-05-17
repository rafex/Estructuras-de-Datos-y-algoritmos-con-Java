package mx.rafex.cursos.estructuraDeDatosYAlgoritmos.listasEnlazadas.simples;

public class UsandoListaSimpleEnlazada {

    public static void main(String[] args) {

        ListaSimpleEnlazada l = new ListaSimpleEnlazada();

        //System.out.println("Lista vacía: " + l.vacia());

        l.agregar(3);
        l.agregar("Jesus");
        l.agregar("Roberto");
        l.agregar('F');
        l.agregar("Jose");
        l.agregar("Maria");
        l.agregar(true);
        l.agregar(3.2);

        /*System.out.println("Nodo 2: " + l.obtener(2));
        System.out.println("Último nodo: " + l.obtener(l.getLongitud() - 1));

        System.out.println("Número de nodos: " + l.getLongitud());
        System.out.println("Lista vacía: " + l.vacia());*/

        /*for (int i = 0; i < l.getLongitud(); i++) {
            System.out.println(l.obtener(i));
        }*/

        int posicion = l.buscar("Jose");

        System.out.println("El dato 'Jose' está en la posición: " + posicion);


    }
}
