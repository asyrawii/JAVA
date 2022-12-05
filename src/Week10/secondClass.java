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
public class secondClass {
    
    public int num1;
    public int num2;
    private int num3;

    public secondClass() {
        this.num1 = 0;
        this.num2 = 0;
        this.num3 = 0;
    }

    public secondClass(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public secondClass(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    
    public void subTotal(){
        System.out.println("Total is :" + (num1+num2+num3));
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }
    
    public void subTotal(int num3){
        this.num3 = num3;
        System.out.println("Method Overloading");
        this.subTotal();
    }
    
    public void subTotal(int num1,int num2, int num3){
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("Method Overloading New");
        this.subTotal(num2*num3);
    }
    
    
}

