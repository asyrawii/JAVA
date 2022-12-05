/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week10;

import java.util.Random;

/**
 *
 * @author pensyarah
 */
public class Week10_E3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /*
        thirdClass ran = new thirdClass();
       ran.getRandom();
       System.out.println();
       */
       
       randomClass rand1 = new randomClass(15);
       rand1.getRandom();
       rand1.printRandom();
       System.out.println();
       rand1.sortRandom();
       rand1.printRandom();
       
       
        
       
    }
    
}
