package mx.rafex.cursos.estructuraDeDatosYAlgoritmos.listasEnlazadas.simples;

public class ListaSimpleEnlazada {

    private Nodo cabecera;
    private int longitud;

    public ListaSimpleEnlazada() {
        this.cabecera = null;
        this.longitud = 0;
    }

    public void agregar(Object o) {
        if (cabecera == null) {
            cabecera = new Nodo(o);
        } else {
            Nodo temp = cabecera;
            Nodo nuevo = new Nodo(o);
            nuevo.enlazar(temp);
            cabecera = nuevo;
        }
        longitud++;
    }

    public boolean vacia() {
        if (cabecera == null) {
            return true;
        } else {
            return false;
        }
        //return cabecera == null ? true : false;
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

    public Integer buscar(Object o) {
        for (int i = 0; i < this.longitud; i++) {
            if (this.obtener(i).equals(o)) {
                return i;
            }
        }
        return null;
    }

    public boolean eliminar(int indice) {
        boolean eliminado = false;
        Nodo nodoAnterior;
        Nodo nodoAEliminar;
        Nodo nodoSiguiente;
        try {
            nodoAEliminar = obtenerNodo(indice);
            nodoSiguiente = nodoAEliminar.getSiguiente();
            if(indice == 0){
                nodoAEliminar.enlazar(null);
                cabecera = nodoSiguiente;
                eliminado = true;
                longitud--;
                return eliminado;
            }

            nodoAnterior = obtenerNodo(indice - 1);
            if (indice == longitud - 1) {
                nodoAnterior.enlazar(null);
                eliminado = true;
                longitud--;
                return eliminado;
            }

            nodoAnterior.enlazar(nodoSiguiente);
            eliminado = true;
            longitud--;
        } catch (NullPointerException e) {
            eliminado = false;
        } catch (ArrayIndexOutOfBoundsException e) {
            eliminado = false;
        }

        return eliminado;
    }

    private Nodo obtenerNodo(int indice) {
        if (longitud != 0 && indice < longitud) {
            Nodo temp = cabecera;
            for (int i = 0; i < indice; i++) {
                temp = temp.getSiguiente();
            }
            return temp;
        } else {
            throw new ArrayIndexOutOfBoundsException("Excedio el limite del la lista");
        }
    }
}
