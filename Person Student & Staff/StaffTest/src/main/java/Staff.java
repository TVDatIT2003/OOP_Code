/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
public class Staff extends Person {
    private String school;
    private double pay;
    
    public Staff(String name, String address, String school, double pay){
    super(name, address);
    this.school = school;
    this.pay = pay;
    }
    
    public String getSchool(){
        return school;
    }
    
    public void setSchool(String school){
        this.school =school; 
    }
    
    public double getPay(){
        return pay;
    }
    
    public void setPay(double pay){
        this.pay = pay;
    }
    
    public String toString(){
        return String.format("Staff[Person[name = %s, address = %s], school = %s, pay = %f]", getName(), getAddress(), getSchool(), getPay());
    }
}
