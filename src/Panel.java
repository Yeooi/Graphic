
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Panel extends JPanel implements KeyListener,FocusListener, MouseListener {

   
  LinePiece p;
  //SquarePiece p;
  Graphics2D g2;
  Grid grid;
  CollideMgr collideMgr;

  public Panel() {
    // Set the dimensions of the panel
    setLayout(new GridLayout(1, 1));
    setPreferredSize(new Dimension(500, 1000));
    setBackground(new Color(99, 98, 98));

    addKeyListener(this);     // Set up event listening.
    addFocusListener(this);
    addMouseListener(this);

    p = new LinePiece(50, 0);
    grid = new Grid(500,1000,50);
    collideMgr = new CollideMgr(grid,p);
    //p = new SquarePiece(0,0);
   

    // Timer to repaint every 60ms (this allows the object to move)
    Timer timer = new Timer(60, new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent event) {
        p.update60();
        repaint();
        if(collideMgr.isCollide())
        {
          newPiece();
        }
      }
      
    });

    Timer timer2 = new Timer(1000, new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent event) {
        p.update1000();
        repaint();
        if(collideMgr.isCollide())
        {
          newPiece();
        }
      }
    });

    timer.start();
    timer2.start();
  }

  public void newPiece()
  {
      this.p = new LinePiece(50, 0);
      collideMgr.setPiece(p);
  }

  @Override
  public void keyPressed(KeyEvent evt)
  {
    int key = evt.getKeyCode();  // get keyboard code for the pressed key
    
    if (evt.getKeyCode() == KeyEvent.VK_DOWN) {  
      p.pos1Y += p.movement;
    }
    if (evt.getKeyCode() == KeyEvent.VK_LEFT) {  
      p.pos1X -= p.movement;
    }
    if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {  
      p.pos1X += p.movement;
    }
    if (evt.getKeyCode() == KeyEvent.VK_SPACE)
    {
      p.rotate();
    }
  }

  @Override
  public void keyReleased(KeyEvent evt) {
    int key = evt.getKeyCode();
  }

  @Override
  public void keyTyped(KeyEvent evt) {
    int key = evt.getKeyCode();
  }

  @Override
  public void focusGained(FocusEvent evt) {
    repaint();  // redraw with cyan border
  }

  @Override
  public void focusLost(FocusEvent evt) {
    repaint();  // redraw without cyan border
  }

  @Override
  public void mousePressed(MouseEvent evt) {
    requestFocus();
  }

  @Override
  public void mouseExited(MouseEvent e) {
    
  }

  @Override
  public void mouseEntered(MouseEvent e) {
    
  }

  @Override
  public void mouseReleased(MouseEvent e) {
    
  }

  @Override
  public void mouseClicked(MouseEvent e) {
    
  }

  // Paint component will paint the specified components in the panel
  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g2 = (Graphics2D) g;
    p.draw(g2);
    grid.draw(g2);
  }
}