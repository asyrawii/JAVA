/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week4;

import java.util.Scanner;

/**
 *
 * @author pensyarah
 */
public class Week4_E5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String word;
        Scanner input = new Scanner (System.in);
        do {
            System.out.print("Enter a string:");
            word=input.nextLine();
            
        }while(!(word.equalsIgnoreCase("stop")));
        
        do {
            System.out.print("Enter a string (Compare):");
            word=input.nextLine();
            
        }while(word.compareToIgnoreCase("stop")!=0);
    }
    
}
