/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2;

import java.util.Random;

/**
 *
 * @author pensyarah
 */
public class Week2_E8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random ran =  new Random();
        
        int num;
        num = ran.nextInt();
        System.out.println(num);
        
       
         num = ran.nextInt(100);
        System.out.println(num);
       
        num = ran.nextInt(11)+50;
        System.out.println(num);
                
    }
    
}
