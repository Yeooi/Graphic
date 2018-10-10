import java.awt.Graphics2D;
import java.awt.Color;

public class Grid{
    int height;
    int width;
    int x;
    int y;
    int size;
    GridBox[][] gridBox;

    public Grid(int width,int height,int size) {
        this.height = height;
        this.width = width;
        this.x = width/size;
        this.y = height/size;
        this.size = size;

        System.out.println("x"+x+"y"+y);

        gridBox = new GridBox[x][y];


        for(int i=0;i<x;i++) {
            for(int j=0;j<y;j++) {
                //Debug for grid init
                //System.out.println("i" + i + "j" + j);
                gridBox[i][j] = new GridBox(i*size, j*size, size);
            }
        }
    }

    public void draw(Graphics2D g) {
        for(int i=0;i<x;i++) {
            for(int j=0;j<y;j++) {
                gridBox[i][j].draw(g);
            }
        }
		
	}
}