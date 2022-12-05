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
public class Week6_E8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        String name,account;
        double totalUsage, payment=0.0;
        
        System.out.print("Enter name: ");
        name = input.next();
        System.out.print("Enter account number: ");
        account= input.next();
        System.out.print("Enter Total usage :");
        totalUsage = input.nextDouble();
        
        System.out.println(name + "(" + account + ")");
        System.out.printf("Total usage %.0f", totalUsage);
        
        if(totalUsage > 400){
            payment = (totalUsage-400)*0.416;
            payment += 21.8+21.8+33.40+40;
        }
        
        if(totalUsage > 300 && totalUsage <=400){
            payment = (totalUsage-300)*0.40;
            payment += 21.8+21.8+33.40;
        }
        
        if(totalUsage > 200 && totalUsage <=300){
            payment = (totalUsage-200)*0.334;
            payment += 21.8+21.8;
        }
        
        if(totalUsage > 0 && totalUsage <=200){
            payment = (totalUsage)*0.218;
        }
        if(payment<3.00)
            payment=3.00;
        
        System.out.printf("\nTotal Payment : %.2f",payment);
    }
    
}
