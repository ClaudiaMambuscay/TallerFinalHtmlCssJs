/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.t2drogueria;

import javax.swing.JOptionPane;

/**
 *
 * @author claul
 */
public class T2Drogueria {

    public static void main(String[] args) {
       String Nombre;
        int cantidad=0, total=0, m=0, option = 0;
        String[][] registro = new String [3][3];
        int i=0;
        do{
           option = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Opcion a Realizar en Drogueria SuSalud "
           +"\n"+"1. Consultar productos"+"\n"+"2. Devolucion"+"\n"+"3. Salir de la APP"));
        
            
                  if (option==1)     {   
                      
                      m = Integer.parseInt(JOptionPane.showInputDialog("Medicamentos disponibles en Drogueria SuSalud \n"
                        +"1. Acetaminofen 250mg x10 -> $1.000 \n"+"2. Naproxeno 250mg x10 -> $3.000 \n"+"3. Dolex forte  x5 -> $5.000 \n"+"4. Noxpirin x4 -> $5.200 \n"));
                      cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad" ));
                      Nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
                      switch (m){
                          case 1:
                              total=cantidad*1000;
                              JOptionPane.showMessageDialog(null,"El Cliente "+Nombre+" Compro "+ cantidad+" Acetaminofen, total: "+total);
                              registro [i][0]=Nombre; registro[i][1]="Acetaminofem"; registro[i][2]=String.valueOf(cantidad);
                              
                             break;
                          case 2:
                              total=cantidad*3000;
                              JOptionPane.showMessageDialog(null,"El Cliente "+Nombre+" Compro "+ cantidad+" Naproxeno, total: "+total);
                              registro [i][0]=Nombre; registro[i][1]="Naproxeno"; registro[i][2]=String.valueOf(cantidad);
                              
                             break;
                          case 3:
                              total=cantidad*5000;
                              JOptionPane.showMessageDialog(null,"El Cliente "+Nombre+" Compro "+ cantidad+" Dolex Forte, total: "+total);
                              registro [i][0]=Nombre; registro[i][1]="Dolex Forte"; registro[i][2]=String.valueOf(cantidad);
                              
                             break;
                          case 4:
                              total=cantidad*5200;
                              JOptionPane.showMessageDialog(null,"El Cliente "+Nombre+" Compro "+ cantidad+" Noxpirin, total: "+total);
                              registro [i][0]=Nombre; registro[i][1]="Noxpirin"; registro[i][2]=String.valueOf(cantidad);
                             
                             break;
                            
                      }i++;
                  }
                  
                  if (option ==2){
                      JOptionPane.showMessageDialog(null,"La devolucion solo se realiza para medicamento equivocado sin destapar"); 
                      Nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
                      for (int j=0;j<=registro.length-1;j++){
                        if (Nombre.equals(registro[j][0])){
                            JOptionPane.showMessageDialog(null,registro [j][0]+registro [j][1]+registro [j][2]);
                        }else 
                            JOptionPane.showMessageDialog(null,"La persona No compro productos, No hacer devolucion ");
                      }
                  }
                   
                   
                   
        }while(option>=1 && option<3);
        
        
           
    }
}
