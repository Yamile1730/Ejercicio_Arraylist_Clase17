
//Objetivo: Convertir un ArrayList en un array nativo de Java.
//Instrucciones:
//Crea un ArrayList de enteros con los valores del 1 al 5.
//Convierte este ArrayList en un array de tipo Integer[].
//Imprime el contenido del array usando un bucle for//

import java.util.ArrayList;

public class EjercicioCinco {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }

        Integer[] numbersArray = new Integer[numbers.size()];
        numbers.toArray(numbersArray);

        System.out.println("Contenido del array:");
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.println(numbersArray[i]);
        }
    }
}
