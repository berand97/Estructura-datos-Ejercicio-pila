
public class ListP {

    private Nodo cima;

    public ListP() {
        cima = null;
    }

    public boolean pilaVacia() {
        return cima == null;
    }

    public void insertar(Object elemento) {
        Nodo nuevo;
        nuevo = new Nodo(elemento);
        nuevo.siguiente = cima;
        cima = nuevo;
    }

    public Object quitar() throws Exception {
        if (pilaVacia())
            throw new Exception("Pila vac�a, no se puede extraer.");
        Object aux = cima.elemento;
        cima = cima.siguiente;
        return aux;
    }

    public Object cimaPila() throws Exception {
        if (pilaVacia())
            throw new Exception("Pila vac�a, no se puede leer cima.");
        return cima.elemento;
    }

    public void limpiarPila() {
        Nodo t;
        while (!pilaVacia()) {
            t = cima;
            cima = cima.siguiente;
            t.siguiente = null;
        }
    }

}
