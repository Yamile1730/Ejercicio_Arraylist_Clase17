
//Objetivo: Practicar la iteración sobre listas.
//Instrucciones:
//Crea un ArrayList de números enteros llamado numbers y añade los números del 1 al 5.
//Usa un bucle for para imprimir cada número.
//Usa un bucle for-each para imprimir los mismos números.
//Usa un bucle while para imprimir los números en orden inverso//

import java.util.ArrayList;

public class EjercicioDos {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }

        System.out.println("Imprimir con bucle for:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("\nImprimir con bucle for-each:");
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("\nImprimir en orden inverso con bucle while:");
        int index = numbers.size() - 1;
        while (index >= 0) {
            System.out.println(numbers.get(index));
            index--;
        }
    }
}