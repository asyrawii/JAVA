/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week7;

/**
 *
 * @author pensyarah
 */
public class Week7_E3 {

    public static void hello(){
        System.out.println("Hello World");
    }
    
    public static void hello1(){
        System.out.println("Hello World 0");
        System.out.println("Hello World 1");
        System.out.println("Hello World 2");
        System.out.println("Hello World 3");
    }
    
    public static void world(){
        int i;
        for(i=0;i<4;i++)
        System.out.println("Hello World " + i);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i;
        
        hello();
        hello();
        hello();
        hello1();
        world();
        for(i=0;i<3;i++)
            hello();
        
    }
    
}


