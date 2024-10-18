
//Objetivo: Filtrar elementos en una lista según un criterio específico.
//Instrucciones:
//Crea un ArrayList de números enteros.
//Llénalo con los números 1 a 10.
//Filtra los números pares en una nueva lista llamada evenNumbers.
//Imprime la lista original y la lista de números pares//


import java.util.ArrayList;

public class EjercicioTres {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }

        System.out.println("Lista original de números: " + numbers);

        System.out.println("Lista de números pares: " + evenNumbers);
    }
}
