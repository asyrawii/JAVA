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
public class Week6_E5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String durian;
        Scanner input =  new Scanner(System.in);
        int price=0,kg;
        
        do{
            System.out.print("Enter the type of Durian: ");
            durian = input.next();
        }while(!(durian.equalsIgnoreCase("MK")));
        
        
        System.out.print("Enter the sale in kg: ");
        kg = input.nextInt();
        System.out.println(durian);
        
        if(durian.equalsIgnoreCase("MK"))
            price = 25;
        if(durian.equalsIgnoreCase("HL"))
            price = 22;
        if(durian.equalsIgnoreCase("D24"))
            price = 20;
        if(durian.equalsIgnoreCase("UM"))
            price = 18;
        
        System.out.print("Total sales :" + price*kg);
    }
    
}
