/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.t3tablamultiplicar;

import java.util.Scanner;

/**
 *
 * @author claul
 */
public class T3TablaMultiplicar {

    public static void main(String[] args) {
        int n=10, num, mult;
        Scanner input = new Scanner (System.in); //Se utiliza para capturar la informacion desde consola
        System.out.println("Ingrese el numero de la tabla de multiplicar que desea consultar");
        num = input.nextInt();
        
        for (int f=1;f<=n;f++){
            mult=f*num;
        System.out.println(f+" x "+ num+" = "+ mult);
    }}
}
