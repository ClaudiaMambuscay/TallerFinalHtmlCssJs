/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.t3saludarpersona;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author claul
 */
public class T3SaludarPersona {

    public static void main(String[] args) {
        int op; String nombre;
        do{
        op=Integer.parseInt(JOptionPane.showInputDialog("Menu Usuario: \n 1. Capturar nombre"
                + "\n 2. Saludar Persona \n 3. Salir del sistema"));
       
        switch (op){
            case 1:
            nombre=JOptionPane.showInputDialog("Ingresa el nombre");
                         
             JOptionPane.showMessageDialog(null,"Hola "+nombre);
             break;
                case 2:
                JOptionPane.showMessageDialog(null,"Hola");
                    break;
        }
    }while(op>=1 && op<3);
        }
}
