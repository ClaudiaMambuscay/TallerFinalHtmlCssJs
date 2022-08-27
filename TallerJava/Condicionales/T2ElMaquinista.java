/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.t2elmaquinista;

import java.util.Scanner;

/**
 *
 * @author claul
 */
public class T2ElMaquinista {

    public static void main(String[] args) {
        
        int option=0;
        
        Scanner input = new Scanner (System.in);
        do{
         System.out.println("Seleccione opcion: \n 1. Cambio de aceite"
                + "\n 2. Revision mecanica general \n 3. Salir de la APP");
        option = input.nextInt();
        
        System.out.println("Ingrese el Nombre del cliente:");
        String nombre = input.nextLine();
        
        System.out.println("Ingrese el tipo de motocicleta");
        String tipo = input.nextLine();
        
        System.out.println("Ingrese la fecha DD/MM/AAAA");
        String fecha = input.nextLine();
        
       
        
        
        
        if (option==1){
           
            System.out.println("El cambio de aceite se realizo satisfactoriamente");
        }
        if (option==2){
            System.out.println("Reporte valoracion general: \n 1.Desgaste de frenos"
                    +"\n 2. Cambio de pintura \n 3. Cambio de luces");
            int op=input.nextInt();
            switch (op){
                case 1:
                    System.out.println("Se presenta alguna novedad?");
                    String reporte = input.nextLine();
                    System.out.println("El cambio de frenos fue exitoso para la motocicleta tipo: "+tipo
                    + " Ingresada el dia "+ fecha+" Perteneciente al usuario "+ nombre+".\n Observaciones:"+reporte);
                    break;
                case 2:
                    System.out.println("Se presenta alguna novedad?");
                    reporte = input.nextLine();
                    System.out.println("El cambio de pintura fue exitoso para la motocicleta tipo: "+tipo
                    + " Ingresada el dia "+ fecha+" Perteneciente al usuario "+ nombre+".\n Observaciones:"+reporte);
                    break;
                case 3:
                    System.out.println("Se presenta alguna novedad?");
                    reporte = input.nextLine();
                    System.out.println("El cambio de luces fue exitoso para la motocicleta tipo: "+tipo
                    + " Ingresada el dia "+ fecha+" Perteneciente al usuario "+ nombre+".\n Observaciones:"+reporte);
            break;
                    }
            
        }}
        while (option>=1 && option<3);}}
        
      
    

