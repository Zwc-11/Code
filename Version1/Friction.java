package Version_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Friction extends JPanel {
    private static int WIDTH = 3000;
    private static int HEIGHT = 300;
    private static int BOX_SIZE = 100;
    private static int ACCELERATION = 5;
    private static double MASS = 100;
    private static double Coefficientoffriction = 0.1;
    private static double FRICTION = Coefficientoffriction * MASS * 9.8; // Friction coefficient
    private static double Fa = 0;
    private static double Fnet = Fa - FRICTION; // Assume no external force
    private int x; // Current x-coordinate of the box
    private int y; // Current y-coordinate of the box
    private static double velocity; // Current velocity of the box
    private Timer timer;
    JButton button;
    JFrame frame = new JFrame();
    JTextField accelerationField;
    JTextField massField;
    JTextField frictionField;
    JTextField forceField;
    JLabel frictionLabel;
    JLabel velocityLabel;
    JLabel forceLabel;
    JLabel massLabel;
    JButton submitButton;

    public Friction() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        frame.setVisible(true);
        frame.getContentPane().setLayout(new BorderLayout());

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        controlPanel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        accelerationField = new JTextField(String.valueOf(ACCELERATION), 10);
        massField = new JTextField(String.valueOf(MASS), 10);
        frictionField = new JTextField(String.valueOf(Coefficientoffriction), 10);
        forceField = new JTextField(String.valueOf(Fa), 10);
        submitButton = new JButton("Submit");

        controlPanel.add(new JLabel("Acceleration:"));
        controlPanel.add(accelerationField);
        controlPanel.add(new JLabel("Mass:"));
        controlPanel.add(massField);
        controlPanel.add(new JLabel("Friction:"));
        controlPanel.add(frictionField);
        controlPanel.add(new JLabel("Applied Force:"));
        controlPanel.add(forceField);

        controlPanel.add(submitButton);

        frictionLabel = new JLabel("Friction: " + FRICTION);
        velocityLabel = new JLabel("Velocity: " + velocity);
        forceLabel = new JLabel("Applied Force: " + Fa);
        massLabel = new JLabel("Mass: " + MASS);

        controlPanel.add(frictionLabel);
        controlPanel.add(velocityLabel);
        controlPanel.add(forceLabel);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateParameters();
            }
        });

        JPanel contentPanel = new JPanel(); // Create a content panel to hold components
        contentPanel.setLayout(new BorderLayout()); // Set BorderLayout for the content panel

        x = 0;
        y = (HEIGHT - BOX_SIZE) / 2;
        velocity = ACCELERATION;

        button = new JButton("Click to restart");
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalAlignment(JButton.CENTER);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                restart();
            }
        });
        button.setBounds(50, 100, 95, 30);
        timer = new Timer(1000 / 60, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (x + BOX_SIZE < WIDTH) {
                    x += velocity;
                    // Update acceleration, mass, friction, and applied force values
                    ACCELERATION = Integer.parseInt(accelerationField.getText());
                    Coefficientoffriction = Double.parseDouble(frictionField.getText());
                    MASS = Double.parseDouble(massField.getText());
                    FRICTION = Double.parseDouble(frictionField.getText()) * MASS * 9.8;
                    Fnet = 0 - FRICTION;

                    if (velocity > 0) {
                        velocity += (double) Fnet / MASS / 60;
                    }
                    if (velocity < 0) {
                        velocity -= (double) Fnet / MASS / 60;
                    }

                    frictionLabel.setText("Friction: " + FRICTION);
                    velocityLabel.setText("Velocity: " + velocity);

                    repaint();
                }
            }
        });
        // Add the button to the SOUTH position of the content panel
        contentPanel.add(this, BorderLayout.CENTER); // Add the Friction panel to the CENTER position of the content
                                                     // pane
        this.add(button);
        frame.setSize(1920, 1080);
        JPanel valuePanel = new JPanel();

        valuePanel.setLayout(new BorderLayout());
        valuePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        valuePanel.setPreferredSize(new Dimension(150, 50));
        valuePanel.add(Box.createVerticalGlue(), BorderLayout.NORTH);
        valuePanel.add(frictionLabel, BorderLayout.WEST);
        valuePanel.add(velocityLabel, BorderLayout.SOUTH);
        valuePanel.add(forceLabel, BorderLayout.EAST);

        frame.add(controlPanel, BorderLayout.SOUTH); // Add the control panel to the SOUTH position of the frame
        frame.add(contentPanel, BorderLayout.CENTER);
        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.add(controlPanel, BorderLayout.NORTH); // Add controlPanel to the NORTH position of bottomPanel
        bottomPanel.add(valuePanel, BorderLayout.SOUTH); // Add valuePanel to the SOUTH position of bottomPanel

        frame.add(bottomPanel, BorderLayout.SOUTH); // Add the bottomPanel to the SOUTH position of the frame

        timer.setRepeats(true);
        timer.setCoalesce(true);
        timer.start();
    }

    public void restart() {
        timer.stop();
        x = 0;
        velocity = ACCELERATION;
        repaint();
        timer.start();
    }

    public void updateParameters() {
        try {
            ACCELERATION = Integer.parseInt(accelerationField.getText());
            MASS = Double.parseDouble(massField.getText());
            Coefficientoffriction = Double.parseDouble(frictionField.getText());
            FRICTION = Coefficientoffriction * MASS * 9.8;
            Fa = Double.parseDouble(forceField.getText());
            Fnet = Fa - FRICTION;
            restart();

            // Update label text with new parameter values
            frictionLabel.setText("Friction: " + FRICTION);
            velocityLabel.setText("Velocity: " + velocity);
            forceLabel.setText("Applied Force: " + Fa);
            massLabel.setText("Mass: " + MASS);

            // Update the coefficient of friction, net force, and mass fields
            frictionField.setText(String.valueOf(Coefficientoffriction));
            forceField.setText(String.valueOf(Fa));
            massField.setText(String.valueOf(MASS));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Invalid input! Please enter numeric values.");
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw container
        g.setColor(Color.BLACK);
        g.drawRect(0, 300, getWidth() - 1, getHeight() - 401);

        // Calculate the y-coordinate of the square to be within the container
        int containerHeight = getHeight() - 100;
        y = containerHeight - BOX_SIZE;

        // Draw square
        g.setColor(Color.RED);
        g.fillRect(x, y, BOX_SIZE, BOX_SIZE);

        // Draw ground line
        g.setColor(Color.BLACK);
        g.drawLine(0, getHeight() - y + BOX_SIZE, getWidth() - 1, getHeight() - y + BOX_SIZE);

        int arrowLength = 30;
        int arrowWidth = 10;
        int arrowX = x + BOX_SIZE + 10;
        int arrowY = y + (BOX_SIZE / 2) - (arrowWidth / 2);

        g.setColor(Color.BLACK);
        g.drawLine(arrowX, arrowY + (arrowWidth / 2), arrowX + arrowLength, arrowY + (arrowWidth / 2));
        g.drawLine(arrowX + arrowLength, arrowY + (arrowWidth / 2), arrowX + arrowLength - arrowWidth, arrowY);
        g.drawLine(arrowX + arrowLength, arrowY + (arrowWidth / 2), arrowX + arrowLength - arrowWidth,
                arrowY + arrowWidth);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Friction();
            }
        });
    }
}
