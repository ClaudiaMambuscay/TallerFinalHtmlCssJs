/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.t4numprimos;

/**
 *
 * @author claul
 */
public class T4NumPrimos {

    public static void main(String[] args) {
        int num, cont;
        int [] vect = new int[1000];
        
        for (int f=0;f<=vect.length-1;f++){
        vect[f]=f+1; //Se llena el vector con numeros
        cont=0;
        
        for (int c=1;c<=vect.length;c++){
        num = vect[f]%c;
        
        if(num==0){
        cont=cont+1;
        }
        
        }
        
        if (cont==2){
        System.out.print(vect[f]+" ");
        }
        
        }
        
        
    }
}
