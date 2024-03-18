/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package draw.linetest;

import javax.swing.JFrame;

/**
 *
 * @author acer
 */
public class LineTest {

    public static void main(String[] args) {
        DrawPanel panel = new DrawPanel();
        
        //Create new frame
        JFrame application = new JFrame();
        
        //Set the frame to exit when it is clsosed
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);//add the panel to the frame
        application.setSize(300, 300);//set the size of the frame
        application.setVisible(true);//make the frame visible
    }
}
