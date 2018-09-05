package clases.ListaEnlada.ja;


public class ColaDinamica <T> {

    private Nodo<T> primero;
    private Nodo<T> ultimo;
    private int tamaño;

    public ColaDinamica(){
        primero = null;
        ultimo = null;
        tamaño = 0;
    }

    public boolean isEmpty(){
        return primero == null;
    }

    public int size(){
        return tamaño;
    }

    public T primero(){
        if (isEmpty()){
            return null;
        }

        return primero.getElemento();
    }

    public T dequeue(){
        if (isEmpty()){
            return null;
        }
        T elemento = primero.getElemento();
        Nodo<T> aux = primero.getSiguiente();
        primero = null;
        primero = aux;
        tamaño--;
        if(isEmpty()){
            ultimo = null;
        }
        return elemento;


    }

    public T enqueue (T elemento){
        Nodo<T> aux = new Nodo(elemento,null);
        if(isEmpty()){
            primero = aux;
            ultimo = aux;
        }
        else{
            if(size()==1){
                primero.setSiguiente(aux);
            }
            else {
                ultimo.setSiguiente(aux);
            }
            ultimo = aux;
        }
        tamaño++;
        return aux.getElemento();
    }

    public String toString(){
        if (isEmpty()){
            return "La lista está vacía";
        }
        else {
            String cadena = "";
            Nodo<T> aux = primero;
            while (aux!=null){
                cadena += aux;
                aux = aux.getSiguiente();

            }
            return cadena;
        }

    }
}
