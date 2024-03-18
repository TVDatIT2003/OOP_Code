/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

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
        
        //draw line from upper-left --> lower-right
        g.drawLine(0, 0, width, height);
        
        //draw line from lower-left --> upper-right
        g.drawLine(0, height, width, 0);
    }
}
