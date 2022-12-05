/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3;

import java.util.Scanner;

/**
 *
 * @author pensyarah
 */
public class Week3_EX01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1,num2;
        Scanner input = new Scanner (System.in);
        System.out.print("Enter two numbers:");
        num1 = input.nextInt();
        num2 = input.nextInt();
        if (num1>num2)
            System.out.print(num1 + " greater than "+ num2);
        else 
            System.out.print (num1 + " less than " + num2);
        
    }
    
}
