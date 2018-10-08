
import java.awt.Graphics2D;
import java.awt.Color;

public class SquarePiece extends Piece{


	public SquarePiece(int pos1X, int pos1Y)
	{
		super();
		this.pos1X = pos1X;
		this.pos1Y = pos1Y;

		this.pos2X = pos1X + size;
		this.pos2Y = pos1Y;

		this.pos3X = pos1X;
		this.pos3Y = pos1Y + size;

		this.pos4X = pos1X + size;
		this.pos4Y = pos1X + size;

		this.red = 0;
		this.green = 255;
		this.blue = 0;
	}
	
	public void update60()
	{	
		move();
	}

	public void update1000()
	{
		pos1Y = pos1Y + movement;	
		move();
	}

	public void rotate()
	{

	}

	public void move()
	{
		this.pos2X = pos1X + size;
		this.pos2Y = pos1Y;

		this.pos3X = pos1X;
		this.pos3Y = pos1Y + size;

		this.pos4X = pos1X + size;
		this.pos4Y = pos1Y + size;
	}

	
	public void draw(Graphics2D g) {
		
		g.setColor(new Color(red, green, blue));
	    g.fillRect(pos1X, pos1Y, size, size);
		g.fillRect(pos2X, pos2Y, size, size);
		g.fillRect(pos3X, pos3Y, size, size);
		g.fillRect(pos4X, pos4Y, size, size);
	}
}
