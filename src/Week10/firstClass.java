/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week10;

/**
 *
 * @author pensyarah
 */
public class firstClass {
    
    public int number;
    public int number2;
    
    public firstClass(){
        this.number = 0;
        this.number2 = 0;
    }
    
    public firstClass(int number){
        this.number =  number;
        this.number2 = 0;
    }
    public firstClass(int number, int number2){
        this.number =  number;
        this.number2 = number2;
    }
    
    public void printHello(){
        System.out.println("Hello World");
    }
    
    public void subTotal(){
        System.out.println("Total is : " + (number+number2));
    }
    
}
