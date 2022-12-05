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
public class Week9_E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String filename = "data.txt";
        Scanner inputStream = null;
        
        try{
            inputStream = new Scanner(new File(filename));
        }
        catch(FileNotFoundException e){
            System.out.println("error");
        }
        
        while(inputStream.hasNextLine()){
            System.out.println(inputStream.nextLine());
        }
    }
    
}
