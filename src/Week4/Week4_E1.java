/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week4;

/**
 *
 * @author pensyarah
 */
public class Week4_E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=1;i<=5;i++)
            System.out.println("Hello World " + i);
        
        int j=1;
        while(j<=5){
            System.out.println("Hello World while " + j++);
        }
        
        int k=1;
        do{
            System.out.println("Hello World do-while " + k++);
        }while(k<=5);
        
    }
    
}
