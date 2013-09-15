package dip.lab1.student.solution1;

import dip.lab1.*;

/**
 * An implementation sub-class of an Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class HourlyEmployee implements Employee {
    private double hourlyRate;
    private double totalHrsForYear;
    private String HOURLY_RATE_ERROR = "Please enter a hourly rate above 0.";
    private String TOTAL_HRS_ERROR = "Please enter an amount of hours greater then 0";
    /** default constructor. Is this the best way to go? */
    public HourlyEmployee() {}

    /**
     * Convenience constructor. Is this the best way to go?
     * @param hourlyRate - the rate per hour that the employee is paid
     * @param totalHrsForYear - total hours worked or predicted per year
     */
    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        setHourlyRate(hourlyRate);
        setTotalHrsForYear(totalHrsForYear);
    }
     @Override
    public double getWages(){
        return totalHrsForYear * hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if(hourlyRate <= 0){
            System.out.println(HOURLY_RATE_ERROR);
        } else this.hourlyRate = hourlyRate;
    }

    public double getTotalHrsForYear() {
        return totalHrsForYear;
    }

    public void setTotalHrsForYear(double totalHrsForYear) {
        if (totalHrsForYear <= 0){
            System.out.println(TOTAL_HRS_ERROR);
        } else this.totalHrsForYear = totalHrsForYear;
    }
     
}
