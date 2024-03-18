/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class ShapesTest {

    public static void main(String[] args) { 
    {
        Scanner sc = new Scanner(System.in);
        MyShape[] shapes1 = new MyShape[5];

        for (int i = 0; i < 5; i++) 
        {
            System.out.println("Select 5 shapes: ");
            System.out.println("1. Line");
            System.out.println("2. Rectangle");
            System.out.println("3. Oval");

            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                System.out.println("Type line: ");
                double line = sc.nextDouble();
                shapes1[i] = new MyLine(line);
                break;

                case 2:
                System.out.println("Type length: ");
                double length = sc.nextDouble();
                System.out.println("Type width: ");
                double width = sc.nextDouble();
                shapes1[i] = new MyRectangle(length, width);
                break;

                case 3:
                System.out.println("Type line1: ");
                double line1 = sc.nextDouble();
                System.out.println("Type line2: ");
                double line2 = sc.nextDouble();
                shapes1[i] = new MyOval(line1, line2);
                break;

                default:
                System.out.println("Invalid choice");
                i--;
                break;
            }
        }

        for (MyShape shape : shapes1) 
        {
            shape.Draw();
            if(shape instanceof MyBoundedShape)
            {
                System.out.println("Area is: " + ((MyBoundedShape) shape).getArea());
            }
        }
        sc.close();
        }
    }
}
