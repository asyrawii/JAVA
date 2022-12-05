/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pensyarah
 */
public class Week5_E6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        int num;
        System.out.print("Enter a number : ");
        num = input.nextInt();
        
        int[] NumArray = new int[num];
       
        for(int i=0;i<NumArray.length;i++){
           NumArray[i] = rand.nextInt(20)+1;
           System.out.print(" " + NumArray[i]);
        }
        System.out.println("");
        
        for(int i=NumArray.length-1;i>=0;i--){
           System.out.print(" " + NumArray[i]);
        }
         
            
       
       
       
       
        
    }
    
}
