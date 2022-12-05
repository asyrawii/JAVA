/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week7;

import java.util.Scanner;

/**
 *
 * @author pensyarah
 */
public class Week7_E8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number;
        Scanner input =  new Scanner(System.in);
        
        System.out.print("How many names :");
        number = input.nextInt();
        
        String [] names = new String[number];
        
        for(int i=0;i<number;i++){
            System.out.print("Name " + (i+1) + ": ");
            names[i] = input.next();
        }
        
        System.out.print("Names entered: ");
        for(int i=0;i<number;i++){
            System.out.print(names[i] + " ");
        }
        
        boolean flag=true;
        int i;
        String hold;
        // sort start
        while(flag){
            flag=false;
            for (i=0;i<names.length-1;i++ )            
                if ( names[i].compareToIgnoreCase(names[i+1])>0){
                    hold = names[i];        
                    names[i] = names[i+1];  
                    names[i+1] = hold;
                    flag=true;
                }
        }
        
        System.out.print("\nNames entered (sorted): ");
        for(i=0;i<number;i++){
            System.out.print(names[i] + " ");
        }
        
    }
    
}
