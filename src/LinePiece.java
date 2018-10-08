
import java.awt.Graphics2D;
import java.awt.Color;

public class LinePiece extends Piece{

	String position;

	public LinePiece(int pos1X, int pos1Y)
	{
		super();
		this.pos1X = pos1X;
		this.pos1Y = pos1Y;

		this.pos2X = pos1X;
		this.pos2Y = pos1Y - size ;

		this.pos3X = pos1X;
		this.pos3Y = pos1Y + size;

		this.pos4X = pos1X;
		this.pos4Y = pos1X + (size*2);

		this.red = 0;
		this.green = 0;
		this.blue = 255;

		this.position = "hori";
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
		if(position == "hori")
		{
			position = "verti";
		}
		else
		{
			position = "hori";
		}
	}

	public void move()
	{
		if(position == "verti")
		{
			this.pos2X = pos1X;
			this.pos2Y = pos1Y - size ;

			this.pos3X = pos1X;
			this.pos3Y = pos1Y + size;

			this.pos4X = pos1X;
			this.pos4Y = pos1Y + (size*2);
		}
		else
		{
			this.pos2X = pos1X - size;
			this.pos2Y = pos1Y;

			this.pos3X = pos1X  + size;
			this.pos3Y = pos1Y;

			this.pos4X = pos1X  + (size*2);
			this.pos4Y = pos1Y;
		}
	}

	
	public void draw(Graphics2D g) {
		
		g.setColor(new Color(red, green, blue));
	    g.fillRect(pos1X, pos1Y, size, size);
		g.fillRect(pos2X, pos2Y, size, size);
		g.fillRect(pos3X, pos3Y, size, size);
		g.fillRect(pos4X, pos4Y, size, size);
	}
}
