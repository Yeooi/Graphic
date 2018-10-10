import java.awt.Graphics2D;
import java.awt.Color;

public class Grid{
    int height;
    int width;
    int x;
    int y;
    GridBox[][] gridBox;

    public Grid(int height,int width,int size)
    {
        this.height = height;
        this.width = width;
        this.x = height/size;
        this.y = width/size;

        System.out.println("x"+x+"y"+y);

        gridBox = new GridBox[x][y];


        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                System.out.println("i" + i + "j" + j);
                gridBox[i][j] = new GridBox(i*size, j*size, size);
            }
        }
    }

    public void draw(Graphics2D g) {
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                g.setColor(Color.WHITE);
                g.drawRect(gridBox[i][j].x, gridBox[i][j].y, gridBox[i][j].size,gridBox[i][j].size );
            }
        }
		
	}
}