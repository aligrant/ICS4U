/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessandra
 */
import javax.swing.*;
import java.awt.*;
public class srcCalc{
    public static void main(String args[]) {
        //Creating the Frame
        JFrame frame = new JFrame("2D Displacement Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new GridLayout(3, 3));
        frame.setVisible(true);

        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Enter Text");
        JTextField tf = new JTextField(10); // accepts upto 10 characters
        JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");
        panel.add(label); // Components Added using Flow Layout
        panel.add(tf);
        panel.add(send);
        panel.add(reset);
//displacement one
        JPanel d1 = new JPanel();
        JTextField d1t = new JTextField(10);
        d1t.setBounds(50,100,200,30);
        JLabel d1l=new JLabel("Displacement One");
        d1.add(d1l);
        d1.add(d1t);
//displacement two
        JPanel d2 = new JPanel();
        JTextField d2t = new JTextField(10);
        d1t.setBounds(50,100,200,30);
        JLabel d2l=new JLabel("Displacement Two");
        d2.add(d2l);
        d2.add(d2t);
        
        
        //Adding Components to the frame.
        frame.getContentPane().add(d1);
        frame.getContentPane().add(d2);
        frame.getContentPane().add(panel);
        
        frame.setVisible(true);
    }
}

