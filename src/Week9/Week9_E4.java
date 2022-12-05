/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author pensyarah
 */
public class Week9_E4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        String filename = "faculty.txt";
        PrintWriter outStream = null;
        Scanner input = new Scanner(System.in);
        
        try{
            outStream = new PrintWriter(new FileOutputStream(filename,true));
        }catch(FileNotFoundException e){
            System.out.println("Error File Not Found");
            System.exit(0);
        }
        
        String name;
        String matrix;
        int age =0;
        
        do{
            System.out.print("Enter name:");
            name = input.nextLine();
            System.out.print("Enter age:");
            age = input.nextInt();
            if(age!=-1){
                System.out.print("Enter Matrix:");
                input.nextLine();
                matrix = input.nextLine();
                outStream.println(name + ","  + age + "," + matrix);
            }
             //input.nextLine();
        }while(age!=-1);
            
        outStream.close();
    }
    
}
