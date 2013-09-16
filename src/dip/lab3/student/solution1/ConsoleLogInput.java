/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.Scanner;

/**
 *
 * @author schereja
 */
public class ConsoleLogInput implements Input{
    String message = "";

    @Override
    public void inputMessage() {
        Scanner keyboardInput = new Scanner(System.in);
        message = keyboardInput.nextLine();
    }

    @Override
    public String getMessage() {
        return message;
    }
    
}
