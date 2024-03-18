
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
public class ProjectPrinter implements Runnable{
    private Project project;
    Employee employee;

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
    
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("[ProjectID: "+ project.getProjectId() + " - Project Duration" +project.getStartDate() + "to" + project.getEndDate()+"]" +"[Name: "+ employee.getEmployeeName()+ " - Salary Per Hour: " + employee.getSalaryPerHour());
        } catch (InterruptedException ex) {
            Logger.getLogger(ProjectPrinter.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }    
}
