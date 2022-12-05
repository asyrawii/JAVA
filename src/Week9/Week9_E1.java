/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week9;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author pensyarah
 */
public class Week9_E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PrintWriter outStream = null;
        String filename = "data.txt";
        
        try{
            outStream = new PrintWriter(filename);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error, file not found");
            System.exit(0);
        }
        
        for(int i =0;i<10;i++)
         outStream.println(" hello World XXX " + i );
        
       outStream.close();
    }
    
}
