package mx.rafex.cursos.estructuraDeDatosYAlgoritmos.listasEnlazadas.simples;

public interface Lista<E> {

    int ASCENDENTE = 1;
    int DESCENDENTE = 0;

    void agregar(E valor);

    boolean estaVacia();

    Object obtener(int indice);

    int getLongitud();

    Integer buscar(E value);

    boolean eliminar(int indice);

    void ordenar(int orden);
}
