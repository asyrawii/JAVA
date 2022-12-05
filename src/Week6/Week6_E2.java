/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pensyarah
 */
public class Week6_E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num; //1
        Scanner input = new Scanner(System.in); //1
        Random rand = new Random();
        
        do{
            System.out.print("Enter a number [1-10]:");
            num = input.nextInt(); //1
        }while(num < 1 || num >10); //1  !(num>0 && num <=10)
        
        System.out.print("Random Number [1-100]:");
        for(int i=0;i<num;i++){//1
            System.out.print(rand.nextInt(100)+1 + " "); //2
        }
    }
    
}
