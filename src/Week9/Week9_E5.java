/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author pensyarah
 */
public class Week9_E5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String filename = "faculty.txt";
        Scanner inputStream = null;
        
        try{
            inputStream = new Scanner(new File(filename));
        }
        catch(FileNotFoundException e){
            System.out.println("error");
        }
        
        String [][] data = new String [5][3];
        String input;
        int i=0;
        
        while(inputStream.hasNextLine()){
            input = inputStream.nextLine();
           // System.out.println(input);
            data[i++] = input.split(",");
        }
        
        for(i=0;i<5;i++){
        System.out.println("Name :" + data[i][0]);
        System.out.println("Age :" + data[i][1]);
        System.out.println("Matrix : " + data[i][2]);
        }
    }
    
}
