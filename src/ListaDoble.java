public class ListaDoble {
    protected NodoDoble inicio, fin; //Apuntadores para saber donde esta el inicio y el fin de la lista doble

    //Constructor para crear la lista doble vacía
    public ListaDoble() {
        inicio = null;
        fin = null;
    }

    //Metodo para saber si la lista doble está vacía
    public boolean listaVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    //Metodo para agregar un NodoDoble al Inicio de la Lista Doble ernesto
    public void insertarInicio(int dato) {
        if (listaVacia()) {
          NodoDoble nuevo = new NodoDoble(dato);
          inicio = nuevo;
          fin = nuevo;
        } else {
            NodoDoble nuevo = new NodoDoble(dato, inicio, null);
            inicio.anterior = nuevo;
            inicio = nuevo;
        }

    }

    //Metodo para insertar al Final de la lista doble
    public void insertarFinal(int dato) {

    }


    /* Metodo para insertar un elemento suponiendo que la lista está en orden ascendente
    es decir, se debe comenzar a recorrer la lista e insertar el elemento antes del primer
    número mayor al elemento que se encuentre en la lista, si no se encuentar un dato mayor
    se inserta al final */

    public void insertarEnOrden(int dato) {

    }


    //Eliminar al inicio Ernesto
    public int eliminarInicio() {
        if (listaVacia()) {
            return -1;
        }
        int datoEliminado = inicio.dato;
        if (inicio == fin) {
            inicio = null;
            fin = null;
        } else {
            inicio = inicio.siguiente;
            inicio.anterior = null;
        }
        return datoEliminado;
    }

    //Eliminar al final ernesto
    public int eliminarFinal() {
        if (listaVacia()) {
            return -1;
        }

        int datoEliminado = fin.dato;

        if (inicio == fin) {
            inicio = null;
            fin = null;
        } else {
            fin = fin.anterior;
            fin.siguiente = null;
        }
        return datoEliminado;
    }

    //Eliminar un elemento
    public int eliminarElemento(int elemento) {

        return elemento;
    }

    //Metodo para buscar un elemento
    public boolean buscarElemento(int elemento) {

        return false;

    }

    //Imprimir los datos de la lista doble de inicio a fin
    public void mostrarInicioFin() {
        NodoDoble actual = inicio; //movemos el puntero al inicio de la lista
        System.out.println();  //con este print creamos una separacion en la siguiente linea al volver a imprimir
        while (actual != null) { //mientras el puntero no haya pasado al final de la lista
            System.out.print(actual.dato + " --> "); //se imprime el elemento que el puntero esta seleccionando
            actual = actual.siguiente; //despues de imprimir, avanza al siguiente nodo
        } //salimos del bucle cuando ya recorrimos la lista
    }

    //Imprimir los datos de la lista doble de fin a inicio
    public void mostrarFinInicio() {
        NodoDoble actual = fin;  //movemos el puntero al final de la lista
        System.out.println(); //con este print creamos una separacion en la siguiente linea al volver a imprimir
        while (actual != null) { //mientras el puntero no haya pasado al final (inicio) de la lista
            System.out.print(actual.dato + " --> "); //se imprime el elemento que el puntero esta seleccionando
            actual = actual.anterior; //despues de imprimir, retrocede al nodo anterior
        } //salimos del bucle cuando ya recorrimos la lista
    }
}