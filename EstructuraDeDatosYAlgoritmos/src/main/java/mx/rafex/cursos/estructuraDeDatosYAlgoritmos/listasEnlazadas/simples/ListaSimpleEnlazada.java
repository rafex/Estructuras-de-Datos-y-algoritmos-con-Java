package mx.rafex.cursos.estructuraDeDatosYAlgoritmos.listasEnlazadas.simples;

public class ListaSimpleEnlazada<E> {

    private Nodo cabecera;
    private int longitud;

    public ListaSimpleEnlazada() {
        this.cabecera = null;
        this.longitud = 0;
    }

    public void agregar(E valor) {
        if (cabecera == null) {
            cabecera = new Nodo(valor);
        } else {
            Nodo temp = cabecera;
            Nodo nuevo = new Nodo(valor);
            nuevo.enlazar(temp);
            cabecera = nuevo;
        }
        longitud++;
    }

    public boolean estaVacia() {
        return cabecera == null;
    }

    public Object obtener(int indice) {
        Nodo nodo = obtenerNodo(indice);
        if (nodo != null)
            return nodo.getDato();
        return null;
    }

    public int getLongitud() {
        return longitud;
    }

    public Integer buscar(E value) {
        for (int i = 0; i < this.longitud; i++) {
            if (this.obtener(i).equals(value)) {
                return i;
            }
        }
        return null;
    }

    public boolean eliminar(int indice) {
        boolean eliminado;
        Nodo nodoAnterior;
        Nodo nodoAEliminar;
        Nodo nodoSiguiente;
        try {
            nodoAEliminar = obtenerNodo(indice);
            nodoSiguiente = nodoAEliminar.getSiguiente();
            if (indice == 0) {
                nodoAEliminar.enlazar(null);
                nodoAEliminar = null;
                cabecera = nodoSiguiente;
                eliminado = true;
                longitud--;
                return eliminado;
            }

            nodoAnterior = obtenerNodo(indice - 1);
            if (indice == longitud - 1) {
                nodoAnterior.enlazar(null);
                nodoAEliminar = null;
                eliminado = true;
                longitud--;
                return eliminado;
            }

            nodoAnterior.enlazar(nodoSiguiente);
            nodoAEliminar = null;
            eliminado = true;
            longitud--;
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            eliminado = false;
        }

        return eliminado;
    }

    public void ordenar() {
        if (longitud > 1) {
            boolean wasChanged;

            do {
                Nodo current = cabecera;
                Nodo previous = null;
                Nodo next = cabecera.getSiguiente();
                wasChanged = false;

                while (next != null) {
                    if (((Comparable) current.getDato()).compareTo(next.getDato()) > 0) {
                        /*
                        // This is just a literal translation
                        // of bubble ordenar in an array
                        Node temp = currentNode;
                        currentNode = next;
                        next = temp;*/
                        wasChanged = true;

                        if (previous != null) {
                            Nodo sig = next.getSiguiente();

                            previous.enlazar(next);
                            next.enlazar(current);
                            current.enlazar(sig);
                        } else {
                            Nodo sig = next.getSiguiente();

                            cabecera = next;
                            next.enlazar(current);
                            current.enlazar(sig);
                        }

                        previous = next;
                        next = current.getSiguiente();
                    } else {
                        previous = current;
                        current = next;
                        next = next.getSiguiente();
                    }
                }
            } while (wasChanged);
        }
    }

    private Nodo obtenerNodo(int indice) {
        if (longitud != 0 && indice < longitud) {
            Nodo temp = cabecera;
            for (int i = 0; i < indice; i++) {
                temp = temp.getSiguiente();
            }
            return temp;
        } else {
            throw new ArrayIndexOutOfBoundsException("Excedió el limite del la lista");
        }
    }

}
