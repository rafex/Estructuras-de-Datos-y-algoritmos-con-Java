package mx.rafex.cursos.estructuraDeDatosYAlgoritmos.listasEnlazadas.dobles;

import mx.rafex.cursos.estructuraDeDatosYAlgoritmos.listasEnlazadas.Lista;

public class ListaDoblementeEnlazada<E> implements Lista<E> {

    private Nodo cabecera;
    private Nodo cola;
    private int longitud;

    public ListaDoblementeEnlazada() {
        longitud = 0;
        cabecera = null;
        cola = null;
    }

    @Override
    public void agregar(E valor) {
        Nodo nodo = new Nodo(valor);
        if (cola == null && cabecera == null) {
            cola = nodo;
            cabecera = nodo;
        } else {
            cola.setSiguiente(nodo);
            nodo.setAnterior(cola);
            cola = nodo;
        }
        longitud++;
    }

    @Override
    public boolean estaVacia() {
        return cabecera == null && cola == null;
    }

    @Override
    public E obtener(int indice) {
        Nodo nodo = obtenerNodo(indice);
        if (nodo != null)
            return (E) nodo.getDato();
        return null;
    }

    @Override
    public int getLongitud() {
        return longitud;
    }

    @Override
    public Integer buscar(E value) {
        for (int i = 0; i < this.longitud; i++) {
            if (this.obtener(i).equals(value)) {
                return i;
            }
        }
        return null;
    }

    @Override
    public boolean eliminar(int indice) {
        return false;
    }

    @Override
    public void ordenar(int orden) {
        if (longitud > 1) {
            boolean cambiar;

            do {
                Nodo actual = cabecera;
                Nodo anterior = null;
                Nodo siguiente = cabecera.getSiguiente();
                cambiar = false;

                while (siguiente != null) {
                    switch (orden) {
                        case ASCENDENTE:
                            if (((Comparable) actual.getDato()).compareTo(siguiente.getDato()) > 0) {
                                cambiar = true;

                                if (anterior != null) {
                                    Nodo sig = siguiente.getSiguiente();

                                    anterior.setSiguiente(siguiente);
                                    siguiente.setSiguiente(actual);
                                    actual.setSiguiente(sig);
                                } else {
                                    Nodo sig = siguiente.getSiguiente();

                                    cabecera = siguiente;
                                    siguiente.setSiguiente(actual);
                                    actual.setSiguiente(sig);
                                }

                                anterior = siguiente;
                                siguiente = actual.getSiguiente();
                            } else {
                                anterior = actual;
                                actual = siguiente;
                                siguiente = siguiente.getSiguiente();
                            }
                            break;
                        case DESCENDENTE:
                            if (((Comparable) actual.getDato()).compareTo(siguiente.getDato()) < 0) {
                                cambiar = true;

                                if (anterior != null) {
                                    Nodo sig = siguiente.getSiguiente();

                                    anterior.setSiguiente(siguiente);
                                    siguiente.setSiguiente(actual);
                                    actual.setSiguiente(sig);
                                } else {
                                    Nodo sig = siguiente.getSiguiente();

                                    cabecera = siguiente;
                                    siguiente.setSiguiente(actual);
                                    actual.setSiguiente(sig);
                                }

                                anterior = siguiente;
                                siguiente = actual.getSiguiente();
                            } else {
                                anterior = actual;
                                actual = siguiente;
                                siguiente = siguiente.getSiguiente();
                            }
                            break;
                    }
                }
            } while (cambiar);
        }
    }

    @Override
    public void ordenar() {

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
