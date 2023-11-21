package MODELO;

public class ListaEnlazada {

    Nodo inicio;

    public ListaEnlazada() {
        this.inicio = null;
    }

    public void insertarAlFinal(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (inicio == null) {
            inicio = nuevoNodo;
        } else {
            Nodo actual = inicio;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    public void mostrarLista() {
        Nodo actual = inicio;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    public void eliminar(int dato) {
        if (inicio != null) {
            if (inicio.dato == dato) {
                inicio = inicio.siguiente;
                return;
            }
            Nodo actual = inicio;
            while (actual.siguiente != null && actual.siguiente.dato != dato) {
                actual = actual.siguiente;
            }
            if (actual.siguiente != null) {
                actual.siguiente = actual.siguiente.siguiente;
            }
        }
    }

    public boolean buscar(int dato) {
        Nodo actual = inicio;
        while (actual != null) {
            if (actual.dato == dato) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    // Otros métodos que puedas necesitar
}
