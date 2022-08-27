/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.t4vector;

import java.util.Scanner;

/**
 *
 * @author claul
 */
public class T4Vector {

    public static void main(String[] args) {
       int num;
       int [] vector=new int [5];
       Scanner input = new Scanner (System.in);
       for(int i=0;i<=vector.length-1;i++){
       System.out.println("Ingrese el valor del vector en la posicion: "+i);
       num = input.nextInt();
       vector [i]=num;
       }
        for(int i=0;i<=vector.length-1;i++){
       System.out.println("["+i+"]"+"= "+vector[i]);
      
       }
        
    }
}
