
import java.awt.Graphics2D;
import java.awt.Color;

public class GridBox{
    
    int x;
    int y;
    int size;
    boolean isFilled;
    int red;
    int green;
    int blue;

    public GridBox (int x,int y,int size){
        this.x = x;
        this.y = y;
        this.size = size;
        isFilled = false;
    }

    public void setColour(int r,int g,int b)
    {
        this.red = r;
        this.green = g;
        this.blue = b;
    }

    public void draw(Graphics2D g) {
        if(isFilled)
        {
            g.setColor(new Color(red,green,blue));
            g.fillRect(x, y, size,size );
        }
        g.setColor(Color.WHITE);
        g.drawRect(x, y, size,size );
	}

}