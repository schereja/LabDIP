/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author schereja
 */
public class FileInput implements Input{

    @Override
    public void inputMessage() {
        Scanner scan = new Scanner(README.txt);
    }

    @Override
    public String getMessage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
