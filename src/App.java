

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.EventQueue;
public class App {
  // Constants, all caps for naming convention
  public static final String TITLE = "App";

  public static void main(String[] args) {
    // Creates a swing app on start 
    EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        try {
          UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
          ex.printStackTrace();
        }
        new Frame(TITLE);
      }
    });
  }
}