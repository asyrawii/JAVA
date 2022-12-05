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
public class Week10_E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        firstClass first = new firstClass();
        firstClass second = new firstClass();
        firstClass third = new firstClass();
        first.number =10;
        first.number2 = 20;
        
        second.number = 11;
        second.number2 = 10;
        
        first.subTotal();
        second.subTotal();
        third.subTotal();
        
        firstClass forth = new firstClass(25,25);
        forth.subTotal();
        
        firstClass next = new firstClass(25);
        next.subTotal();;
        
    }
    
}
