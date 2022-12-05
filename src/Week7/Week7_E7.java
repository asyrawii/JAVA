/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week7;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pensyarah
 */
public class Week7_E7 {

    public static int getTotal(){
        Scanner input =  new Scanner(System.in);
        int number, total=0;
        
        do{
            System.out.print("Enter a number (-1 to stop) :");
            number = input.nextInt();
            total += number;
        }while(!(number== -1));
        
        System.out.println("Total number : " + (total+1));
        return total+1;
    }
    
    public static void printRandom(int total){
        Random rand = new Random();
        System.out.print("Random number : ");
        for(int i=0;i<=total;i++) 
            System.out.print(rand.nextInt(40)+10 + " ");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int total = getTotal();
        printRandom(total);
        
        System.out.println();
        printRandom(getTotal());
        System.out.println(getTotal());
    }
    
}
