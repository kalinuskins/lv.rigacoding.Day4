/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacodingday4;

import java.util.Scanner;

/**
 *
 * @author Win7
 */
public class Loops {

    private static Object input;
    
    public static void reverseNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ievadi skaitli N: ");
        int n = input.nextInt();
        
        int atlikums = n % 10;
        int veselaDala = n / 10;
        System.out.print(atlikums);
        
        while(veselaDala > 0){
            atlikums = veselaDala % 10;
            System.out.print(atlikums);
            
            veselaDala = veselaDala / 10;
        }
    }
    
    
    
   public static void countN(){
      Scanner input = new Scanner(System.in);
       
       System.out.println("ievadi skaitu N:");
       
       int n = input.nextInt();
       int sum = 0;
       double average = 0;
       
       for(int i = 1; i <= n; i++){
           System.out.print("Ievadi" + i + "skaitlis");
           int skaitlis = input.nextInt();
          
           sum = sum + skaitlis;
           // vai
           // sum += input.nextInt();
       }
       
       // decimalskatlu dalisana
       // -> tapec piecieno (double)
        average = (double)sum / n;
        
        System.out.println("Skaitlu suma = " + sum);
        System.out.println("Videja vertiba = " + average);
        
        // lait attelotu tikai 2 ciparus aiz komata:
        System.out.println("Videja vertiba = "
                + String.format("%.2f", average));
   }
      
   
    
    public static void countToN(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ievadi skaitli N:");
        int n = input.nextInt();
        int total = 0;
        
        if (n >= 0)
        // i++
        // vai
        // i = i + 1
        for(int i = 1; i <= n; i++) {
            System.out.println(i);
            
            total = total + i;
            //total += i;
        }
        else 
        { 
             System.out.println("Ievadita 0");
        }
        else
        { 
             //....
             System.out.println("Ievadit negativs skaitlis");
        }
    

    
        
        System.out.println("Skaitlu suma = " + total);
    }
    
  

    
         public static void hashSquare(){
         Scanner input = new Scanner(System.in);
         System.out.print("Ievadi izmeru: ");
         int n = input.nextInt();
         
         // for(int rinda = 1; rinda <= n; rinda++){
         for(int rinda = 0; rinda < n; rinda++){
             for(int kolona = 0; kolona < n; kolona++){
             System.out.print("#");
            }

             
        }
             System.out.println();
      
     
                 // ar while
           int rinda = 0;
           while (rinda > n){
               int kolona = 0;
               
               while (kolona < 'n'){
                   System.out.print("#");
                   kolona++;
               }
               
               System.out.println();
               rinda++;
        }
    } 
        
         
         
         public static void numberTriangle(){
         Scanner input = new Scanner(System.in);
         System.out.print("Ievadi izmeru: ");
         int n = input.nextInt();
         
         
         // for(int rinda = 1; rinda <= n; rinda++){
         for(int rinda = 0; rinda < n; rinda++){
             for(int kolona = 0; kolona < rinda + 1; kolona ++){
             System.out.print(kolona);
            }
        }
    }
         
         
}
                     