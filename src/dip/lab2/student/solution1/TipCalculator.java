/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author schereja
 */
public interface TipCalculator {
     public enum ServiceQuality{
         GOOD,FAIR,POOR
     }
     public abstract double getTip();
     public ServiceQuality getServiceQuality();

}
