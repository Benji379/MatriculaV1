package MODELO;

public class Grafo {

    static class Nodo {
        int dato;
        ListaEnlazada adyacentes;  // Lista de nodos adyacentes

        public Nodo(int dato) {
            this.dato = dato;
            this.adyacentes = new ListaEnlazada();
        }
    }

    private final Nodo[] nodos;

    public Grafo(int numVertices) {
        nodos = new Nodo[numVertices];
        for (int i = 0; i < numVertices; i++) {
            nodos[i] = new Nodo(i);
        }
    }

    public void agregarArista(int origen, int destino) {
        nodos[origen].adyacentes.insertarAlFinal(destino);
        nodos[destino].adyacentes.insertarAlFinal(origen);  // Para grafo no dirigido
    }

    public void imprimirGrafo() {
        for (Nodo nodo : nodos) {
            System.out.print("Nodo " + nodo.dato + ": ");
            nodo.adyacentes.mostrarLista();
        }
    }

}
