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
public class Week4_E3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number;
        int sum=0;
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Enter a number :");
            number = input.nextInt();
            if(number>=2 && number<=5)
                sum += number;
        }while(number!=-1);
        System.out.println("Total number :" + sum);
    }
    
}
