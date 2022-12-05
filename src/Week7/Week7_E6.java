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
public class Week7_E6 {
    
        public void add(){
            Scanner input = new Scanner(System.in);
            int n1,n2;
            System.out.print("Enter two numbers: ");
            n1 = input.nextInt();
            n2 = input.nextInt();
            System.out.println("Total :" + (n1+n2));
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Week7_E6 a = new Week7_E6();
        Week7_E6 a1 = new Week7_E6();
        
        a.add();
        a1.add();
    }
    
}

