package MODELO;

public class Ordenamiento {

    private static Nodo inicio;

    // Métodos de ordenamiento para nodos
    public static Nodo bubbleSort(Nodo inicio) {
        if (inicio == null || inicio.siguiente == null) {
            return inicio;
        }

        boolean intercambio;
        do {
            intercambio = false;
            Nodo actual = inicio;
            Nodo anterior = null;

            while (actual.siguiente != null) {
                if (actual.dato > actual.siguiente.dato) {
                    intercambiarNodos(anterior, actual, actual.siguiente);
                    intercambio = true;
                }

                anterior = actual;
                actual = actual.siguiente;
            }
        } while (intercambio);

        return inicio;
    }

    private static void intercambiarNodos(Nodo anterior, Nodo a, Nodo b) {
        if (anterior != null) {
            anterior.siguiente = b;
        } else {
            inicio = b;
        }

        Nodo tmp = b.siguiente;
        b.siguiente = a;
        a.siguiente = tmp;
    }

    // Métodos de ordenamiento para pilas
    public static void bubbleSort(Pila pila) {
        if (pila.isEmpty() || pila.tope.siguiente == null) {
            return;
        }

        boolean intercambio;
        do {
            intercambio = false;
            Nodo actual = pila.tope;
            Nodo anterior = null;

            while (actual.siguiente != null) {
                if (actual.dato > actual.siguiente.dato) {
                    intercambiarNodos(anterior, actual, actual.siguiente);
                    intercambio = true;
                }

                anterior = actual;
                actual = actual.siguiente;
            }
        } while (intercambio);
    }

    // Métodos de ordenamiento para listas enlazadas
    public static void bubbleSort(ListaEnlazada lista) {
        if (lista.inicio == null || lista.inicio.siguiente == null) {
            return;
        }

        boolean intercambio;
        do {
            intercambio = false;
            Nodo actual = lista.inicio;
            Nodo anterior = null;

            while (actual.siguiente != null) {
                if (actual.dato > actual.siguiente.dato) {
                    intercambiarNodos(anterior, actual, actual.siguiente);
                    intercambio = true;
                }

                anterior = actual;
                actual = actual.siguiente;
            }
        } while (intercambio);
    }
// Método de ordenamiento Quick Sort para nodos

    public static Nodo quickSort(Nodo inicio) {
        if (inicio == null || inicio.siguiente == null) {
            return inicio;
        }

        Nodo pivot = inicio;
        Nodo menores = null;
        Nodo mayores = null;
        Nodo siguiente = inicio.siguiente;

        while (siguiente != null) {
            Nodo siguienteTemp = siguiente.siguiente;
            if (siguiente.dato < pivot.dato) {
                siguiente.siguiente = menores;
                menores = siguiente;
            } else {
                siguiente.siguiente = mayores;
                mayores = siguiente;
            }
            siguiente = siguienteTemp;
        }

        menores = quickSort(menores);
        mayores = quickSort(mayores);

        if (menores == null) {
            inicio = pivot;
        } else {
            inicio = menores;
            Nodo temp = menores;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = pivot;
        }

        pivot.siguiente = mayores;
        return inicio;
    }

    // Método de ordenamiento Merge Sort para nodos
    public static Nodo mergeSort(Nodo inicio) {
        if (inicio == null || inicio.siguiente == null) {
            return inicio;
        }

        Nodo mitad = encontrarMitad(inicio);
        Nodo mitadSiguiente = mitad.siguiente;
        mitad.siguiente = null;

        Nodo izquierda = mergeSort(inicio);
        Nodo derecha = mergeSort(mitadSiguiente);

        return combinarListas(izquierda, derecha);
    }

    private static Nodo encontrarMitad(Nodo inicio) {
        if (inicio == null) {
            return null;
        }

        Nodo rapido = inicio.siguiente;
        Nodo lento = inicio;

        while (rapido != null) {
            rapido = rapido.siguiente;
            if (rapido != null) {
                rapido = rapido.siguiente;
                lento = lento.siguiente;
            }
        }

        return lento;
    }

    private static Nodo combinarListas(Nodo izquierda, Nodo derecha) {
        Nodo resultado = null;

        if (izquierda == null) {
            return derecha;
        }
        if (derecha == null) {
            return izquierda;
        }

        if (izquierda.dato <= derecha.dato) {
            resultado = izquierda;
            resultado.siguiente = combinarListas(izquierda.siguiente, derecha);
        } else {
            resultado = derecha;
            resultado.siguiente = combinarListas(izquierda, derecha.siguiente);
        }

        return resultado;
    }
}
