

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Panel extends JPanel {

  public Panel() {
    // Set the dimensions of the panel
    setLayout(new GridLayout(1, 1));
    setPreferredSize(new Dimension(600, 600));
    setBackground(new Color(99, 98, 98));

    // Timer to repaint every 60ms (this allows the object to move)
    Timer timer = new Timer(60, new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        repaint();
      }
    });
    timer.start();
  }

  // Paint component will paint the specified components in the panel
  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    // Draw
    Player p = new Player();
    Graphics2D g2 = (Graphics2D) g;
    p.draw(g2);
  }
}