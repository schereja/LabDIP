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
public class InputGUI implements MessageInput{
    private String msg = "";
    private String INPUT_DIALOG = "Enter message to send out:";
   

    @Override
    public void inputMessage() {
       msg = JOptionPane.showInputDialog(INPUT_DIALOG);
    }

    @Override
    public String getMessage() {
        return msg;
    }
}
