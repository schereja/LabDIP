/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author schereja
 */
public class ConsoleLogOutput implements MessageOutput{

    @Override
    public void send(String message) {
        System.out.println(message);
    }
    
}
