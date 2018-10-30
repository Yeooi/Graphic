
import java.awt.Graphics2D;
import java.awt.Color;

public class Piece{
	
	int pos1X;
	int pos1Y;

	int pos2X;
	int pos2Y;

	int pos3X;
	int pos3Y;

	int pos4X;
	int pos4Y;

	int size = 50;
	int movement = 50;

	int position = 0;

	int red;
	int green;
	int blue;

	Color color;

	public Piece()
	{}
	
	public void update60()
	{}

	public void update1000()
	{}

	public void rotate()
	{}

	public void move()
	{}

	public void boundary()
	{}

	
	public void draw(Graphics2D g) {
		g.setColor(new Color(red, green, blue));
	    g.fillRect(pos1X, pos1Y, size, size);
		g.fillRect(pos2X, pos2Y, size, size);
		g.fillRect(pos3X, pos3Y, size, size);
		g.fillRect(pos4X, pos4Y, size, size);
	}
}
