/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class TriangleAndPointTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type x and y of v1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        MyPoint v1 = new MyPoint(x1, y1);

        System.out.println("Type x and y of v2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        MyPoint v2 = new MyPoint(x2, y2);

        System.out.println("Type x and y of v3: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        MyPoint v3 = new MyPoint(x3, y3);

        MyTriangle tg = new MyTriangle(v1, v2, v3);
        System.out.println("Triangle perimeter: " + tg.getPerimeter());
        System.out.println("Triangle type: " + tg.getType());
    }
}
