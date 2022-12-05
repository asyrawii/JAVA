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
public class Week3_E5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String s1, s2;
        
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter First String:");
        s1 = input.nextLine();
        System.out.print("Enter Second String:");
        s2 = input.nextLine();
        
        if (s1.equals(s2))
            System.out.println("They are equal strings.");
        else
            System.out.println("They are not equal strings.");

        if (s1.equalsIgnoreCase(s2))
            System.out.println("They are equal strings (IgnoreCase).");
        else
            System.out.println("They are not equal strings (IgnoreCase).");
        
        if(s1.compareTo(s2)==0)
            System.out.println("They are equal strings (CompareTo).");
        else 
            System.out.println("They are not equal strings (CompareTo).");
        
        if(s1.compareToIgnoreCase(s2)==0)
            System.out.println("They are equal strings (compareToIgnoreCase).");
        else 
            System.out.println("They are not equal strings (compareToIgnoreCase).");
        
        System.out.println("the value return by compareTo : " + s1.compareTo(s2));
        System.out.println("the value return by compareToIgnoreCase : " + s1.compareToIgnoreCase(s2));
    }
    
}
