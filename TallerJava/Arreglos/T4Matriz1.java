/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.t4matriz1;

/**
 *
 * @author claul
 */
public class T4Matriz1 {

    public static void main(String[] args) {
        int num=0;
        String [][] M_i= new String [4][5];
        String [][] aux= new String [2][5];
        System.out.println("Matriz Inicial");
        
        for (int i=0; i<=M_i.length-1;i++){
        for (int j=0; j<=M_i[0].length-1;j++){
            num=num+1;
            if(num<10){
            M_i[i][j]="0"+num;
                    }else if(num>=10){
                    M_i[i][j]=""+num;
                    }
         System.out.print(M_i[i][j]+" ");   
        }
        System.out.println("");
        }
        
         System.out.println("Matriz Final");
        
        
         //System.out.print(M_f[1][j]);  
        for (int j=0; j<=aux[0].length-1;j++){
            aux[0][j]=M_i[1][aux[0].length-(j+1)];
            aux[1][j]=M_i[3][aux[0].length-(j+1)];
        }
         
        for (int i=0; i<=M_i.length-1;i++){
        for (int j=0; j<=M_i[0].length-1;j++){
            M_i[1][j]= aux[0][j];
            M_i[3][j]= aux[1][j];
        
         System.out.print(M_i[i][j]+" ");   
        }
        System.out.println("");
        }
        //System.out.println("Hello World!");
    }
}
