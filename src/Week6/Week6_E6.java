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
public class Week6_E6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in); 
        char letter; 
        String temp; 
        int count=0; 
        do { 
            System.out.print("Enter a letter (Q to quit): "); 
            temp = s.next(); 
            
            letter = temp.charAt(0);
            
            if (letter=='Q') 
                break; 
            else  
                count++; 
        } while(letter!='Q');
        System.out.printf("The total of number of character you enter is : %d", count); 
    }
    
}
