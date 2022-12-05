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
public class Week10_E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        secondClass first =  new secondClass();
        first.num1 = 10;
        first.num2 = 20;
        first.setNum3(11);
        
        first.subTotal();
        first.subTotal(5);
        
        System.out.println(first.getNum3());
        first.subTotal(5,4,5);
        
    }
    
}
