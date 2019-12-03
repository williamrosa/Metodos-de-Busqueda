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
public class QuickSort {
    public static int[] OrdenamientoRapido(int numeros[]){
        return _OrdenamientoRapido(numeros, 0, numeros.length-1);
    }
    private static int[] _OrdenamientoRapido(int numeros[],int izq, int der){
        if(izq>=der){
            return numeros;
        }
        int i = izq;
        int d = der;
        if(izq!=der){
            int pivote;
            int aux;
            pivote = izq;
            while(izq!=der){
                while(numeros[der]>=numeros[pivote] && izq<der)
                    der--;
                while(numeros[izq]<numeros[pivote] && izq<der)
                    izq++;
                if(der!=izq){
                    aux = numeros[der];
                    numeros[der] = numeros[izq];
                    numeros[izq] = aux;
                }
            }
            if(izq == der){
                _OrdenamientoRapido(numeros,i,izq-1);
                _OrdenamientoRapido(numeros,izq+1,d);
            }
        }
        else{
            return numeros;
        }
        return numeros;
    }
}
