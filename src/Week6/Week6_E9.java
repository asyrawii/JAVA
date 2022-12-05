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
public class Week6_E9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double principal, rate;
        int month;
        
        System.out.print("Enter deposit amount (RM):");
        principal = input.nextDouble();
        System.out.print("Enter number of month:");
        month = input.nextInt();
        System.out.print("Enter annual interest rate (%):");
        rate = input.nextDouble();
        System.out.println("Month\t\tPrincipal\t\tInteres (%)\t\t\tInterest");
        
        for(int i=1;i<=month;i++){
           double interest = (principal * rate/100)/12;
           System.out.printf("\n %d\t\t%.2f\t\t%.2f\t\t\t%.2f", i, principal, rate,interest);
           rate += 0.12;
           principal += interest;
        }
        
    }
    
}
