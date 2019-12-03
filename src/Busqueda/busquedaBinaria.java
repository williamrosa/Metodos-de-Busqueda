/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Busqueda;

/**
 *
 * @author CT7-PC37
 */
public class busquedaBinaria {
    public static int busquedaBinaria(int  vector[], int dato){
////    int inferior=0;
////    int centro;
////    int superior=vector.length-1;
////    while(inferior<=superior){
////        centro=(inferior+superior)/2;
////        if(vector[centro]==dato){
////            return centro+1;
////            
////        }else if(dato<vector[centro]){
////            superior=centro-1;
////        }else{
////            inferior=centro+1;
////        }
////        
////    }
////    int r=Integer.parseInt("null");
////    return -1 ;
////    }
  int n = vector.length;
  int centro,inf=0,sup=n-1;
   while(inf<=sup){
     centro=(sup+inf)/2;
     if(vector[centro]==dato) return centro;
     else if(dato < vector [centro] ){
        sup=centro-1;
     }
     else {
       inf=centro+1;
     }
   }
   return -1;
 }
}
