package Work;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MyWindow {
    public static void main(String[] args) {


        //window: object JFrame
        JFrame frame = new JFrame("My Window");
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());


        //create button and add jframe to it
        JButton button = new JButton("Click Me");

        button.addActionListener((ActionEvent e) -> {
            System.out.println("Click Button");
            JOptionPane.showMessageDialog(null,"Button clicked");
        });

        button.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });

//                (new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Button clicked! Hello, World! :) ^^");
//                JOptionPane.showMessageDialog(null,"Button clicked! Hello, World! :) ^^");
//            }
//        });
        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
