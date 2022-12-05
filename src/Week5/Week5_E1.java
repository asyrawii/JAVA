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
public class Week5_E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        int i=0, sum=0;
        
        Random input = new Random();
        
        for(i=0;i<input.nextInt(20)+1;i++){
            sum += i;
            System.out.print(" " +sum);
        }
  
            
        
        
    }
    
}
