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
public class Week3_E7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        number =  keyboard.nextInt();
        switch (number){
            case 1:
                System.out.println("One"); 
                break;
            case 2:
                System.out.println("Two"); 
                break;
            default:
                System.out.println("This program accepts the number from 1 to 2 only");
        }

    }
    
}
