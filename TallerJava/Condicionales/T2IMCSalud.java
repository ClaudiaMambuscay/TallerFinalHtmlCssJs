/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.t2imcsalud;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author claul
 */
public class T2IMCSalud {

    public static void main(String[] args) {
        
        int F = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de personas que va a ingresar"));
        
        String [][] registro= new String [F][5];
        for (int i=0; i<=registro.length-1;i++){
        String nombre=JOptionPane.showInputDialog("Ingrese el nombre de la persona "+(i+1));
        Float peso= Float.parseFloat(JOptionPane.showInputDialog("Ingrese el peso en Kg"));
        Float estatura= Float.parseFloat(JOptionPane.showInputDialog("Ingrese la estatura en m"));
        
        Float imc = peso/(estatura*estatura);
        
        registro [i][0] = nombre;
        registro [i][1] = String.valueOf(peso);
        registro [i][2] = String.valueOf(estatura);
        registro [i][3] = String.valueOf(imc);
        
        if (imc <18.5){
        registro [i][4]="Bajo Peso";
        }else
        if (imc>=18.5 || imc<24.9){
        registro [i][4]="Normal";
        }else
        if (imc>=24.9 || imc<29.9){
        registro [i][4]="Sobrepeso";
        }else
        if (imc>=29.9){
        registro [i][4]="Obeso";
        }
        
       
    }
        String datos="";
        JTextArea narea= new JTextArea(10,30);
        JScrollPane nscroll = new JScrollPane(narea);
        for (int i=0; i<=registro.length-1;i++){
            for (int j=0; j<=registro[0].length-1;j++){
              
                datos+= registro[i][j]+"   ";
         
            }
            datos+= "\n";
            }
        narea.append("Nombre:    Peso:     Estatura:  IMC:  Condicion Fisica:"+"\n"+ datos);
        JOptionPane.showMessageDialog( nscroll,narea,"Condicion Fisica",JOptionPane.INFORMATION_MESSAGE);
        
        
        
}}
