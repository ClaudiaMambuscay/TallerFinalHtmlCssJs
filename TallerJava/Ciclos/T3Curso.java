/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.t3curso;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author claul
 */
public class T3Curso {

    public static void main(String[] args) {
        
           int op; 
       String nombre, nota;
        
       String [][] registro = new String [8][2];
       
        do{
        op=Integer.parseInt(JOptionPane.showInputDialog("Menu Curso: \n 1. Registrar usuarios"
                + "\n 2. Registrar notas \n 3. Consultar notas \n 4. Salir de la APP"));
       
        switch (op){
            case 1://registrar
               
             for (int i=0;i<=registro.length-1;i++){
            nombre=JOptionPane.showInputDialog("Ingrese el nombre y apellidos completos"
                    + "\n Cupos disponibles: "+(8-i));
            
            registro[i][0] =  nombre;
            registro[i][1] =  "";
            
            JOptionPane.showMessageDialog(null,"El estudiante "+registro[i][0]+ " se registro correctamente");
                } 
             
            break;
            case 2:// Ingresar notas
             nombre =JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
            for (int i=0;i<=registro.length-1;i++){
                if (nombre.equals(registro[i][0])){
                    
                    nota =JOptionPane.showInputDialog("Ingrese la nota del estudiante");
                  registro[i][1]=nota;
                    JOptionPane.showMessageDialog(null,"Estudiante: "+registro[i][0]+ " Nota:"+registro[i][1]);
              
                }
      
              } 
            
             break;
            case 3://Consultar notas del curso
             
                
                  String datos="";
            JTextArea narea= new JTextArea(10,30);
            JScrollPane nscroll = new JScrollPane(narea);
             for (int i=0; i<=registro.length-1;i++){
                for (int j=0; j<=registro[0].length-1;j++){
              
                datos+= registro[i][j]+"   ";
         
            }
            datos+= "\n";
            }
        narea.append("Nombre:    Nota: \n"+ datos);
        JOptionPane.showMessageDialog( nscroll,narea,"Notas del curso",JOptionPane.INFORMATION_MESSAGE);
        
                break;
              } 
             
        
    }while(op>=1 && op<4);
    }
}
