/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pensyarah
 */
public class Week9_E6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String filename = "random.txt";
        PrintWriter outStream = null;
        
        try{
            outStream = new PrintWriter(new FileOutputStream(filename,false));
        }catch(FileNotFoundException e){
            System.out.println("Error No File Found");
            System.exit(0);
        }
        
        
        //write random number
        Random input = new Random();
     
        for(int i=0;i<1000000;i++)      
            outStream.println(input.nextInt(20));
        
        outStream.close();
        
        //read the 
        
        Scanner inputStream = null;
        
        try{
            inputStream = new Scanner(new File(filename));
        }
        catch(FileNotFoundException e){
            System.out.println("error");
        }
        
        int total=0;
        while(inputStream.hasNextInt()){
            int num =inputStream.nextInt();
            System.out.println(num);
            total+=num;
        }
        
        System.out.println("total :" + total);
       
        inputStream.close();
        
        
        PrintWriter outStream1 = null;
        filename = "total.txt";
        
        try{
            outStream1 = new PrintWriter(new FileOutputStream(filename,false));
        }catch(FileNotFoundException e){
            System.out.println("Error No File Found");
            System.exit(0);
        }
        //do here and
        outStream1.print("Total :" + total);
        
        outStream1.close();
    }
    
}
