/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.drawsmileytest;

/**
 *
 * @author acer
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawSmiley extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        //Draw the face
        g.setColor(Color.YELLOW);
        g.fillOval(10, 10, 200, 200);
        
        //Draw the eyes
        g.setColor(Color.BLACK);
        g.fillOval(50, 65, 30, 30);
        g.fillOval(135, 65, 30, 30);
        
        //Draw the mouth
        g.fillOval(50, 110, 120, 60);
        
        //"Touch up" the mouth into the smile
        g.setColor(Color.YELLOW);
        g.fillRect(50, 110, 120, 30);
        g.fillOval(50, 120, 120, 40);
    }
}
