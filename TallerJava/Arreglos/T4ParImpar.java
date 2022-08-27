/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.t4parimpar;

/**
 *
 * @author claul
 */
public class T4ParImpar {

    public static void main(String[] args) {
        int par, impar, num,contp=0,contim=0;
        int [] vect = new int [20];
        
        for (int i=0;i<=vect.length-1;i++){
            
        vect[i]= (int) (Math.random()*100);
        
        num = vect[i]%2;
        
        if (num==0){
        contp=contp+1;
        }else if(num!=0){
            contim=contim+1;}
        //System.out.println(vect[i]);
        }
        
        //Pares
        System.out.print("Pares: ");
        for (int i=0;i<=vect.length-1;i++){
            num=vect[i]%2;
            if (num==0){
                par = vect[i];
            System.out.print(par+" ");
            }}
        System.out.println(" ");
        
        //Impares
        System.out.print("Impares: ");
        for (int i=0;i<=vect.length-1;i++){
            num=vect[i]%2;
            if (num!=0){
                impar = vect[i];
            System.out.print(impar+" ");
            }}
        
    }
}
