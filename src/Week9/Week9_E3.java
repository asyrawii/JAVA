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
public class Week9_E3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String filename = "name1.txt";
        PrintWriter outStream = null;
        
        try{
            outStream = new PrintWriter(new FileOutputStream(filename,true));
        }catch(FileNotFoundException e){
            System.out.println("Error No File Found");
            System.exit(0);
        }
        
        Scanner input = new Scanner(System.in);
        String data;
        
        for(int i=0;i<3;i++){
            System.out.print("Enter a name:");
            //data = ;
            outStream.println(input.nextLine());
        }
        
        
        outStream.close();
    }
    
}
