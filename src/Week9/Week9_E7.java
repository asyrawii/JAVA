/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week9;

import java.io.File;

/**
 *
 * @author pensyarah
 */
public class Week9_E7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String filename = "total.txt";

        File fileObject = new File(filename);

        if (fileObject.exists()) {
            System.out.println(fileObject.length());
            System.out.println(fileObject.getPath());
            System.out.println(fileObject.lastModified());
        }
    }
    
}
