/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week5;

/**
 *
 * @author pensyarah
 */
public class Week5_E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] num = {11,22,33,44,55,66,77,88,99};
        
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(num[3]);
        System.out.println(num[4]);
        System.out.println(num[5]);
    //    System.out.println(num[6]); // this is error java.lang.ArrayIndexOutOfBoundsException
        
        for(int i=0;i<num.length;i++)
            System.out.print(" " + num[i]);
        
        
        
        
        
        
    }
    
}
