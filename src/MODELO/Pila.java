package MODELO;

public class Pila {

    Nodo tope;

    public Pila() {
        this.tope = null;
    }

    public void push(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.siguiente = tope;
        tope = nuevoNodo;
    }

    public void pop() {
        if (tope != null) {
            tope = tope.siguiente;
        } else {
            System.out.println("La pila está vacía.");
        }
    }

    public int peek() {
        if (tope != null) {
            return tope.dato;
        } else {
            throw new IllegalStateException("La pila está vacía.");
        }
    }

    public boolean isEmpty() {
        return tope == null;
    }

    // Otros métodos que puedas necesitar
}
