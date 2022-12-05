/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week10;

import java.util.Random;

/**
 *
 * @author pensyarah
 */
public class thirdClass {
    
    public int i, sum;

    public thirdClass() {
        this.i = 0;
        this.sum =0;
    }
    
    public thirdClass(int i, int sum) {
        this.i = i;
        this.sum = sum;
    }
    
    public void getRandom(){
         Random input = new Random();
        for(i=0;i<input.nextInt(20)+1;i++){
            sum += i;
            System.out.print(" " +sum);
        }
    }

   
    
    
    
}
