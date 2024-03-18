/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
import java.awt.Point;
public class MyTriangle extends MyPoint{
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }
      
    
    
    public String toString(){
        String s = ("MyTriangle [" + v1 + "," + v2 + "," + v3 + "]");
        return s;
    }
    public double getPerimeter()
    {
        double l1 = Math.sqrt(Math.pow(v1.getX() - v2.getX(), 2) + Math.pow(v1.getY() - v2.getY(),2));
        double l2 = Math.sqrt(Math.pow(v2.getX() - v3.getX(), 2) + Math.pow(v2.getY() - v3.getY(), 2));
        double l3 = Math.sqrt(Math.pow(v1.getX() - v3.getX(), 2) + Math.pow(v1.getY() - v3.getY(), 2));
        return l1 + l2 + l3;
    }
    public String getType()
    {
        double l1 = v1.distance(v2);
        double l2 = v2.distance(v3);
        double l3 = v1.distance(v3);

        if (l1 == l2 && l2 == l3)
        {
            return "Equilateral";
        }
        else if(l1 >= (l2 + l3) || l2 >= (l3 + l1) || l3 >= (l1 + l2))
        {
            return "Not Triangle";
        }
        else if (l1 == l2 || l2 == l3 || l1 == l3)
        {
            return "Isosceles";
        }
        else 
        {
            return "Scalene";
        }
    }
}
