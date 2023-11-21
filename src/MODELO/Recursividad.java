package MODELO;

class Recursividad {

    // Función recursiva para calcular el factorial de un número
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // Función recursiva para imprimir los elementos de una lista enlazada
    public static void imprimirListaRecursivo(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.dato + " ");
            imprimirListaRecursivo(nodo.siguiente);
        }
    }

    // Función recursiva para invertir una pila
    public static void invertirPilaRecursivo(Pila pila) {
        if (!pila.isEmpty()) {
            int dato = pila.peek();
            pila.pop();
            invertirPilaRecursivo(pila);
            pila.push(dato);
        }
    }


    // Función auxiliar para imprimir una pila
    public static void imprimirPila(Pila pila) {
        while (!pila.isEmpty()) {
            System.out.print(pila.peek() + " ");
            pila.pop();
        }
        System.out.println();
    }
}
