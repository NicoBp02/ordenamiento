/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.proyecto.ordenamiento;

public class Ordenamiento {
    public static void main(String[] args) {
        int arr[] = {5, 2, 11, -8, 115, 56, -3};
        ordenar(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    private static void ordenar(int v[]) {
        // i llega hasta el penúltimo elemento
        for (int i = 0; i < v.length - 1; i++) {
            // j debe llegar hasta el final del arreglo (v.length)
            for (int j = i + 1; j < v.length; j++) { 
                if (v[i] > v[j]) {
                    // Intercambio de valores
                    int w = v[j];
                    v[j] = v[i];
                    v[i] = w;
                }
            }
        }
    }
}
