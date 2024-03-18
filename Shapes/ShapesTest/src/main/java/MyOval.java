/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
public class MyOval extends MyBoundedShape{
     private double line1;
    private double line2;
    public MyOval(double line1, double line2)
    {
        this.line1 = line1;
        this.line2 = line2;
    }
    public void setLine1(double line1)
    {
        this.line1 = line1;
    }
    public double getLine1()
    {
        return line1;
    }
    public void setLine2(double line2)
    {
        this.line2 = line2;
    }
    public double getLine2()
    {
        return line2;
    }
    public double GetArea()
    {
        return 3.14 * line1 * line2;
    }
    public void Draw()
    {
        System.out.println("The line number 1 of the oval is: " + getLine1() + " and the line number 2 is: " + getLine2());
        System.out.println("Area is: " + GetArea());
    }
}
