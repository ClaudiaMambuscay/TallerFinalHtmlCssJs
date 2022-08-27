/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.t1p1;
import java.util.Scanner;
/**
 *
 * @author claul
 */
public class T1P1 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); //Se utiliza para capturar la informacion desde consola
        System.out.println("Ingrese el Nombre:");
        String nombre = input.nextLine();
        System.out.println("Ingrese el Apellido:");
        String apellido = input.nextLine();//se debe definir el tipo de variable en que se captura la info
        System.out.println("Ingrese la Edad:");
        int edad = input.nextInt();
        System.out.println("Ingrese la Estatura:");
        float estatura = input.nextFloat();
        System.out.println("Nombre: "+nombre+" Apellido: "+apellido+" Edad: "+edad+" Estatura(m): "+estatura);
    }
}
