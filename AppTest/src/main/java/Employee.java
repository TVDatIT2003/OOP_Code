/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
public class Employee implements Comparable<Employee>{
    private String employeeId;
    private String employeeName;
    private int salaryPerHour;
    private int noOfLeavingDay;
    private int noOfTravelDay;
    
    public String getEmployeeId(){
        return employeeId;
    }
    
    public void setEmployeeId(String employeeId){
        this.employeeId = employeeId;
    }
    
    public String getEmployeeName(){
        return employeeName;
    }
    
    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }
    
    public int getSalaryPerHour(){
        return salaryPerHour;
    }
    
    public void setSalaryPerHour(int salaryPerHour){
        this.salaryPerHour = salaryPerHour;
    }
    
    public int getNoOfLeavingDay(){
        return noOfLeavingDay;
    }
    
    public void setNoOfLeavingDay(int noOfLeavingDay){
        this.noOfLeavingDay = noOfLeavingDay;
    }
    
    public int getNoOfTravelDay(){
        return noOfTravelDay;
    }
    
    public void setNoOfTravelDay(int noOfTravelDay){
        this.noOfTravelDay = noOfTravelDay;
    }
    
    public void Employee(String employeeId,String employeeName, int salaryPerHour, int noOfLeavingDay, int noOfTravelDay){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salaryPerHour = salaryPerHour;
        this.noOfLeavingDay = noOfLeavingDay;
        this.noOfTravelDay = noOfTravelDay;
    }
    
    public int caculateWeekSalary(){
        return getSalaryPerHour() * 8 * (5-getNoOfLeavingDay() + getNoOfTravelDay()/2); 
    }
    
    @Override
    public int compareTo(Employee employee){
        if(employee.getNoOfTravelDay()== this.getNoOfTravelDay()){
            return this.getNoOfLeavingDay() - employee.getNoOfLeavingDay();
        } 
        return this.getNoOfTravelDay() - employee.noOfTravelDay;
    }
    
    @Override
    public String toString(){
        return "[Name: " + getEmployeeName() + " - Salary Per Hour: " + getSalaryPerHour() + " - Weekly Salary: " + caculateWeekSalary() + "]";
    }
}
