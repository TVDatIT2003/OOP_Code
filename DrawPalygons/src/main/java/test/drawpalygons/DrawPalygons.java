/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package test.drawpalygons;

/**
 *
 * @author acer
 */
import javax.swing.JFrame;

public class DrawPalygons {

    public static void main(String[] args) {
         // create frame for PolygonsJPanel 
         JFrame frame = new JFrame("Drawing Polygons"); 
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
         
        PolygonsJPanel polygonsJPanel = new PolygonsJPanel(); 
        frame.add(polygonsJPanel); 
        frame.setSize(280, 270); 
        frame.setVisible(true); 
    }
}
