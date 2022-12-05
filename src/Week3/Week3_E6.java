/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3;

import java.util.Scanner;

/**
 *
 * @author pensyarah
 */
public class Week3_E6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int grade;
        char gradeV;
        Scanner input =  new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        grade = input.nextInt();
        
        if(grade >= 80 && grade <=100)
            gradeV = 'A';
        else if(grade >=50 && grade <80)
            gradeV = 'B';
        else if(grade >=40 && grade <50)
            gradeV = 'C';
        else
            gradeV = 'D';
        
        System.out.println("Grade for the number : " + gradeV);
        
                    
      
    }
    
}
