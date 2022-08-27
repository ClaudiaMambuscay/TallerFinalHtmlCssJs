/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.t2videotienda;

import javax.swing.JOptionPane;

/**
 *
 * @author claul
 */
public class T2Videotienda {

    public static void main(String[] args) {
       String [] peli=new String [5];
       peli[0]="Piratas del Caribe";
       peli[1]="Animales Fantasticos";
       peli[2]="Mas alla de la Luna";
       peli[3]="Monstruos del Mar";
       peli[4]="Dog un viaje salvaje";
       
       String nombre;
       int option=0,p=0;
       
       do{
       option = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Opcion a Realizar en la VideoTienda "
           +"\n"+"1. Alquilar"+"\n"+"2. Recibir"+"\n"+"3. Salir de la APP"));
       
       if (option==1){
           p=Integer.parseInt(JOptionPane.showInputDialog("Peliculas disponibles "
           +"\n 1."+peli[0]+"\n 2."+peli[1]+"\n 3."+peli[2]+"\n 4."+peli[3]+"\n 5."+peli[4]));
       switch (p){
           case 1:
               peli[0]=peli[0]+" Alquilada";
               nombre=JOptionPane.showInputDialog("Ingrese el nombre del cliente");
               JOptionPane.showMessageDialog(null,"La pelicula "+ peli[0]+" por "+ nombre);
               break;
           case 2:
               peli[1]=peli[1]+" Alquilada";
               nombre=JOptionPane.showInputDialog("Ingrese el nombre del cliente");
               JOptionPane.showMessageDialog(null,"La pelicula "+ peli[1]+" por "+ nombre);
               break;
           case 3:
               peli[2]=peli[2]+" Alquilada";
               nombre=JOptionPane.showInputDialog("Ingrese el nombre del cliente");
               JOptionPane.showMessageDialog(null,"La pelicula "+ peli[2]+" por "+ nombre);
               break;
           case 4:
               peli[3]=peli[3]+" Alquilada";
               nombre=JOptionPane.showInputDialog("Ingrese el nombre del cliente");
               JOptionPane.showMessageDialog(null,"La pelicula "+ peli[3]+" por "+ nombre);
               break;
           case 5:
               peli[4]=peli[4]+" Alquilada";
               nombre=JOptionPane.showInputDialog("Ingrese el nombre del cliente");
               JOptionPane.showMessageDialog(null,"La pelicula "+ peli[4]+" por "+ nombre);
               break;
       }
       
       }
       
       if (option==2){
       p=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion \n 1. Pelicula en Buen estado \n 2. Pelicula en Mal estado"));
       if (p==1){
           nombre=JOptionPane.showInputDialog("Ingrese el nombre del cliente");
           p=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Pelicula "
           +"\n 1."+peli[0]+"\n 2."+peli[1]+"\n 3."+peli[2]+"\n 4."+peli[3]+"\n 5."+peli[4]));
           switch (p){
           case 1:
                peli[0]="Piratas del Caribe";
       
              break;
           case 2:
               peli[1]="Animales Fantasticos";
      
               break;
           case 3:
                peli[2]="Mas alla de la Luna";
       
               break;
           case 4:
               peli[3]="Monstruos del Mar";
       
               break;
           case 5:
               peli[4]="Dog un viaje salvaje";
               
               break;
       }
           
       }
       if (p==2){
           nombre=JOptionPane.showInputDialog("Ingrese el nombre del cliente");
           p=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Pelicula "
           +"\n 1."+peli[0]+"\n 2."+peli[1]+"\n 3."+peli[2]+"\n 4."+peli[3]+"\n 5."+peli[4]));
           switch (p){
           case 1:
               peli[0]=peli[0]+" Mal estado";
               
               JOptionPane.showMessageDialog(null,"La pelicula "+ peli[0]+" alquilada por "+ nombre+"Se encuentra en mal estado por lo que debe pagar el 10% del costo del alquiler");
               break;
           case 2:
               peli[1]=peli[1]+" Mal estado";
               nombre=JOptionPane.showInputDialog("Ingrese el nombre del cliente");
               JOptionPane.showMessageDialog(null,"La pelicula "+ peli[1]+" alquilada por "+ nombre+"Se encuentra en mal estado por lo que debe pagar el 10% del costo del alquiler");
               break;
           case 3:
               peli[2]=peli[2]+" Mal estado";
               nombre=JOptionPane.showInputDialog("Ingrese el nombre del cliente");
               JOptionPane.showMessageDialog(null,"La pelicula "+ peli[2]+" alquilada por "+ nombre+"Se encuentra en mal estado por lo que debe pagar el 10% del costo del alquiler");
               break;
           case 4:
               peli[3]=peli[3]+" Mal estado";
               nombre=JOptionPane.showInputDialog("Ingrese el nombre del cliente");
               JOptionPane.showMessageDialog(null,"La pelicula "+ peli[3]+" alquilada por "+ nombre+"Se encuentra en mal estado por lo que debe pagar el 10% del costo del alquiler");
               break;
           case 5:
               peli[4]=peli[4]+" Mal estado";
               nombre=JOptionPane.showInputDialog("Ingrese el nombre del cliente");
               JOptionPane.showMessageDialog(null,"La pelicula "+ peli[4]+" alquilada por "+ nombre+"Se encuentra en mal estado por lo que debe pagar el 10% del costo del alquiler");
               break;
       }
           
       }}
       
    }while(option>=1 && option<3);
       }
}
