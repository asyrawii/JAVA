/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week7;

import java.util.Scanner;

/**
 *
 * @author pensyarah
 */
public class Week7_E5 {

    public static int add(int a, int b){
         return a+b;
    }
    
    public static void add2(int a, int b){
          System.out.println("Total in add2 :" + (a+b));
    }
    
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n1,n2;
        System.out.print("Enter two numbers: ");
        n1 = input.nextInt();
        n2 = input.nextInt();
        System.out.println("Total :" + add(n1,n2));
        add2(n1+n1,n2+n2);
        add2(add(add(n2,n2),n2),add(n1,n1));
        
       
    }
    
}
