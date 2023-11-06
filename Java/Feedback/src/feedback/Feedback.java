/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feedback;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author Benitha
 */
public class Feedback extends JFrame {

    public void init() {
        setTitle("Welcome");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        Feedback myFrame = new Feedback();
        myFrame.init();
    }
    
}
