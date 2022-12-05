/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3;

import java.util.Scanner;

/**
 *
 * @author Badrul
 */
public class Week3_E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       int a;
       
       Scanner input =  new Scanner(System.in);
       
        System.out.print("Enter a number : ");
        a = input.nextInt();
       
       if(a==1){
            System.out.println("One");
            System.out.println("Satu");
        }
        if(a==2){
            System.out.println("Two");
            System.out.println("Dua");
        }
       if(a==3){
           System.out.println("three");
           System.out.println("Tiga");
       }
           
    }
    
}
