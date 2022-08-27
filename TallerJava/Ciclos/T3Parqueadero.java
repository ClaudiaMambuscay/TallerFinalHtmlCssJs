/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.t3parqueadero;

import javax.swing.JOptionPane;

/**
 *
 * @author claul
 */
public class T3Parqueadero {

    public static void main(String[] args) {
       int op,d=5; 
       String nombre, telefono,marca, placa;
        
       String [][] registro = new String [5][5];
       for (int i=0;i<=registro.length-1;i++){
                
                 registro[i][0] =  "";
                 registro[i][1] =  "";
                 registro[i][2] =  "";
                 registro[i][3] =  "";
                 registro[i][4] =  "";
                }
        do{
        op=Integer.parseInt(JOptionPane.showInputDialog("Menu Usuario: \n 1. Ingresar al parqueadero"
                + "\n 2. Buscar vehiculo \n 3. Retirar vehiculo \n 4. Salir de la APP"));
       
        switch (op){
            case 1://registrar
               d=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de personas a registrar"+d));
               if (d>0){
             for (int i=0;i<=d-1;i++){
            nombre=JOptionPane.showInputDialog("Ingrese el nombre y apellidos completos"
                    + "\n Numero de parqueadero disponible: "+(i+1));
            telefono =JOptionPane.showInputDialog("Ingrese el numero telefonico");
            marca =JOptionPane.showInputDialog("Ingrese la marca del carro");
            placa =JOptionPane.showInputDialog("Ingrese la Placa");
            
            registro[i][0] =  nombre;
            registro[i][1] =  telefono;
            registro[i][2] =  marca;
            registro[i][3] =  placa;
            registro[i][4] =  String.valueOf(i+1);
            JOptionPane.showMessageDialog(null,"El usuario "+registro[i][0]+ " telefono: "+registro[i][1]
                    +" Carro marca: "+registro[i][2]+" Placas: "+registro[i][3]+" Numero parqueo"+registro[i][4]);
                } }
               d=5-d;
            break;
            case 2:// Buscar
             placa =JOptionPane.showInputDialog("Ingrese la placa del carro");
            for (int i=0;i<=registro.length-1;i++){
                if (placa.equals(registro[i][3])){
                    
                    JOptionPane.showMessageDialog(null,"El usuario "+registro[i][0]+ " telefono: "+registro[i][1]
                    +" Carro marca: "+registro[i][2]+" Placas: "+registro[i][3]+" Numero parqueo"+registro[i][4]);
              
                }
      
              } 
            
             break;
            case 3://Retirar
             
                placa =JOptionPane.showInputDialog("Ingrese la placa del carro");
                
                for (int i=0;i<=registro.length-1;i++){
                if (placa.equals(registro[i][3])){
                    
                    JOptionPane.showMessageDialog(null,"El usuario "+registro[i][0]+" de carro con placa"+ registro[i][3]+"Se ha retirado de las intalaciones");
                 registro[i][0] =  "";
                 registro[i][1] =  "";
                 registro[i][2] =  "";
                 registro[i][3] =  "";
                 registro[i][4] =  "";
                }
                }
                d=d+1;
                break;
              } 
             
        
    }while(op>=1 && op<4);
    }
}
