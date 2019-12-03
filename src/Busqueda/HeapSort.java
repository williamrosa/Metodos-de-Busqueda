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
public class HeapSort {
    public static void O(int v[]) 
    { 
        int n = v.length;
        for (int i = n / 2 - 1; i >= 0; i--) 
            A(v, n, i);
        for (int i = n - 1; i >= 0; i--) 
        {
            int t = v[0]; 
            v[0] = v[i]; 
            v[i] = t;
            A(v, i, 0); 
        }
    }
    private static void A(int v[], int n, int i){ 
        int masLargo = i;
        int l = 2*i + 1; 
        int r = 2*i + 2;

        if (l < n && v[l] > v[masLargo]) 
            masLargo = l; 

        if (r < n && v[r] > v[masLargo]) 
            masLargo = r; 
  
        if (masLargo != i) 
        { 
            int t = v[i]; 
            v[i] = v[masLargo]; 
            v[masLargo] = t;
            A(v, n, masLargo); 
        }
    }
}
