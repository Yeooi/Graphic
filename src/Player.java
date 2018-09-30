
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.Color;

public class Player{
	
	int posX = 50;
	int posY = 50;
	int size = 20;
	int movement = 10;

	public Player()
	{

	}
	
	public void update()
	{
		posX = posX + movement;
	}

	
	public void draw(Graphics2D g) {
		
		g.setColor(Color.RED);
	    g.fillRect(posX, posY, size, size);
		
		update();
	}
}
