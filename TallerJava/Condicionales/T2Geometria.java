/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.t2geometria;
import javax.swing.JOptionPane;
/**
 *
 * @author claul
 */
public class T2Geometria {

    public static void main(String[] args) {
        int option=0;
        float Area_Rectangulo, Area_Triangulo, Area_Trapecio,L,B,A;
       do{
           option = Integer.parseInt(JOptionPane.showInputDialog("Calculo del Area. Seleccione la figura geometrica: "
           +"\n"+"1. Rectangulo"+"\n"+"2. Triangulo"+"\n"+"3. Trapecio"+"\n"+"4. Salir de la APP"));
           
           switch(option){
               case 1:
                  B = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la Base (cm)"));
                  A = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la Altura (cm)"));
                   Area_Rectangulo = B*A;
                   JOptionPane.showMessageDialog(null,"El Rectangulo de BASE (cm) "+B+" y ALTURA (cm) "+A+
                           " Tiene un AREA de "+Area_Rectangulo+" (cm)^2");
                   break;
               case 2:
                   B = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la Base (cm)"));
                   A = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la Altura (cm)"));
                   Area_Triangulo = (B*A)/2;
                   JOptionPane.showMessageDialog(null,"El Triangulo de BASE (cm) "+B+" y ALTURA (cm) "+A+
                           " Tiene un AREA de "+Area_Triangulo+" (cm)^2");
                   break;
               case 3:
                   B = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la Base Mayor (cm)"));
                   L = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la Base Menor (cm)"));
                   A = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la Altura (cm)"));
                   Area_Trapecio = ((B+L)/2)*A;
                   JOptionPane.showMessageDialog(null,"El Trapecio con BASE MENOR (cm) "+B+" y ALTURA (cm) "+A+
                           " Tiene un AREA de "+Area_Trapecio+" (cm)^2");
                   break;
           }
       }while(option>=1 && option<4);
    }
}
