/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.t4matriz2;

import java.util.Scanner;

/**
 *
 * @author claul
 */
public class T4Matriz2 {

    public static void main(String[] args) {
        int [][] mat = new int[10][10];
        
        System.out.println("Columnas: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 / Filas:");
        for (int f=0; f<=mat.length-1;f++){
        for (int c=0; c<=mat[0].length-1;c++){
        mat[f][c]=(f+1)*(c+1);
        System.out.print(" "+(c+1)+"x"+(f+1)+" ");
        }System.out.println(" |"+ f);
        }
        
         Scanner input = new Scanner (System.in);
         
        System.out.println("Ingrese la Fila y Columna que desee conocer\n"
                + " Ingrese la Fila ");
       
        int fila= input.nextInt();
         System.out.println("Ingrese la Columna");
        int columna= input.nextInt();
        System.out.println(fila+"X"+columna+"="+mat[fila-1][columna-1]);
    }
}
