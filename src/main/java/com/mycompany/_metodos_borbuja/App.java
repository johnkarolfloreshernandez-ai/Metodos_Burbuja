/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._metodos_borbuja;
import java.util.Arrays; // Permite mostrar los arreglos con formato legible.
/**
 *
 * @author johnf
 */
public class App {

    
    // METODO 1: ORDENAMIENTO BURBUJA TRADICIONAL
    // Recorre el arreglo varias veces hasta ordenarlo por completo.
    public static void ordenamientoBurbuja(int[] arreglo) {

        // Recorre el arreglo desde el inicio hasta el final.
        for (int i = 0; i < arreglo.length - 1; i++) {

            // Compara los elementos que están uno junto al otro.
            for (int j = 0; j < arreglo.length -1 -i; j++) {

                // Si el elemento actual es mayor que el siguiente,
                // significa que están en el orden incorrecto.
                if (arreglo[j] > arreglo[j + 1]) {

                    // Guarda temporalmente el elemento actual.
                    int temporal = arreglo[j];

                    // Coloca el elemento siguiente en la posición actual.
                    arreglo[j] = arreglo[j + 1];

                    // Coloca el elemento guardado en la posición siguiente.
                    arreglo[j + 1] = temporal;
                }
            }
        }
    }

    // METODO 2: ORDENAMIENTO BURBUJA MEJORADO
    // Utiliza una bandera para detectar si el arreglo ya está ordenado.
    public static void ordenamientoBurbujaMejorado(int[] arreglo) {

        // Controla si se realizaron intercambios durante una pasada.
        boolean intercambio;

        // Repite las pasadas mientras existan intercambios.
        for (int i = 0; i < arreglo.length - 1; i++) {

            // Al comenzar cada pasada, suponemos que no habrá intercambios.
            intercambio = false;

            // Compara los elementos que están juntos.
            for (int j = 0; j < arreglo.length - 1 -i; j++) {

                // Comprueba si los elementos están en el orden incorrecto.
                if (arreglo[j] > arreglo[j + 1]) {

                    // Guarda temporalmente el elemento actual.
                    int temporal = arreglo[j];

                    // Intercambia los elementos.
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;

                    // Indica que sí se realizó un intercambio.
                    intercambio = true;
                }
            }

            // Si no hubo intercambios, el arreglo ya está ordenado.
            // Se interrumpe el ciclo para ahorrar trabajo.
            if (!intercambio) {
                break;
            }
        }
    }

    // METODO PRINCIPAL: MAIN
    // Aquí se ejecutan las pruebas de los dos algoritmos.
    public static void main(String[] args) {

        // PRUEBA 1: Arreglo completamente desordenado.
        int[] arreglo1 = {8, 3, 6, 1, 9, 2};
        System.out.println("BURBUJA TRADICIONAL");
        // Muestra el arreglo antes de ordenarlo.
        System.out.println("Estado inicial: " + Arrays.toString(arreglo1));
        // Llama al método tradicional.
        ordenamientoBurbuja(arreglo1);
        // Muestra el arreglo después de ordenarlo.
        System.out.println("Resultado final: " + Arrays.toString(arreglo1));
        // PRUEBA 2: Arreglo parcialmente ordenado.
        int[] arreglo2 = {1, 2, 4, 3, 5, 6};
        System.out.println("\nBURBUJA MEJORADO");
        // Muestra el arreglo antes de ordenarlo.
        System.out.println("Estado inicial: " + Arrays.toString(arreglo2));
        // Llama al método mejorado.
        ordenamientoBurbujaMejorado(arreglo2);
        // Muestra el arreglo después de ordenarlo.
        System.out.println("Resultado final: " + Arrays.toString(arreglo2));
        // PRUEBA 3: Arreglo que ya está ordenado.
        int[] arreglo3 = {1, 2, 3, 4, 5};
        System.out.println("\nARREGLO YA ORDENADO");
        // Muestra el arreglo original.
        System.out.println("Estado inicial: " + Arrays.toString(arreglo3));
        // El método mejorado detectará que no necesita más pasadas.
        ordenamientoBurbujaMejorado(arreglo3);
        // Muestra el resultado.
        System.out.println("Resultado final: " + Arrays.toString(arreglo3));
    }
}
