/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week8;

import java.util.Scanner;

/**
 *
 * @author pensyarah
 */
public class Week8_E3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String temp="";
        int count=0;
        int ccount=0;
        int i;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a character to search: ");
        String character=input.next();
        
        System.out.print("Enter a number: ");
        int num=input.nextInt();
        
        for(i=1; i<=num;i++){
            System.out.print("Enter word " + i + ": ");
            String word=input.next();
            temp +=" "+word;
            count += word.length();
        }
        
        for(int j=0; j<temp.length();j++){
            if(character.charAt(0)==temp.charAt(j))
                ccount++;
        }
        
        System.out.println ("Word Entered: "+temp);
        System.out.println("Count character: "+count);
        System.out.println("Count character '" + character.charAt(0) + "': " + ccount);
        
        System.out.print("Reverse: ");
        for(i=temp.length()-1;i>=0;i--){
            System.out.print(temp.charAt(i));
        }
        
    }
    
}
