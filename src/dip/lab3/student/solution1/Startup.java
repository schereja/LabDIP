/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author schereja
 */
public class Startup {
    public static void main(String[] args){
    MessagingService newMsg = new MessagingService(new InputGUI(), new OutputGUI());
   newMsg.inputMsg();
   newMsg.sendMsg();
    }
    
            }
