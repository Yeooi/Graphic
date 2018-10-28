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

        //double check my grid
        //y is row, 20 rows
        //x is col, 10 cols
        for(int row=0;row<grid.y;row++)
        {
            int counter = 0;
            for(int col = 0; col<grid.x;col++)
            {
                if(grid.gridBox[col][row].isFilled)
                {
                    counter++;
                }

                if(counter == grid.x)
                {
                    clearRow(row);
                    counter = 0;
                    pushDown();
                }
            }
        }
    }

    public void pushDown()
    {
        System.out.println("Pushing down");
        for(int row=grid.y-1;row>0;row--)
        {
            for(int col=grid.x-1;col>=0;col--)
            {
                grid.gridBox[col][row].isFilled = grid.gridBox[col][row-1].isFilled;
                grid.gridBox[col][row].color = grid.gridBox[col][row-1].color;
            }
        }
    }

    public void clearRow(int row)
    {
        System.out.println("Clearing row " + row);
        for(int i = 0; i < grid.x; i++)
        {
            grid.gridBox[i][row].isFilled = false;
            grid.gridBox[i][row].color = new Color(99, 98, 98);
        }
    }
}