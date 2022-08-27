/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.t1p3;
import javax.swing.JOptionPane;
/**
 *
 * @author claul
 */
public class T1P3 {

    public static void main(String[] args) {
        String nombre_P = JOptionPane.showInputDialog("Ingrese el Nombre y apellido del propietario:");//se debe definir el tipo de variable en que se captura la info
        String nombre_M = JOptionPane.showInputDialog("Ingrese el Nombre de la Mascota:");
        String Tipo = JOptionPane.showInputDialog("Ingrese el Tipo de mascota:");
        int Edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de "+nombre_M));
        
               
       JOptionPane.showMessageDialog(null,nombre_M+" es un "+Tipo+" de "+Edad+" años de edad y "+"\n"+nombre_P+
                "  es actualmente su dueñ@");
        
    }
}
