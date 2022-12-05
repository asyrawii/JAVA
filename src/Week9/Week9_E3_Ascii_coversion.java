/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week9;

import java.util.Scanner;

/**
 *
 * @author Badrul
 */
public class Week9_E3_Ascii_coversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =  new Scanner(System.in);
        int number;
        
        System.out.print("Enter any number:");
        number = input.nextInt();
        
        System.out.print((char) number);
        
        char huruf = (char) number;
        
        System.out.println("\nchar:" + huruf);
    }
    
}
