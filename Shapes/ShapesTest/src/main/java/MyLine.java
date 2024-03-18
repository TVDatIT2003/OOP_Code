/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
public class MyLine extends MyShape{
    private double line;
    public MyLine(double line)
    {
        this.line = line;
    }
    public void setLine(double line)
    {
        this.line = line;
    }
    public double getLine()
    {
        return line;
    }
    public void Draw()
    {
        System.out.println("Drawing a line " + getLine());
    }
}
