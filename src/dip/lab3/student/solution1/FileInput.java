/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.Scanner;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author schereja
 */
public class FileInput implements MessageInput{
    private String msg = "";
    //Setup as a static file right now to just do testing
    private String TEXT_FILE = "/Users/schereja/Dropbox/dreamweaver.txt";
  
    @Override
    public void inputMessage() {
          java.io.File file = new java.io.File(TEXT_FILE);
        Scanner scan = null;
        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileInput.class.getName()).log(Level.SEVERE, null, ex);
        }
        while(scan.hasNext()){
            msg += scan.nextLine() + "\n";
        }
    }

    @Override
    public String getMessage() {
        return msg;
    }
    
}
