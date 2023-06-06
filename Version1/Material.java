package Version_1;

import javax.swing.*;
import java.awt.*;

public class Material {
    JFrame frame = new JFrame();

    JLabel label = new JLabel();
    JLabel box1Text = new JLabel();
    JLabel box1SmallText = new JLabel();
    JLabel box1Diagram = new JLabel();
    JLabel box1FBDiagram = new JLabel();
    JLabel box2Text = new JLabel();
    JLabel box2SmallText = new JLabel();
    JLabel box2Diagram = new JLabel();
    JLabel box2FBDiagram = new JLabel();
    JLabel box3Text = new JLabel();
    JLabel box3SmallText = new JLabel();
    JLabel box3Diagram = new JLabel();
    JLabel box3FBDiagram = new JLabel();

    JPanel Bigbox = new JPanel(new GridBagLayout());
    JPanel row1 = new JPanel();
    JPanel row2 = new JPanel();
    JPanel row3 = new JPanel();
    JPanel box1 = new JPanel();
    JPanel box2 = new JPanel();
    JPanel box3 = new JPanel();
    JPanel boxD1 = new JPanel();
    JPanel boxD2 = new JPanel();
    JPanel boxD3 = new JPanel();

    JButton myButton = new JButton("Resources");
    JButton myButton2 = new JButton("Practice");
    JButton myButton3 = new JButton("Quiz");

    Material() {
        // Bigbox
        Bigbox.setBackground(Color.BLACK);
        Bigbox.setBorder(BorderFactory.createEmptyBorder(0, 100, 0, 100));

        // text
        label.setText("Friction");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Helvetica Neue", Font.PLAIN, 80));
        label.setBackground(Color.BLACK);
        label.setBorder(BorderFactory.createEmptyBorder(10, 50, 0, 10));
        label.setOpaque(true);

        // Row boxes
        row1.setBackground(Color.BLACK);
        row2.setBackground(Color.BLACK);
        row3.setBackground(Color.BLACK);

        // box1 and boxD1
        box1.setPreferredSize(new Dimension(800, 250));
        box1.setBackground(Color.BLACK);
        box1.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
        box1.setLayout(new BorderLayout());

        boxD1.setPreferredSize(new Dimension(600, 250));
        boxD1.setBackground(Color.BLACK);
        boxD1.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
        boxD1.setLayout(new BorderLayout());

        // box2 and boxD2
        box2.setPreferredSize(new Dimension(800, 250));
        box2.setBackground(Color.BLACK);
        box2.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
        box2.setLayout(new BorderLayout());

        boxD2.setPreferredSize(new Dimension(600, 250));
        boxD2.setBackground(Color.BLACK);
        boxD2.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
        boxD2.setLayout(new BorderLayout());

        // box3 and boxD3
        box3.setPreferredSize(new Dimension(800, 250));
        box3.setBackground(Color.BLACK);
        box3.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
        box3.setLayout(new BorderLayout());

        boxD3.setPreferredSize(new Dimension(600, 250));
        boxD3.setBackground(Color.BLACK);
        boxD3.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
        boxD3.setLayout(new BorderLayout());

        // Text for box1
        box1Text.setText("<html><body style='width: 200px'>Static Friction (Fs)</body></html>");
        box1Text.setForeground(Color.WHITE);
        box1Text.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        box1Text.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
        box1Text.setOpaque(true);
        box1Text.setBackground(Color.BLACK);
        box1.add(box1Text, BorderLayout.NORTH);

        // Text for box1SmallText
        box1SmallText.setText("<html><body style='width: 400px'>"
                + "<p style='padding-left: 50px'> -    Force exerted by a surface on a stationary object.</p>"
                + "<p style='padding-left: 50px'> -    Prevents the object from beginning to move.</p>"
                + "<p style='padding-left: 50px'> -    Increases as applied force increases.</p>"
                + "<p style='padding-left: 50px'> -    Acts in the opposite direction as attempted motion.</p>"
                + "<p style='padding-left: 50px'> -    Object experiences no motion (as static friction force equals applied force so they cancel each other out).</p>"
                + "<p style='padding-left: 50px'> -    Occurs when the applied force is less than or equal to the starting friction / maximum static friction.</p>"
                + "</body></html>");

        box1SmallText.setForeground(Color.WHITE);
        box1SmallText.setFont(new Font("Helvetica Neue", Font.PLAIN, 18));
        box1SmallText.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
        box1SmallText.setOpaque(true);
        box1SmallText.setBackground(Color.BLACK);
        box1.add(box1SmallText, BorderLayout.CENTER);

        // Text for box2
        box2Text.setText("<html><body style='width: 200px'>Box 2</body></html>");
        box2Text.setForeground(Color.WHITE);
        box2Text.setFont(new Font("Helvetica Neue", Font.PLAIN, 14));
        box2Text.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
        box2Text.setOpaque(true);
        box2Text.setBackground(Color.BLACK);
        box2.add(box2Text, BorderLayout.CENTER);

        box2SmallText.setText("<html><body style='width: 400px'>"
                + "<p style='padding-left: 50px'> -    Force exerted by a surface on a moving object</p>"
                + "<p style='padding-left: 50px'> -    Constant (as long as surfaces don't change), regardless of applied force</p>"
                + "<p style='padding-left: 50px'> -    Acts in the opposite direction of the motion</p>"
                + "<p style='padding-left: 50px'> -    Occurs when the applied force is greater than the starting friction / maximum static friction</p>"
                + "</body></html>");

        box2SmallText.setForeground(Color.WHITE);
        box2SmallText.setFont(new Font("Helvetica Neue", Font.PLAIN, 18));
        box2SmallText.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
        box2SmallText.setOpaque(true);
        box2SmallText.setBackground(Color.BLACK);
        box2.add(box2SmallText, BorderLayout.CENTER);

        // Text for box3
        box3Text.setText("<html><body style='width: 200px'>Box 3</body></html>");
        box3Text.setForeground(Color.WHITE);
        box3Text.setFont(new Font("Helvetica Neue", Font.PLAIN, 14));
        box3Text.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
        box3Text.setOpaque(true);
        box3Text.setBackground(Color.BLACK);
        box3.add(box3Text, BorderLayout.CENTER);

        box3SmallText.setText("<html><body style='width: 400px'>"
                + "<p style='padding-left: 50px'> -    Experientially determined constant</p>"
                + "<p style='padding-left: 50px'> -    Depends on the nature of the two contacting surfaces</p>"
                + "<p style='padding-left: 50px'> -    Affects the amount of friction an object experiences</p>"
                + "<p style='padding-left: 50px'> -    Two types: coefficient of static friction (μs) and coefficient of kinetic friction (μk)</p>"
                + "</body></html>");

        box3SmallText.setForeground(Color.WHITE);
        box3SmallText.setFont(new Font("Helvetica Neue", Font.PLAIN, 18));
        box3SmallText.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
        box3SmallText.setOpaque(true);
        box3SmallText.setBackground(Color.BLACK);
        box3.add(box3SmallText, BorderLayout.CENTER);

        // Image for boxD1
        ImageIcon imageIcon1 = new ImageIcon("cs_Culminating/Version_1/Static_Friction.png"); 
        
        Image image1 = imageIcon1.getImage().getScaledInstance(600, 250, Image.SCALE_SMOOTH);
        box1Diagram.setIcon(new ImageIcon(image1));
        boxD1.add(box1Diagram);
        // Image for boxD2
        ImageIcon imageIcon2 = new ImageIcon("cs_Culminating/Version_1/Kinetic_Friction.png"); 
        Image image2 = imageIcon2.getImage().getScaledInstance(600, 250, Image.SCALE_SMOOTH);
        box2Diagram.setIcon(new ImageIcon(image2));
        boxD2.add(box2Diagram);

        // Image for boxD3
        ImageIcon imageIcon3 = new ImageIcon("cs_Culminating/Version_1/Coefficient_of_friction.png"); 
        Image image3 = imageIcon3.getImage().getScaledInstance(600, 250, Image.SCALE_SMOOTH);
        box3Diagram.setIcon(new ImageIcon(image3));
        boxD3.add(box3Diagram);

        // Set up GridBagConstraints
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(0, 0, 25, 0);

        // Add components to row 1
        row1.add(box1);
        row1.add(Box.createHorizontalStrut(100)); // Add horizontal gap between box1 and boxD1
        row1.add(boxD1);
        Bigbox.add(row1, gbc);

        // Add components to row 2
        gbc.gridy = 1;
        gbc.insets = new Insets(0, 0, 25, 0);
        row2.add(box2);
        row2.add(Box.createHorizontalStrut(100)); // Add horizontal gap between box2 and boxD2
        row2.add(boxD2);
        Bigbox.add(row2, gbc);

        // Add components to row 3
        gbc.gridy = 2;
        gbc.insets = new Insets(0, 0, 25, 0);
        row3.add(box3);
        row3.add(Box.createHorizontalStrut(100)); // Add horizontal gap between box3 and boxD3
        row3.add(boxD3);
        Bigbox.add(row3, gbc);

        // frame
        frame.setSize(1800, 1200);
        frame.setMinimumSize(new Dimension(1800, 1200));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setVisible(true);
        frame.add(Bigbox, BorderLayout.CENTER);
        frame.add(label, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        new Material();
    }
}
