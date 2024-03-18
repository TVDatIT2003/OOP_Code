/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universitystafftest;

/**
 *
 * @author acer
 */
public class Lecturer extends UniversityStaff{
    private double baseSalary;

    public Lecturer(String name, String NATIONAL_ID, double hourlyRate, double totalWorkingHour, double baseSalary) {
        super(name, NATIONAL_ID, hourlyRate, totalWorkingHour);
        this.baseSalary = baseSalary;
    }
    
    public double getBaseSalary(){
        return baseSalary;
    }
    
    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }
    
    public double earning(){
        return getBaseSalary() + (getHourlyRate() * getTotalWorkingHour());
    }
    
     public String toString(){
        return String.format("University Staff: %s\nNational ID: %s\nHourly Rate: %.2f\nTotal Working Hour: %.2f\nEarning: %.2f\nBase Salary: %.2f\n", getName(), getNationalID(), getHourlyRate(), getTotalWorkingHour(), earning(), getBaseSalary());
    }
}
