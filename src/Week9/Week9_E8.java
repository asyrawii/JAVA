/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Random;

/**
 *
 * @author pensyarah
 */
public class Week9_E8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
        Random rand = new Random(); 
        /*int num = rand.nextInt(1000);
        System.out.println(num);
       */
        PrintWriter outputStream1 =  new PrintWriter(new FileOutputStream("integer.txt"));
        ObjectOutputStream outputStream =  new ObjectOutputStream(new FileOutputStream("integer.dat"));
        
        for(int i=0;i<10;i++)
        {
            int a= rand.nextInt(10);
            outputStream.writeInt(a);
            outputStream1.print(a+ " ");
        }
          
        
        outputStream.close();
        outputStream1.close();
    }
    
}
