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
public class Week5_E4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Random rand = new Random();
        Scanner rand = new Scanner(System.in);
        
        int value = rand.nextInt(10);
        int[] score = new int[value];
        int i;
        
        for(i=0;i<score.length;i++)
            score[i] = i*10;
        
        for(i=0;i<score.length;i++)
            System.out.print(" " + score[i]);
    }
    
}
