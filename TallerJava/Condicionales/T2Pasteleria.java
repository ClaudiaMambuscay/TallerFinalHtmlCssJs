/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.t2pasteleria;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author claul
 */
public class T2Pasteleria {

    public static void main(String[] args) {
      String sabor, decoracion, disponible, nombre, porcion;
      int cantidad, option, price, i=0;
      String [][] registro = new String [3][5];//NumPersonas, opciones
      int V1=3, V2=3,C1=3,C2=3;
      
      do{
      option = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una de las opciones: \n"
              + "1. Producto nuevo \n 2. Producto disponible \n 3. Ventas del dia \n 4. Salir de la APP"));
      
      switch(option){
          case 1: // El cliente solicita una torta con caracteristicas unicas
          nombre = JOptionPane.showInputDialog("Ingrese el nombre del Cliente");
          sabor = JOptionPane.showInputDialog("Ingrese el sabor: Vainilla, Naranja, Chocolate, Genovesa o Envinada");
          decoracion = JOptionPane.showInputDialog("Motivo: Cumplea, Grado, Matrimonio");
          porcion = JOptionPane.showInputDialog("Ingrese la porcion: 0.5L, 1L, 2L");
          cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de tortas a comprar"));
          if (sabor.equals("Vainilla")||sabor.equals("Naranja")||sabor.equals("Chocolate")){
          
              if(porcion.equals("0.5")){
              price = 15000*cantidad;
              registro[i][0]=nombre; registro[i][1]=sabor;
              registro[i][2]=porcion; registro[i][3]=String.valueOf(cantidad);
              registro[i][4]=String.valueOf(price);
              JOptionPane.showMessageDialog(null,"La torta de sabor "+sabor+" de "+porcion+
                      "L con motivo "+decoracion+" cuesta $"+price);
              }else if(porcion.equals("1")){
              price = 25000*cantidad;
              registro[i][0]=nombre; registro[i][1]=sabor;
              registro[i][2]=porcion; registro[i][3]=String.valueOf(cantidad);
              registro[i][4]=String.valueOf(price);
              JOptionPane.showMessageDialog(null,"La torta de sabor "+sabor+" de "+porcion+
                      "L con motivo "+decoracion+" cuesta $"+price);
              }else if(porcion.equals("2")){
              price = 35000*cantidad;
              registro[i][0]=nombre; registro[i][1]=sabor;
              registro[i][2]=porcion; registro[i][3]=String.valueOf(cantidad);
              registro[i][4]=String.valueOf(price);
              JOptionPane.showMessageDialog(null,"La torta de sabor "+sabor+" de "+porcion+
                      "L con motivo "+decoracion+" cuesta $"+price);
              }
              i++;
          
          }else if (sabor.equals("Genovesa")||sabor.equals("Envinada")){
              if(porcion.equals("0.5")){
              price = 25000*cantidad;
              registro[i][0]=nombre; registro[i][1]=sabor;
              registro[i][2]=porcion; registro[i][3]=String.valueOf(cantidad);
              registro[i][4]=String.valueOf(price);
              JOptionPane.showMessageDialog(null,"La torta de sabor "+sabor+" de "+porcion+
                      "L con motivo "+decoracion+" cuesta $"+price);
              }else if(porcion.equals("1")){
              price = 40000*cantidad;
              registro[i][0]=nombre; registro[i][1]=sabor;
              registro[i][2]=porcion; registro[i][3]=String.valueOf(cantidad);
              registro[i][4]=String.valueOf(price);
              JOptionPane.showMessageDialog(null,"La torta de sabor "+sabor+" de "+porcion+
                      "L con motivo "+decoracion+" cuesta $"+price);
              }else if(porcion.equals("2")){
              price = 40000*cantidad;
              registro[i][0]=nombre; registro[i][1]=sabor;
              registro[i][2]=porcion; registro[i][3]=String.valueOf(cantidad);
              registro[i][4]=String.valueOf(price);
              JOptionPane.showMessageDialog(null,"La torta de sabor "+sabor+" de "+porcion+
                      "L con motivo "+decoracion+" cuesta $"+price);
              }
          i++;
          }
          break;
          
     case 2: //El cliente selecciona una torta disponible de la tienda
            
         nombre = JOptionPane.showInputDialog("Ingrese el nombre del Cliente");
         sabor = JOptionPane.showInputDialog("Ingrese el sabor y cantidad: \n Vainilla 0.5L-"+V1+" o 1L-"+V2+" \n Chocolate 0.5L-"+C1+" o 1L-"+C2);
                           
          cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de tortas a comprar"));
           
              if (sabor.equals("Vainilla 0.5")){
   
              price = 15000*cantidad;
              registro[i][0]=nombre; registro[i][1]=sabor;
              registro[i][2]="0.5"; registro[i][3]=String.valueOf(cantidad);
              registro[i][4]=String.valueOf(price);
              JOptionPane.showMessageDialog(null,"La torta de sabor "+sabor+"L con motivo "+" cuesta $"+price);
              i++; 
              V1=V1-1;
              }else  if (sabor.equals("Vainilla 1")){
   
              price = 25000*cantidad;
              registro[i][0]=nombre; registro[i][1]=sabor;
              registro[i][2]="1"; registro[i][3]=String.valueOf(cantidad);
              registro[i][4]=String.valueOf(price);
              JOptionPane.showMessageDialog(null,"La torta de sabor "+sabor+"L con motivo "+" cuesta $"+price);
              i++;
              V2=V2-1;
              }else if (sabor.equals("Chocolate 0.5")){
   
              price = 15000*cantidad;
              registro[i][0]=nombre; registro[i][1]=sabor;
              registro[i][2]="0.5"; registro[i][3]=String.valueOf(cantidad);
              registro[i][4]=String.valueOf(price);
              JOptionPane.showMessageDialog(null,"La torta de sabor "+sabor+"L con motivo "+" cuesta $"+price);
              i++;
              C1=C1-1;
              }else if (sabor.equals("Chocolate 1")){
   
              price = 25000*cantidad;
              registro[i][0]=nombre; registro[i][1]=sabor;
              registro[i][2]="1"; registro[i][3]=String.valueOf(cantidad);
              registro[i][4]=String.valueOf(price);
              JOptionPane.showMessageDialog(null,"La torta de sabor "+sabor+"L con motivo "+" cuesta $"+price);
              i++;
              C2=C2-1;}
             
              
         break;
          
          
      case 3:
              if (i<3){
              registro[i][0]=""; registro[i][1]="";
              registro[i][2]=""; registro[i][3]="";
              registro[i][4]="";  
                  
              i++;
              }else {
                  String datos="";
        JTextArea narea= new JTextArea(10,30);
        JScrollPane nscroll = new JScrollPane(narea);
        for (int j=0; j<=registro.length-1;j++){
            for (int k=0; k<=registro[0].length-1;k++){
              
                datos+= registro[j][k]+"   ";
         
            }
            datos+= "\n";
            }
        narea.append("Nombre:    Sabor:     Porcion:    Cantidad:  Precio:"+"\n"+ datos);
        JOptionPane.showMessageDialog( nscroll,narea,"Condicion Fisica",JOptionPane.INFORMATION_MESSAGE);
        
              }
              
          break;
      
      
      } 
    }while(option>=1 && option<4);
              }
}
