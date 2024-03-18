/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package draw.linetest;

/**
 *
 * @author acer
 */
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel{
    public void paintComponent(Graphics g){
        //Display panels
        super.paintComponent(g);
        
        int width = getWidth();
        int height = getHeight();
        int number = 15;
        int space = width/15;
        int gap = height/15;
        int a = width, b = 0;
        
        //Drawing first corner
        for (int i = 1; i < number; i++){
            a -= space;
            b += gap;
            g.drawLine(0,0,a,b);
        }
        //Drawing second corner
        a = 0;
        b = 0;
        for(int i = 1; i < number; i++){
            a += space;
            b += gap;
            g.drawLine(width, 0, a, b);
        }
        //Drawing third corner
        a = 0;
        b = 0;
        for(int i = 1; i < number; i++){
            a += space;
            b += gap;
            g.drawLine(0, height, a, b);
        }
        //Drawing forth corner
        a = width;
        b = 0;
        for(int i = 1; i < number; i++){
            a -= space;
            b += gap;
            g.drawLine(width, height, a, b);
        }
    }
}
