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
public class Week7_E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input;
        int i;
        int a=0,b=0,c=0,d,e,f,g,h;
        Scanner get = new Scanner(System.in);
        
        do{
            System.out.println("Enter a name (n to stop:)");
            input = get.next();
            
            
            for(i=0;i<input.length();i++){
                if(input.charAt(i) == 'a' || input.charAt(i)=='A')
                    a++;
                if(input.charAt(i) == 'b' || input.charAt(i)=='B')
                    b++;
                if(input.charAt(i) == 'c' || input.charAt(i)=='c')
                    c++;
                  
            }
            
        }while(!(input.equalsIgnoreCase("n")));
        
        System.out.println("A :" + a);
        System.out.println("B :" + b);
        System.out.println("C :" + c);
        
               
    }
    
}
