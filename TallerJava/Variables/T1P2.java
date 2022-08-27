/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.t1p2;
import java.util.Scanner;
/**
 *
 * @author claul
 */
public class T1P2 {

    public static void main(String[] args) {
       Scanner input = new Scanner (System.in); //Se utiliza para capturar la informacion desde consola
        System.out.println("Ingrese el Nombre:");
        String nombre = input.nextLine();
        System.out.println("Ingrese el Apellido:");
        String apellido = input.nextLine();//se debe definir el tipo de variable en que se captura la info
        System.out.println("Ingrese el Nombre y Apellido del Padre:");
        String Padre = input.nextLine();
        System.out.println("Ingrese el Nombre y Apellido de la Madre:");
        String Madre = input.nextLine();
        System.out.println("Ingrese la ciudad de nacimiento:");
        String Ciudad = input.nextLine();
        System.out.println("Ingrese el Pais:");
        String Pais = input.nextLine();
        System.out.println("Yo, "+nombre+" "+apellido+"\n"+"Soy hij@ de "+Padre+
                " y "+Madre+"\n"+" Nacido en la ciudad"+Ciudad+" del Pais "+Pais);
    }
}
