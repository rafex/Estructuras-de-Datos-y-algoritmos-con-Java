package mx.rafex.cursos.estructuraDeDatosYAlgoritmos.listasEnlazadas.dobles;

public class Nodo {

    private Object dato;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo(Object dato) {
        this.dato = dato;
        siguiente = null;
        anterior = null;
    }

    public Object getDato() {
        return dato;
    }


    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
}
