/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2;

/**
 *
 * @author pensyarah
 */
public class Week2_E4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=8, b=3;
        double answer;
        answer = a / b;			// Output is 2
        System.out.println(answer);
        answer = (double) a / b;		// Output is 2.6666 
        System.out.println(answer);
        System.out.printf("%.2f", answer);

    }
    
}
