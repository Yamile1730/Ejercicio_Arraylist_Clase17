
//Ejercicio 1: Creación y manipulación básica de ArrayList
//Objetivo: Practicar la creación de un ArrayList, agregar, eliminar y modificar elementos.
//Instrucciones:
//Crea un ArrayList de tipo String llamado fruits.
//Agrega los siguientes elementos: "Apple", "Banana", "Cherry".
//Imprime el tamaño de la lista y los elementos.
//Elimina "Banana" de la lista.
//Cambia el valor de "Cherry" por "Orange".
//Imprime la lista resultante//

import java.util.ArrayList;

public class EjercicioUno {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Tamaño de la lista: " + fruits.size());
        System.out.println("Elementos de la lista: " + fruits);

        fruits.remove("Banana");

        int index = fruits.indexOf("Cherry");
        if (index != -1) {
            fruits.set(index, "Orange");
        }

        System.out.println("Lista resultante: " + fruits);
    }
}