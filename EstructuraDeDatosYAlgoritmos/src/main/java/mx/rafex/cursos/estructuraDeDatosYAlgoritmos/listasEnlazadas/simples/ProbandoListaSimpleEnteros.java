package mx.rafex.cursos.estructuraDeDatosYAlgoritmos.listasEnlazadas.simples;

public class ProbandoListaSimpleEnteros {

    public static void main(String[] args) {

        ListaSimpleEnlazada<Integer> listaEnteros = new ListaSimpleEnlazada<>();

        listaEnteros.agregar(8);
        listaEnteros.agregar(111);
        listaEnteros.agregar(3);
        listaEnteros.agregar(2);
        listaEnteros.agregar(9);


        for (int i = 0; i < listaEnteros.getLongitud(); i++) {
            System.out.println("posicion: [" + i + "] = " + listaEnteros.obtener(i));
        }

    }

}

