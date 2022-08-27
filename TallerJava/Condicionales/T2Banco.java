/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.t2banco;

import javax.swing.JOptionPane;

/**
 *
 * @author claul
 */
public class T2Banco {


    public static void main(String[] args) {
        String Titular;
        int ingreso=0, retiro=0, total=0, option = 0;
       
        String[][] registro = new String [3][4];
        do{
            option = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Opcion a Realizar en SuBanco "
           +"\n"+"1. Registrar Titular"+"\n"+"2. Depositar"+"\n"+"3. Retirar"+"\n"+"4. Consultar"+"\n"+"5. Salir de la APP"));
           
            
                  if (option==1)     {       
                      for (int j=0;j<=registro.length-1;j++){
                        Titular = JOptionPane.showInputDialog("Ingrese Nombre y Apellido del Titular");
                        ingreso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuanto desea depositar en la cuenta"));
                   
                       if (ingreso >0){
                      
                       total = ingreso;
                       
                       registro [j][0]=Titular;
                       registro [j][1]=String.valueOf(ingreso);
                       registro [j][2]=String.valueOf(retiro);
                       registro [j][3]=String.valueOf(total);
                       JOptionPane.showMessageDialog(null,"El Titulat "+registro [j][0]+ " Se registro correctamente" +j);
                      }
                        }}
                  
                  if (option==2)     {    
                      
                        Titular = JOptionPane.showInputDialog("Ingrese Nombre y Apellido del Titular");
                        ingreso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuanto desea depositar en la cuenta"));
                  for (int j=0;j<=registro.length-1;j++){ 
                      if (Titular.equals(registro[j][0])){
                        
                          total = ingreso+Integer.parseInt(registro[j][3]);
                          registro [j][0]=Titular;
                          registro [j][1]=String.valueOf(ingreso);
                          registro [j][2]=String.valueOf(retiro);
                          registro [j][3]=String.valueOf(total);
                          JOptionPane.showMessageDialog(null,"Titular  Ingresos    Retiros     Total \n"+
                               registro[j][0]+" "+registro[j][1]+" "+registro[j][2]+" "+registro[j][3]);
                            }}
                  }       
                  
                  
                  if (option==3)     {    
                                   
                    
                        Titular = JOptionPane.showInputDialog("Ingrese Nombre y Apellido del Titular");
                        retiro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuanto desea Retirar en la cuenta"));
                    for (int j=0;j<=registro.length-1;j++){
                        if (Titular.equals(registro[j][0]) && retiro<Integer.parseInt(registro[j][1])){
                       total = Integer.parseInt(registro[j][3])-retiro;
                       registro [j][0]=Titular;
                       registro [j][1]=String.valueOf(ingreso);
                       registro [j][2]=String.valueOf(retiro);
                       registro [j][3]=String.valueOf(total);
                       JOptionPane.showMessageDialog(null,registro [j][0]+registro [j][1]+registro [j][2]+registro [j][3]);
                   }}
                  }
                   
                   
                 
                   if (option==4)     {  
                       Titular = JOptionPane.showInputDialog("Ingrese Nombre y Apellido del Titular");
                        
                        
                       for (int j=0;j<=registro.length-1;j++){
                       if (Titular.equals(registro[j][0])){
                       JOptionPane.showMessageDialog(null,"Titular  Ingresos    Retiros     Total \n"+
                               registro[j][0]+" "+registro[j][1]+" "+registro[j][2]+" "+registro[j][3]);}
                  }}
                     
                    
                   
                   
                   
                   
        }while(option>=1 && option<5);
        
        
       
    }
}
