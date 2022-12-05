/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2;

import java.util.Scanner;

/**
 *
 * @author pensyarah
 */
public class Week2_E7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input  = new Scanner(System.in);
        
        int num, num2;
        System.out.print("Enter two numbers : ");
        num = input.nextInt(); // to get a prompt from computer 
        num2 = input.nextInt(); // to get a value from user
        System.out.println("Total of the number entered is :" + (num+num2)); // to display the total number
    }
    
}
