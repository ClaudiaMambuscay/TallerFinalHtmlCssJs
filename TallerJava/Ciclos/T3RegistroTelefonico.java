/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.t3registrotelefonico;

import javax.swing.JOptionPane;

/**
 *
 * @author claul
 */
public class T3RegistroTelefonico {

    public static void main(String[] args) {
        int op; String nombre, telefono,org;
        int f;
        f= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de personas a registrar"));
        String [][] registro = new String [f][3];
        do{
        op=Integer.parseInt(JOptionPane.showInputDialog("Menu Usuario: \n 1. Registrar Usuario"
                + "\n 2. Buscar Contacto \n 3. Eliminar contacto \n 4. Salir de la APP"));
       
        switch (op){
            case 1://registrar
             for (int i=0;i<=registro.length-1;i++){
            nombre=JOptionPane.showInputDialog("Ingrese el nombre y apellidos completos");
            telefono =JOptionPane.showInputDialog("Ingrese el numero telefonico");
            org =JOptionPane.showInputDialog("Ingrese el nombre de la organizacion");
            
            registro[i][0] =  nombre;
            registro[i][1] =  org;
            registro[i][2] =  telefono;
            JOptionPane.showMessageDialog(null,"El usuario "+nombre+ " Organizacion "+org
                    +" Telefono: "+telefono+"Se han registrado correctamente");
                } 
            break;
            case 2:// Buscar
             nombre=JOptionPane.showInputDialog("Ingrese el nombre y apellidos completos");
            for (int i=0;i<=registro.length-1;i++){
                if (nombre.equals(registro[i][0])){
                JOptionPane.showMessageDialog(null,"El usuario "+registro[i][0]+ " Organizacion "+registro[i][1]
                    +" Telefono: "+registro[i][2]);
              
                }
      
              } 
             break;
            case 3://Eliminar
             
                  nombre=JOptionPane.showInputDialog("Ingrese el nombre y apellidos completos");
                for (int i=0;i<=registro.length-1;i++){
                if (nombre.equals(registro[i][0])){
                    registro[i][0] =  "";
                    registro[i][1] =  "";
                    registro[i][2] =  "";
                JOptionPane.showMessageDialog(null,"El usuario "+nombre+ " Se elimino correctamente");
              
                }
      
              } 
             break;
        }
    }while(op>=1 && op<4);
        
    }
}
