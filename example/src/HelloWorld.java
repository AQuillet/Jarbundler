
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class HelloWorld {

	public static void main(String[] args) {
		JFrame frame = new JFrame("JarBuilder Test Application");

		JLabel label = new JLabel("Hello, World!", SwingConstants.CENTER);
		frame.getContentPane().add(label, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        placeWindow(frame, 400, 300);
		frame.setVisible(true);
	}

    public static void placeWindow(Window window, int width, int height) {

        // New size for this window
        Dimension windowSize = new Dimension(width, height);
        window.setSize(windowSize);
        
        // Place in the 'dialog' position, centered aligned 1/3 from top
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        Point windowLocation = new Point(0, 0);
        windowLocation.x = (screenSize.width - windowSize.width) / 2;
        windowLocation.y = (screenSize.height / 3) - (windowSize.height / 2);

        // Set final size and location
        window.setLocation(windowLocation);
    }
	
}