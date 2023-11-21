package MODELO;

public class ArbolBinario {

    static class Nodo {

        int dato;
        Nodo izquierda;
        Nodo derecha;

        public Nodo(int dato) {
            this.dato = dato;
            this.izquierda = null;
            this.derecha = null;
        }
    }

    Nodo raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public void insertar(int dato) {
        raiz = insertarRec(raiz, dato);
    }

    private Nodo insertarRec(Nodo raiz, int dato) {
        if (raiz == null) {
            return new Nodo(dato);
        }

        if (dato < raiz.dato) {
            raiz.izquierda = insertarRec(raiz.izquierda, dato);
        } else if (dato > raiz.dato) {
            raiz.derecha = insertarRec(raiz.derecha, dato);
        }

        return raiz;
    }

    public boolean buscar(int dato) {
        return BusquedaBinaria.busquedaBinaria(raiz, dato);
    }

    static class BusquedaBinaria {

        public static boolean busquedaBinaria(Nodo raiz, int dato) {
            if (raiz == null) {
                return false;
            }

            if (raiz.dato == dato) {
                return true;
            } else if (dato < raiz.dato) {
                return busquedaBinaria(raiz.izquierda, dato);
            } else {
                return busquedaBinaria(raiz.derecha, dato);
            }
        }
    }
}
