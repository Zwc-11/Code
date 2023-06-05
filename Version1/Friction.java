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
    private static double FRICTION = 0.1 * MASS * 9.8; // Friction coefficient
    private static double Fa = 0;
    private static double Fnet = Fa - FRICTION; // Assume no external force
    private int x; // Current x-coordinate of the box
    private int y; // Current y-coordinate of the box
    private static double velocity; // Current velocity of the box
    private Timer timer;
    JButton button;
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello");

    public Friction() {
        label.setBounds(0, 0, 1000, 50);
        label.setFont(new Font(null, Font.PLAIN, 25));
        frame.setSize(3000, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        frame.setVisible(true);
        frame.getContentPane().setLayout(new BorderLayout()); // Set BorderLayout for the frame's content pane
        frame.getContentPane().add(label, BorderLayout.NORTH); // Add the label to the NORTH position

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
                    if (velocity > 0) {
                        velocity += (double) Fnet / MASS / 60;
                    }
                    if (velocity < 0) {
                        velocity -= (double) Fnet / MASS / 60;
                    }

                    repaint();
                }
            }
        });
        // Add the button to the SOUTH position of the content panel
        contentPanel.add(this, BorderLayout.CENTER); // Add the Friction panel to the CENTER position of the content
                                                     // pane
        this.add(button);
        frame.add(label, BorderLayout.NORTH); // Add the label to the NORTH position of the frame
        frame.add(contentPanel, BorderLayout.CENTER);
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

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(x, y, BOX_SIZE, BOX_SIZE);

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
