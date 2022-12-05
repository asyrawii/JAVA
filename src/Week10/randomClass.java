/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week10;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author pensyarah
 */
public class randomClass {
    
    public int num;
    public int[] numArray;

    public randomClass(int num) {
        this.num = num;
        this.numArray = new int[num];
    }

    public randomClass() {
        this.getnumber();
        System.out.println("constructor in randomClass()");
    }
    
    public void getnumber(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        this.num = keyboard.nextInt();
        this.numArray = new int[this.num];
    }
    
    public void getRandom(){
        Random ran = new Random();
        for(int i=0;i<this.num;i++)
            this.numArray[i] = ran.nextInt(this.num+10);
    }
    
    public void printRandom(){
        for(int i=0;i<this.num;i++){
            System.out.print(this.numArray[i] + " ");    
        }
    }
    
    public void sortRandom(){
        for(int i=0;i<this.numArray.length;i++){
            for(int j=0;j<this.numArray.length-1;j++){
                if(this.numArray[j]>this.numArray[j+1]){
                    int temp = this.numArray[j];
                    this.numArray[j] = this.numArray[j+1];
                    this.numArray[j+1] = temp;
                }
            }
        }
    }
  
}
