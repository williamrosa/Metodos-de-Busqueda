/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenar;

/**
 *
 * @author Rafael
 */
public class Burbuja {
    public static void Ordenar(int[] Vector){
        for(int j = 0; j < Vector.length-1; j++){
            for(int i = 0; i < Vector.length-1; i++){
                if(Vector[i]>Vector[i+1]){
                    int aux = Vector[i];
                    Vector[i] = Vector[i+1];
                    Vector[i+1] = aux;
                }
            }
        }
    }
}
