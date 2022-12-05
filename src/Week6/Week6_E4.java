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
public class Week6_E4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        int num;
        
        do{
            System.out.print("Enter a number [10-20]:");
            num = input.nextInt();
        }while(num<10 || num>20);
        
        int i=0;
        int randNum;
        if(num%2 == 0){
            System.out.print("The random even numbers [1-100]: ");
            do{
                randNum = rand.nextInt(100)+1;
                if(randNum%2==0){
                    System.out.print(randNum +  " ");
                   i++;
                }
                 
            }while(i<num);
            
        }else{
            System.out.print("The random odd numbers [1-100]: ");
            do{
                 randNum = rand.nextInt(100)+1;
                 if(randNum%2==1){
                    System.out.print(randNum +  " ");
                    i++;
                }
            }while(i<num);
        }
            
        
    }
    
}
