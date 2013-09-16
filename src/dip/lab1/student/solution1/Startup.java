package dip.lab1.student.solution1;

import dip.lab1.*;
import java.text.NumberFormat;

/**
 * Just a start and test class for this program. You may modify this class
 * in any way you see fit.
 *
 * @author jlombardo
 */
public class Startup {

    public static void main(String[] args) {
        /*
         * We'll just use this class for testing our ccde.
         * We'll provide input and get some output...
         */

        //Low-level modules
        Employee emp1 = new HourlyEmployee(10.50,2080);
        Employee emp2 = new SalariedEmployee(45000, 1250);
        Employee emp3 = new SalariedEmployee(90000, 0);
        //HourlyEmployee emp1 = new HourlyEmployee(10.50, 2020);
        //SalariedEmployee emp2 = new SalariedEmployee(45000, 1250);
        //SalariedEmployee emp3 = new SalariedEmployee(90000,0);
        Employee[] employees = {emp1,emp2,emp3};
        // High-level module
        HRService hr = new HRService();
        
        //Displays Compensation for each employee
        for(int i=0; i < employees.length; i++) {
            System.out.println("Employee " + (i+1) + " compensation: $" + hr.getAnnualCompensationForEmployee(employees[i]));
        }
        
    }

}
