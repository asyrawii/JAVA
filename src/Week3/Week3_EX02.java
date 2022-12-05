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
public class Week3_EX02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c,d;
        int max,min;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter four numbers:");
         a=input.nextInt();
         b=input.nextInt();
         c=input.nextInt();
         d=input.nextInt();
         max=a;
         min=a;
         
         if(b>max)
             max=b;
         if(c>max)
             max=c;
         if(d>max)
             max=d;
         
         if(b<min)
             min=b;
         if(c<min)
             min=c;
         if(d<min)
             min=d;
         
         System.out.println("the maximum number is:"+max);
         System.out.println("the minimum number is:"+min);
         
    }
    
}
