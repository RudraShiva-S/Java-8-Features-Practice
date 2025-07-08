package LambdaPractice;

import javax.swing.*;

//Using ActionListener with lambda (GUI) example
public class LambdaButton {
    public static void main(String[] args) {

        //creating an object of JButton
        JButton button = new JButton("Click me");

        //Add action listener using Lambda
        button.addActionListener( e -> System.out.println("Button clicked!"));

        //creating a JFrame and adding the button to it (creating object for JFrame)
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);
        frame.setSize(200,300);
        frame.setVisible(true);
    }
}
