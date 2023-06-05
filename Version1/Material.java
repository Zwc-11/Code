package Version_1;

import javax.swing.*;
import java.awt.*;

public class Material {
    JFrame frame = new JFrame();
    JFrame frame2 = new JFrame();

    JLabel label = new JLabel();
    JLabel box1Text = new JLabel();
    JLabel box1Diagram = new JLabel();
    JLabel box1FBDiagram = new JLabel();
    JLabel box2Text = new JLabel();
    JLabel box2Diagram = new JLabel();
    JLabel box2FBDiagram = new JLabel();
    JLabel box3Text = new JLabel();
    JLabel box3Diagram = new JLabel();
    JLabel box3FBDiagram = new JLabel();

    JPanel box1 = new JPanel();
    JPanel box2 = new JPanel();
    JPanel box3 = new JPanel();
    JPanel boxD1 = new JPanel();
    JPanel boxD2 = new JPanel();
    JPanel boxD3 = new JPanel();

    JButton myButton = new JButton("Resources");
    JButton myButton2 = new JButton("Pratice");
    JButton myButton3 = new JButton("Quiz");

    Material() {
        // text
        label.setText("Friction");
        label.setForeground(Color.white);
        label.setFont(new Font("Helvetica Neue", Font.PLAIN, 80));
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setBounds(0, 0, 200, 500);
        label.setBounds(10, 10, label.getPreferredSize().width, label.getPreferredSize().height);
        // button
        // myButton.setBounds(100, 750, 200, 40);
        // myButton.setFocusable(false);
        // myButton2.setBounds(400, 750, 200, 40);
        // myButton2.setFocusable(false);
        // myButton3.setBounds(700, 750, 200, 40);
        // myButton3.setFocusable(false);
        // Border

        // Free body diagram
        // box1FBDiagram.setIcon(new ImageIcon("free_body_diagram.png")); // Replace
        // "free_body_diagram.png" with the actual image file path
        // box1FBDiagram.setBounds(220, 10, 200, 330);
        // box1.add(box1FBDiagram);

        box1.setBackground(Color.black);
        box1.setBounds(30, 150, 1000, 350);
        box1.setBorder(BorderFactory.createLineBorder(Color.white));
        box1Text.setText("Static Friction");
        box1Text.setForeground(Color.white);
        box1Text.setBackground(Color.black);
        box1Text.setFont(new Font("Helvetica Neue", Font.PLAIN, 30));
        box1Text.setOpaque(true);
        box1.setLayout(new FlowLayout(FlowLayout.LEFT));
        box1.add(box1Text);
        box1.setVisible(true);

        box2.setBackground(Color.black);
        box2.setBounds(30, 550, 1000, 350);
        box2.setBorder(BorderFactory.createLineBorder(Color.white));
        box2Text.setText("Kinetic Friction");
        box2Text.setBackground(Color.black);
        box2Text.setForeground(Color.white);
        box2Text.setFont(new Font("Helvetica Neue", Font.PLAIN, 30));
        box2Text.setOpaque(true);
        box2.setLayout(new FlowLayout(FlowLayout.LEFT));
        box2.add(box2Text);
        box2.setVisible(true);

        box3.setBackground(Color.black);
        box3.setBounds(30, 950, 1000, 350);
        box3.setBorder(BorderFactory.createLineBorder(Color.white));
        box3Text.setText("Coefficient Friction");
        box3Text.setBackground(Color.black);
        box3Text.setForeground(Color.white);
        box3Text.setFont(new Font("Helvetica Neue", Font.PLAIN, 30));
        box3Text.setOpaque(true);
        box3.setLayout(new FlowLayout(FlowLayout.LEFT));
        box3.add(box3Text);
        box3.setVisible(true);

        // boxD
        boxD1.setBounds(1500, 150, 600, 350);
        boxD1.setBorder(BorderFactory.createLineBorder(Color.white));
        boxD1.setLayout(new FlowLayout(FlowLayout.LEFT));
        boxD1.setVisible(true);
        box1Diagram.setIcon(new ImageIcon("cs_Culminating/Version_1/Static_Friction.png"));
        boxD1.add(box1Diagram);

        boxD2.setBounds(1500, 550, 600, 350);
        boxD2.setBorder(BorderFactory.createLineBorder(Color.white));
        boxD2.setLayout(new FlowLayout(FlowLayout.LEFT));
        boxD2.setVisible(true);
        box2Diagram.setIcon(new ImageIcon("cs_Culminating/Version_1/Kinetic_Friction.png"));
        boxD2.add(box2Diagram);

        boxD3.setBounds(1460, 950, 680, 350);
        boxD3.setBorder(BorderFactory.createLineBorder(Color.white));
        boxD3.setLayout(new FlowLayout(FlowLayout.LEFT));
        boxD3.setVisible(true);
        box3Diagram.setIcon(new ImageIcon("cs_Culminating/Version_1/Coefficient_of_friction.png"));
        boxD3.add(box3Diagram);
        // frame
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setVisible(true);
        // frame.add(myButton);
        // frame.add(myButton2);
        // frame.add(myButton3);
        frame.add(label);
        frame.add(box1);
        frame.add(box2);
        frame.add(box3);
        frame.add(boxD1);
        frame.add(boxD2);
        frame.add(boxD3);

    }

    public static void main(String[] args) {
        new Material();
    }

}
