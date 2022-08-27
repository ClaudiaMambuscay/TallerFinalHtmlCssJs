/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.t3ciclo1;

/**
 *
 * @author claul
 */
public class T3Ciclo1 {

    public static void main(String[] args) {
       
        int n=10;
        String k="";
        for (int i=1;i<=n;i++){
            k+="*";
        //System.out.println(k); 
        }
        
        
        int f=1, c=1;
        String p=""; String h="";
        
      while (f>0 && f<=n){
     
        c=n-f;
       
         for(int i=1;i<=c;i++){//Agrega los espacios de manera descendente
         p+=p+" ";
         //System.out.print(p); 
         p="";
         }
         
         h+="*";
         //System.out.println(h); 

      f=f+1;
      }
          
       String a="", b="";
       int l=1, m=1;
       
       do{
            l=n-m;
       
         for(int i=1;i<=l;i++){//Agrega los espacios de manera descendente
         a+=a+"-";
         System.out.print(a); 
         a="";
         }
         
         b+="*";
         System.out.println(b); 
         b+="*";

      m=m+1;
       }while(m<=n);
        
       String g="", j="";
       int u=1,r=0;
       do{
           r=n-(u+1);
            
       for(int i=1;i<=r;i++){//Agrega los espacios de manera descendente
         g+=g+" ";
         System.out.print(g); 
         g="";
        
         }
       
       
      
       for(int i=1;i<=u+2;i++){
         j+="*";
   
       }System.out.println(j);
       j="*";
      
       u++;
       }while(u<5);
    //3357
}
}