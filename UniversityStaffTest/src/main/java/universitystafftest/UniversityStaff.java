/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universitystafftest;

/**
 *
 * @author acer
 */
public class UniversityStaff {
    private String name;
    private String NATIONAL_ID;
    private double hourlyRate;
    private double totalWorkingHour;
    
    public UniversityStaff(String name, String NATIONAL_ID, double hourlyRate, double totalWorkingHour){
        this.name = name;
        this.NATIONAL_ID = NATIONAL_ID;
        this.hourlyRate = hourlyRate;
        this.totalWorkingHour = totalWorkingHour;
    }
    
    public double earning(){
        return getHourlyRate() * getTotalWorkingHour();
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public double getHourlyRate(){
        return hourlyRate;
    }
    
    public void setHourlyRate(double hourlyRate){
        this.hourlyRate = hourlyRate;
    }
    
    public double getTotalWorkingHour(){
        return totalWorkingHour;
    }
    
    public void setTotalWorkingHour(double totalWorkingHour){
        this.totalWorkingHour = totalWorkingHour;
    }
    
    public String getNationalID(){
        return NATIONAL_ID;
    }
    
    public void setNationalID(String NATIONAL_ID){
        this.NATIONAL_ID = NATIONAL_ID;
    }
    public String toString(){
        return String.format("University Staff: %s\nNational ID: %s\nHourly Rate: %.2f\nTotal Working Hour: %.2f\nEarning: %.2f\n", getName(), getNationalID(), getHourlyRate(), getTotalWorkingHour(), earning());
    }
}
