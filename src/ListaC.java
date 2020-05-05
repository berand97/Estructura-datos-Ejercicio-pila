
public class ListaC {

    protected Nodo front;
    protected Nodo end;

    public ListaC() {
        front = end = null;
    }

    public void insertar(Object elemento) {
        Nodo a;
        a = new Nodo(elemento);
        if (colaVacia()) {
            front = a;
        } else {
            end.siguiente = a;
        }
        end = a;
    }

    public Object quitar() throws Exception {
        Object aux;
        if (!colaVacia()) {
            aux = front.elemento;
            front = front.siguiente;
        } else
            throw new Exception("Eliminar de una cola vacía");
        return aux;
    }

    public void borrarCola() {
        for (; front != null;) {
            front = front.siguiente;
        }
        System.gc();
    }

    public Object frenteCola() throws Exception {
        if (colaVacia()) {
            throw new Exception("Error: cola vac�a");
        }
        return (front.elemento);
    }

    public boolean colaVacia() {
        return (front == null);
    }

}
