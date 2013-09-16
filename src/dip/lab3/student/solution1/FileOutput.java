/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author schereja
 */
public class FileOutput implements Output{

    @Override
    public void send(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    
}
