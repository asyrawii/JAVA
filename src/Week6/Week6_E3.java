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
public class Week6_E3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner  input = new Scanner(System.in);
        
        do{
            System.out.print("Enter a number:");
          num = input.nextInt();
        }while(num < 1 || num > 5);
        
        System.out.print("Number: ");
        for(int i = num;i>=1; i--)
            System.out.print(i + " ");
            
    }
    
}
