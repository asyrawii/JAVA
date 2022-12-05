/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3;

import java.util.Scanner;

/**
 *
 * @author pensyarah
 */
public class Week3_EX03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a,b,c;
        int temp;
        System.out.print("Enter three number");
        Scanner input = new Scanner(System.in);
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        
        if(a>b){
            temp = a;
            a = b;
            b = temp;
         }
        if(a>c){
            temp = a;
            a = c;
            c = temp;
         }
        if(b>c){
            temp = b;
            b = c;
            c = temp;
         }
        System.out.println(a + " " + b + " " + c );
        
       
      
        
        
        
        
    }
    
}
