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
public class Week5_E7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        int num, numflag=0;
        System.out.print("Enter a number : ");
        num = input.nextInt();
        
        int[] NumArray = new int[num];
        int i=0;
        
        do{
           int temp = rand.nextInt(num+10);
           numflag=0;
           for (int j=0; j<=i; j++){
               if (temp==NumArray[j]){
                   numflag=1;
               }
           }
           if(numflag==0){
               NumArray[i] = temp;
               System.out.print(" " + NumArray[i]);
               i++;
           }
        }while(i<NumArray.length);
        
        System.out.println("");
        
        for(i=NumArray.length-1;i>=0;i--){
           System.out.print(" " + NumArray[i]);
        }
         
            
    }
    
}
