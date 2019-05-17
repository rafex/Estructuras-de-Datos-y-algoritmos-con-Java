package mx.rafex.cursos.estructuraDeDatosYAlgoritmos.listasEnlazadas.simples;

public class Nodo {

    private Nodo siguiente;
    private Object dato;

    public Nodo(Object dato) {
        this.dato = dato;
        siguiente = null;
    }

    public void enlazar(Nodo n) {
        siguiente = n;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public Object getDato() {
        return dato;
    }

}
