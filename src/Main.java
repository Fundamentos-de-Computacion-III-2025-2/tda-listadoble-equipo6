import javax.swing.*;

public class Main {

        /*
        En este metodo va toda la interfaz del usuario
        Las clases NodoDoble y ListaDoble deben tener solo implementación (nada de interfaz o visualización),
        excepto los métodos de mostrarInicioFin y mostrarFinInicio (son los únicos que pueden imprimir en consola
        o devolver un String para después imprimirlo desde aquí o mostrarlo en un JOptionPane aquí en Main.java).
         */

        /*
        Pueden usar JOptionPane o hacer la interfaz por consola.
        Deben definir un menú con las siguientes opciones:
                "1. Insertar un elemento al inicio\n"+
                "2. Insertar un elemento al final\n"+
                "3. Insertar un elemento en orden\n"+
                "4. Eliminar un elemento al inicio\n"+
                "5. Eliminar un elemento al final\n"+
                "6. Eliminar un elemento\n"+
                "7. Buscar un elemento\n"+
                "8. Mostrar los datos de inicio a fin\n"+
                "9. Mostrar los datos de fin a inicio\n"+
                "10. Salir\n","Menú de opciones",3));
        */
        public static void main(String[] args) {

            int opcion = 0;
            int elemento;
            ListaDoble lista = new ListaDoble();


            do {
                try {
                    opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "1. Insertar un elemento al inicio\n"+ //TODO @ Ernesto Velazquez
                                    "2. Insertar un elemento al final\n"+ //TODO @ Iker Figueroa
                                    "3. Insertar un elemento en orden\n"+ //TODO @ Junior Delgado
                                    "4. Eliminar un elemento al inicio\n"+ //TODO @ Ernesto Velazquez
                                    "5. Eliminar un elemento al final\n"+ //TODO @ Ernesto Velazquez
                                    "6. Eliminar un elemento\n"+ //TODO @ Iker Figueroa
                                    "7. Buscar un elemento\n"+ //TODO @ Junior Delgado
                                    "8. Mostrar los datos de inicio a fin\n"+ //TODO @ Parra Ochoa Alex
                                    "9. Mostrar los datos de fin a inicio\n"+ //TODO @ Parra Ochoa Alex
                                    "10. Salir\n",
                            "Menú de opciones", 3));
                    switch (opcion) {
                        case 1://Insertar un elemento al inicio TODO @ Ernesto Velazquez
                            break;
                        case 2://Insertar un elemento al final TODO @ iker figueroa
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingresa el número a insertar al final:"));
                            lista.insertarFinal(elemento);
                            break;
                        case 3: //Insertar en orden TODO @  Junior Delgado
                            break;
                        case 4: //Eliminar al inicio TODO @ Ernesto Velazquez
                            break;
                        case 5: //Eliminar al final TODO @ Ernesto Velazquez
                            break;
                        case 6: //Eliminar TODO @ iker figueroa
                            try {
                                elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Ingresa el elemento a eliminar:"));

                                int eliminado = lista.eliminarElemento(elemento);

                                JOptionPane.showMessageDialog(null,
                                        "Elemento eliminado: " + eliminado);

                            } catch (RuntimeException e) {
                                JOptionPane.showMessageDialog(null,
                                        "Error: No se pudo eliminar: " + e.getMessage());
                            }
                            break;
                        case 7: //Buscar elemento TODO @ Junior Delgado
                            break;
                        case 8: //MostrarLista TODO @ Parra Ochoa Alex
                            lista.mostrarInicioFin();
                            break;
                        case 9: //MostrarLista TODO @ Parra Ochoa Alex
                            lista.mostrarFinInicio();
                            break;
                        case 10: //Salir
                            JOptionPane.showMessageDialog(null, "Programa Finalizado");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opción Incorrecta");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "error" + e.getMessage(),
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            } while (opcion != 10);
    }
}