/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.proyecto.ordenamiento;

import java.util.*;

public class Ordenamiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("¿Cuantos números deseas ingresar?: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        ordenar(arr);
 for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el valor para la posicion " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
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
