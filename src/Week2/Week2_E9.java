/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pensyarah
 */
public class Week2_E9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2;
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        System.out.print("Enter a number:");
        num1= input.nextInt();
        num2= ran.nextInt(51)+100;
        System.out.println("Total number " + num1 + " + " + num2 + " = "+ (num1 + num2));
    }
    
}
