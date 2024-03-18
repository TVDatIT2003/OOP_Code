/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
public class MyRectangle extends MyBoundedShape{
     private double length, width;

    public MyRectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
    public void setLength(double length)
    {
        this.length = length;
    }
    public double getLength()
    {
        return length;
    }
    public void setWidth(double width)
    {
        this.width = width;
    }
    public double getWidth()
    {
        return width;
    }
    public double GetArea()
    {
        return length * width;
    }
    public void Draw()
    {
        System.out.println("The width of the rectangle is:" + getWidth() +" and the length is:" + getLength());
        System.out.println("Area is: " + GetArea());
    }
}
