/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pensyarah
 */
public class Week4_E4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number,sum=0,rand;
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        System.out.print("Enter a number :");
        number = input.nextInt();
        
        for(int i=0;i<number;i++){
            rand = ran.nextInt(100);
            System.out.println(rand);
            
            if(rand%2==0){
                sum += rand;
            }
        }
        System.out.println("Total:" + sum);
    }
    
}
