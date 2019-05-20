package mx.rafex.cursos.estructuraDeDatosYAlgoritmos.listasEnlazadas.dobles;

import mx.rafex.cursos.estructuraDeDatosYAlgoritmos.listasEnlazadas.Lista;

public class ProbandoListaDoblementeEnlazada {

    public static void main(String[] args) {

        Lista<String> l = new ListaDoblementeEnlazada<>();

        l.agregar("Imanol");
        l.agregar("Israel");
        l.agregar("Carlos");
        l.agregar("Gustavo");
        l.agregar("Luis");
        l.agregar("Alejandro");
        l.agregar("Sergio");
        l.agregar("Raul");

        for (int i = 0; i < l.getLongitud(); i++) {
            System.out.println(l.obtener(i));
        }

        System.out.println("---");


    }
}
