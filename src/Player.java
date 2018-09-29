import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Player extends JPanel implements ActionListener{
	
	Timer t = new Timer(5,this);
	
	int posX = 50;
	int posY = 50;
	int size = 20;
	int movement = 2;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		this.setBackground(Color.WHITE);
		
		g.setColor(Color.RED);
	    g.fillRect(this.posX, this.posY, size, size);
	    
	    t.start();
	}
	
	public void update()
	{
		this.posX += movement;
	}

	public void actionPerformed(ActionEvent e) {
		update();
		repaint();
	}
}
