package mx.rafex.cursos.estructuraDeDatosYAlgoritmos.tablaHash;

import mx.rafex.cursos.estructuraDeDatosYAlgoritmos.listasEnlazadas.Lista;
import mx.rafex.cursos.estructuraDeDatosYAlgoritmos.listasEnlazadas.simples.ListaSimpleEnlazada;

public class TablaHash {

    private int longitud;
    private Lista lista[];

    public TablaHash(int longitud) {
        this.longitud = longitud;
        lista = new ListaSimpleEnlazada[longitud];
        for (int i = 0; i < longitud; i++) {
            lista[i] = new ListaSimpleEnlazada();
        }
    }

    public int insertar(String valor) {
        int hash = getHash(valor);

        System.out.println("Valor: " + valor + " hash: " + hash);

        if (hash < longitud) {
            lista[hash].agregar(valor);
            return hash;
        } else {
            lista[longitud - 1].agregar(valor);
            return longitud - 1;
        }
    }

    public ListaSimpleEnlazada obtener(int clave) {
        if (clave < longitud){
            return (ListaSimpleEnlazada) lista[clave];
        }
        return null;
    }

    public Integer seEncuentra(String valor){
        int hash = getHash(valor);

        if(hash < longitud){
            if(lista[hash].buscar(valor) != null){
                return hash;
            }
        } else {
            if(lista[longitud-1].buscar(valor) != null){
                return longitud-1;
            }
        }

        return null;
    }
    public Boolean eliminar(String valor){
        int hash = getHash(valor);

        if(hash < longitud){
            Integer i = lista[hash].buscar(valor);
            if(  i != null){
                return lista[hash].eliminar(i);
            }
        } else {
            Integer i = lista[longitud-1].buscar(valor);
            if(  i != null){
                return lista[longitud-1].eliminar(i);
            }
        }

        return false;
    }

    private int getHash(String cadena) {
        int valor = 0;

        for (final char caracter : cadena.toCharArray()) {
//            System.out.println(Integer.valueOf(caracter) + ":" + caracter);
            valor = valor + caracter;
        }

        return valor % 2;
    }
}
