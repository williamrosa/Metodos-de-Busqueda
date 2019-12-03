package Busqueda;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CT7-PC37
 */
public class BusquedaLinael {
    public  static int busquedaSecuencial(int []arreglo,int dato){
        int posicion=0;
        boolean boleano=false;
        while(posicion<arreglo.length && boleano==true){
            if(arreglo[posicion]== dato){
                
            }
            posicion++;
        }
        if(boleano==false){
//            String mensaje="no encontrado";
//            return (Integer.parseInt(mensaje));
            return -1;
        }
        else{
//            String Mensaje="El numero ah sido encontrado en la posicion ";
//            return(Integer.parseInt(Mensaje)+posicion-1);
            return posicion-1;
        }
    }
    public  static int busquedaSecuencialTexto(int []arreglo,int dato){
        int posicion=0;
        boolean boleano=false;
        while(posicion<arreglo.length && boleano==true){
            if(arreglo[posicion]== dato){
                
            }
            posicion++;
        }
        if(boleano==false){
//            String mensaje="no encontrado";
//            return (Integer.parseInt(mensaje));
            return -1;
        }
        else{
//            String Mensaje="El numero ah sido encontrado en la posicion ";
//            return(Integer.parseInt(Mensaje)+posicion-1);
            return posicion-1;
        }
    }
}
