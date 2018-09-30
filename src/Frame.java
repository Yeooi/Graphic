
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Color;

public class Frame extends JFrame {

  public Frame(String TITLE) {
    // Constructs a JFrame with the specified title
    super(TITLE);

    // More settings of the frame
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Sort of importing the required panels into the frame
    setLayout(new BorderLayout());

    // Add your Panels here
    add(new Panel(), BorderLayout.CENTER);
    
    // Pack to compute initial frame with respect to the component's layout
    pack();
    setVisible(true);
  }
}