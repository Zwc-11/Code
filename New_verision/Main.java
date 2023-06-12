package Version_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

// public class Main {
//     public static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//     public static int screenHeight = (int) screenSize.getHeight();
//     public static int screenWidth = (int) screenSize.getWidth();

//     public static void main(String[] args) {

//         // JFrame frame = new JFrame("Square Simulation");
//         // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         // // frame.getContentPane().add(new Friction());
//         // frame.pack();
//         // frame.setLocationRelativeTo(null);
//         // frame.setVisible(true);
//         System.out.println("Screen size: " + screenHeight + " " + screenWidth);
//         new Homepage();
//         Homepage homepage = new Homepage();
//     }
// }

public class Main {
    public static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public static int screenHeight = (int) screenSize.getHeight();
    public static int screenWidth = (int) screenSize.getWidth();
    // Color 1 is light gray (panels)
    public static Color color1 = new Color(0xD4D9D8);
    // Color 2 is light blue (buttons)
    public static Color color2 = new Color(0x93EFF1);
    // Color 3 is dark blue (buttons on hover)
    public static Color color3 = new Color(0x3077D9);
    // Color 4 is black (frame)
    public static Color color4 = new Color(0x0F0F0F);

    public static void main(String[] args) {
        System.out.println("Screen size: " + screenHeight + " " + screenWidth);
        new Homepage();
    }
}
