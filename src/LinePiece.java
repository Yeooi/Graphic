
import java.awt.Graphics2D;
import java.awt.Color;

public class LinePiece extends Piece {

	String position;

	//Enum position1 = new Enum (hori,vertical);

	public LinePiece(int pos1X, int pos1Y) {
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

		this.color = new Color(red,green,blue);

		this.position = "hori";
	}
	
	public void update60() {	
		boundary();
		move();
	}

	public void update1000() {
		pos1Y = pos1Y + movement;	
		boundary();
		move();
	}

	public void rotate() {
		if(position == "hori") {
			position = "verti";
		}
		else {
			position = "hori";
		}
	}

	public void move() {
		if(position == "verti") {
			this.pos2X = pos1X;
			this.pos2Y = pos1Y - size ;

			this.pos3X = pos1X;
			this.pos3Y = pos1Y + size;

			this.pos4X = pos1X;
			this.pos4Y = pos1Y + (size*2);
		}
		else {
			this.pos2X = pos1X - size;
			this.pos2Y = pos1Y;

			this.pos3X = pos1X  + size;
			this.pos3Y = pos1Y;

			this.pos4X = pos1X  + (size*2);
			this.pos4Y = pos1Y;
		}
	}

	public void boundary() {
		if(position == "hori") {
			if(pos1X < 0 || pos2X < 0 || pos3X < 0 || pos4X < 0) {
				pos1X = 50;
			}
			else if(pos1X > 450 || pos2X > 450 || pos3X > 450 || pos4X > 450) {
				pos1X = 350;
			}
		}
		else {
			if(pos1X < 0 || pos2X < 0 || pos3X < 0 || pos4X < 0) {
				pos1X = 0;
			}
			else if(pos1X > 450 || pos2X > 450 || pos3X > 450 || pos4X > 450) {
				pos1X = 450;
			}
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
