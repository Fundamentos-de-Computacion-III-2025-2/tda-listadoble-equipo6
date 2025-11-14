public class ListaDoble {
    protected NodoDoble inicio, fin; //Apuntadores para saber donde esta el inicio y el fin de la lista doble

    //Constructor para crear la lista doble vacía
    public ListaDoble(){
        inicio = null;
        fin =null;
    }

    //Metodo para saber si la lista doble está vacía
    public boolean listaVacia(){
        if(inicio==null){
            return true;
        }else{
            return false;
        }
    }

    //Metodo para agregar un NodoDoble al Inicio de la Lista Doble
    public void insertarInicio(int dato){


    }

    //Metodo para insertar al Final de la lista doble
    public void insertarFinal(int dato){
        if(listaVacia()){
            fin= new NodoDoble(dato);

        }
        else {
            fin.siguiente= new NodoDoble(dato);
            new NodoDoble(dato).anterior=fin;


        }

    }


    /* Metodo para insertar un elemento suponiendo que la lista está en orden ascendente
    es decir, se debe comenzar a recorrer la lista e insertar el elemento antes del primer
    número mayor al elemento que se encuentre en la lista, si no se encuentar un dato mayor
    se inserta al final */

    public void insertarEnOrden(int dato){

    }


    //Eliminar al inicio
    public int eliminarInicio(){

        return -1;
    }

    //Eliminar al final
    public int eliminarFinal(){

        return -1;
    }

    //Eliminar un elemento
    public int eliminarElemento(int elemento){
        if (listaVacia()){
            throw new RuntimeException("Error: lista vacia");
        }
        if (inicio.dato == elemento) {
            int eliminado = inicio.dato;
            inicio = inicio.siguiente;

            if (inicio == null) {
                fin = null;
            }

            return eliminado;
        }

        NodoDoble actual = inicio;
        while (actual.siguiente != null) {

            if (actual.siguiente.dato == elemento) {

                int eliminado = actual.siguiente.dato;

                if (actual.siguiente == fin) {
                    fin = actual;
                }

                actual.siguiente = actual.siguiente.siguiente;

                return eliminado;
            }
            actual = actual.siguiente;
        }
        throw new RuntimeException("Error: El elemento no se pudo borrar o no existe");
    }




    //Metodo para buscar un elemento
    public boolean buscarElemento(int elemento){

        return false;

    }

    //Imprimir los datos de la lista doble de inicio a fin
    public void mostrarInicioFin(){
    }

    //Imprimir los datos de la lista doble de fin a inicio
    public void mostrarFinInicio(){

    }
}