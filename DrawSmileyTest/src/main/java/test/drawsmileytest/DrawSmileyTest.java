/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package test.drawsmileytest;

/**
 *
 * @author acer
 */
import javax.swing.JFrame;

public class DrawSmileyTest {

    public static void main(String[] args) {
        DrawSmiley panel = new DrawSmiley();
        JFrame application = new JFrame();
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);//add the panel to the frame
        application.setSize(230, 250);//set the size of the frame
        application.setVisible(true);//make the frame visible
    }
}
