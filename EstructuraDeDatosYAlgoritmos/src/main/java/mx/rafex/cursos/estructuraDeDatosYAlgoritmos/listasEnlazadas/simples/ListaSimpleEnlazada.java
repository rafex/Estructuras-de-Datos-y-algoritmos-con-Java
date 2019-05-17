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
        if (longitud != 0 && indice < longitud) {
            Nodo temp = cabecera;
            for (int i = 0; i < indice; i++) {
                temp = temp.getSiguiente();
            }
            return temp.getDato();
        }
        throw new ArrayIndexOutOfBoundsException("Excedio el limite del la lista");
    }

    public int getLongitud() {
        return longitud;
    }
}
