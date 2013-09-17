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
public class FileOutput implements MessageOutput{

    @Override
    public void send(String message) {
        //This could technically allow a user to output to a file, but unknown how to do that.
        JOptionPane.showMessageDialog(null, message);
    }

    
}
