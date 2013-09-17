/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author schereja
 */
public class MessagingService {
    private MessageInput newInput;
    private MessageOutput newOutput;
    
    public MessagingService(MessageInput newInput, MessageOutput newOutput){
        this.newInput = newInput;
        this.newOutput = newOutput;
    }
    
    public void inputMsg(){
        newInput.inputMessage();
    }
    public void sendMsg(){
        newOutput.send(newInput.getMessage());
    }
}
