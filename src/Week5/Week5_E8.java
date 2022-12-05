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
public class Week5_E8 {

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
        System.out.print("\nOriginal : ");
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
        
        // sort start
        	for (int pass = 1; pass < NumArray.length; pass++ ) 
         	// control number of comparison
		for (i=0;i<NumArray.length-1;i++ )
                    if ( NumArray[i] > NumArray[i+1] ){
               		int hold = NumArray[i];        
                        NumArray[i] = NumArray[i+1];  
			NumArray[i+1] = hold;
			}
        //sort finish
        
        
        System.out.print("\nSort : ");
        
        for(i=0;i<NumArray.length;i++){
           System.out.print(" " + NumArray[i]);
        }
         
    }
    
}
