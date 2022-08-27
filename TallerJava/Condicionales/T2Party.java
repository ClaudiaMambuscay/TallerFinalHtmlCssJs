/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.t2party;

import javax.swing.JOptionPane;

/**
 *
 * @author claul
 */
public class T2Party {

    public static void main(String[] args) {
        int edad=0;
        String nombre;
        nombre = JOptionPane.showInputDialog("Ingrese su Nombre");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Edad" ));
        
        if (edad>=18){
        JOptionPane.showMessageDialog(null,nombre+" Usted es MAYOR de edad, por lo tanto puede entrar a la fiesta ");
                }else JOptionPane.showMessageDialog(null,nombre+" Usted es MENOR de edad, por lo tanto NO puede entrar a la fiesta, por favor devuelvase a su casa ");
    }
}
