/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week6;

import java.util.Scanner;

/**
 *
 * @author pensyarah
 */
public class Week6_E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input =  new Scanner(System.in);
        int num1, num2, num3, sum;
        
        System.out.print("Enter a number : ");
        num1 = input.nextInt();
        System.out.print("Enter a number : ");
        num2 = input.nextInt();
        System.out.print("Enter a number : ");
        num3 = input.nextInt();
        sum=num1+num2+num3;
        System.out.println("Total number is " + sum);
                
       
    }
    
}
