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
public class subRandomClass extends randomClass {

       
    public subRandomClass(int num) {
        super(num);
    }

    public subRandomClass() {
        super();
        System.out.println("Constructor in Subclass");
        
    }
    
    @Override
    public void sortRandom(){
        for(int i=0;i<this.numArray.length;i++){
            for(int j=0;j<this.numArray.length-1;j++){
                if(this.numArray[j]<this.numArray[j+1]){
                    int temp = this.numArray[j];
                    this.numArray[j] = this.numArray[j+1];
                    this.numArray[j+1] = temp;
                }
            }
        }
    }
    
    public void helloSubClass(){
        System.out.println("In subclass of subRandomClass");
    }
    
    
    
}
