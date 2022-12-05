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
public class Week4_E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i;
        for(i=1;i<=10;i=i+2)
            System.out.print(i + " ");
        
        System.out.println();
        for(i=1;i<=10;i++)
            if(i%2==1)
                System.out.print(i + " ");
        
        System.out.println();
        for(i=1;i<=10 && i%2==1;i++)
                System.out.print(i + " ");
        
        System.out.println();
        int k=0;
        do{ 
            if(k%2!=0)
                System.out.print(k + " ");
            k++;
        }while(k<=10);
        
        System.out.println();
        int j=1;
        while(j<=10){
            if(j%2==1)
                System.out.print(j+" ");
            j++;
        }
       
    }
    
}
