import java.awt.Color;

public class ClearMgr
{
    Grid grid;
    Piece p;

    public ClearMgr(Grid grid, Piece p)
    {
        this.grid = grid;
        this.p = p;
    }

    public void setPiece(Piece p)
    {
        this.p = p; 
    }

    public void checkClear()
    {
        int j = 0;
        for(int i=0;i<grid.y;i++)
        {
            int counter = 0;
            while(j<grid.x)
            {
                if(grid.gridBox[j][i].isFilled)
                {
                    counter++;
                }
                j++;
            }
            j=0;

            if(counter == grid.x)
            {
                clearRow(j);
                counter = 0;
            }
        }
    }

    public void pushDown()
    {

    }

    public void clearRow(int x)
    {
        System.out.println("clearing");
        System.out.println(x);
        for(int i = 0; i < grid.x; i++)
        {
            grid.gridBox[x][i].isFilled = false;
            grid.gridBox[x][i].color = new Color(99, 98, 98);
            System.out.println("x" + x + "i" + i + grid.gridBox[x][i].isFilled);
        }
    }
}