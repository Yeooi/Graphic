
import java.awt.Graphics2D;
import java.awt.Color;
public class GridBox{
    
    int x;
    int y;
    int size;
    boolean isFilled;
    boolean isColor;
    Color color;

    public GridBox (int x,int y,int size){
        this.x = x;
        this.y = y;
        this.size = size;
        isFilled = false;
        isColor = false;
        color = new Color(99, 98, 98);
    }

    public void setColour(int r,int g,int b) {
        color = new Color(r,g,b);
    }

    public void draw(Graphics2D g) {

        if(isFilled) {
            g.setColor(color);
            g.fillRect(x,y,size,size);
        }
    
        g.setColor(Color.WHITE);
        g.drawRect(x,y,size,size);
	}

}