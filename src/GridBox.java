
import java.awt.Graphics2D;
import java.awt.Color;

public class GridBox{
    
    int x;
    int y;
    int size;
    boolean isFilled;

    public GridBox (int x,int y,int size){
        this.x = x;
        this.y = y;
        this.size = size;
        isFilled = false;
    }

    public void draw(Graphics2D g) {
		g.setColor(Color.WHITE);
        g.drawRect(x, y, size,size );
	}

}