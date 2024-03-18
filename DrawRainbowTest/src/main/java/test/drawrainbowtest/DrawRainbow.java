/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.drawrainbowtest;

/**
 *
 * @author acer
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawRainbow extends JPanel{
    private static final Color VIOLET = new Color(128, 0, 128);
    private static final Color INDIGO = new Color(75, 0, 130);
    
    private Color[] colors = {
        Color.WHITE, Color.WHITE, VIOLET, INDIGO, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED};
    
    //Constructor
    public DrawRainbow(){
        setBackground(Color.WHITE);
    }
    
    //Draws a rainbow
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        int radius = 20;
        
        int centerX = getWidth()/2;
        int centerY = getHeight() - 10;
        
        //Draw filled arcs
        for (int counter = colors.length; counter > 0; counter--) {
            g.setColor(colors[counter - 1]);
            
            g.fillArc(centerX - counter*radius, centerY - counter*radius, counter * radius * 2, counter * radius * 2, 0, 180);
        }
    }
}
