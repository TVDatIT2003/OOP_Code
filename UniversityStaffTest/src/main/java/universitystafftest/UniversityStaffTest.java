/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package universitystafftest;

/**
 *
 * @author acer
 */
public class UniversityStaffTest {

    public static void main(String[] args) {
        UniversityStaff staff = new UniversityStaff("Khanh", "C12345", 10, 80);
        
        System.out.println("Staff information obtained by get methods:");
        System.out.printf("%s %s \n", "First name is", staff.getName());
        System.out.printf("%s %s \n", "Social security number is", staff.getNationalID());
        System.out.printf("%s %.2f \n", "Hourly Rate is", staff.getHourlyRate());
        System.out.printf("%s %.2f \n", "Total Working Hour is", staff.getTotalWorkingHour());
        
        staff.setHourlyRate(15);
        System.out.printf("\n%s: \n%s", "Update staff information obtained by toString", staff);
        
        Lecturer tom = new Lecturer("Tom", "C43252", 25, 160, 150);
        
        System.out.println("\n\nLecturer information obtained by get methods:");
        System.out.printf("%s %s \n", "First name is", tom.getName());
        System.out.printf("%s %s \n", "Social security number is", tom.getNationalID());
        System.out.printf("%s %.2f \n", "Hourly Rate is", tom.getHourlyRate());
        System.out.printf("%s %.2f \n", "Total Working Hour is", tom.getTotalWorkingHour());
        System.out.printf("%s %.2f \n", "Earning:", tom.earning());
        
        tom.setBaseSalary(15);
        System.out.printf("\n%s: \n%s", "Update lecturer information obtained by toString", tom);
    }
}
