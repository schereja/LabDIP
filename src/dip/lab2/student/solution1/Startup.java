/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author schereja
 */
public class Startup {
   public static void main(String[] args){
       TipCalculator foodTip = new FoodServiceTipCalculator(TipCalculator.ServiceQuality.GOOD, 50);
       TipCalculator baggageTip = new BaggageServiceTipCalculator(TipCalculator.ServiceQuality.GOOD, 5);
      
   }
    
}
