/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.*;

public class Project {
    private String projectId;
    private Date startDate;
    private Date endDate;
    ArrayList<Employee> listOfEmployee = new ArrayList<Employee>();
    
    public void Project(String projectId, Date startDate, Date endDate){
        this.projectId = projectId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
    //find number of time for startDate to endDate
     public int numberOfTime(){
        long start = getStartDate().getTime();
        long end = getEndDate().getTime();
        long tmp = Math.abs(start-end);
        return (int) (tmp/(24*60*60*1000));
     }
         
    public int estimateBudget(Employee employee){
        return employee.getSalaryPerHour()*8 *numberOfTime();
    }
    
    @Override
    public String toString(){
        Collections.sort(listOfEmployee);
        return listOfEmployee.toString();
    }
}
