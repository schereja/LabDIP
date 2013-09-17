/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.awt.event.ActionEvent;
import java.util.Scanner;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author schereja
 */
public class FileInput implements MessageInput{
    private String msg = "";
    //Setup as a static file right now to just do testing
    //private String TEXT_FILE = "/Users/schereja/Dropbox/dreamweaver.txt";
    private String fileName;
    @Override
    public void inputMessage() {
        final JFileChooser fc = new JFileChooser();
        //brings up open dialog, need to figure out to get that location to open
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnVal = fc.showOpenDialog(fc);
        //Gets absolute Path
        fileName = fc.getSelectedFile().getAbsolutePath();
        
          java.io.File file = new java.io.File(fileName);
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
