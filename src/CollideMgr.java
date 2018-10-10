import java.awt.Color;

public class CollideMgr
{
    Grid grid;
    Piece p;

    public CollideMgr(Grid grid, Piece p)
    {
        this.grid = grid;
        this.p = p;
        System.out.println(grid.height - grid.size);
    }

    public void setPiece(Piece p)
    {
        this.p = p; 
    }

    public boolean isCollide()
    {
        for(int i=0;i<grid.x;i++)
        {
            for(int j=0;j<grid.y;j++)
            {
                if((p.pos1Y ==  (grid.gridBox[i][j].y - grid.size) 
                || p.pos2Y ==  (grid.gridBox[i][j].y - grid.size) 
                || p.pos3Y ==  (grid.gridBox[i][j].y - grid.size) 
                || p.pos4Y ==  (grid.gridBox[i][j].y - grid.size))
                && grid.gridBox[i][j].isFilled)
                {
                    System.out.println("Detach");
                    return true;
                }
                else if(p.pos1Y == grid.height - grid.size)
                {
                    Detach(p, grid);
                    return true;
                }
            }
        }
        return false;
    }

    public void Detach(Piece p,Grid grid)
    {
        System.out.println("Detach" + p.pos1X/grid.size + " "+p.pos1Y/grid.size);
        grid.gridBox[p.pos1X/grid.size][p.pos1Y/grid.size].isFilled = true;
        grid.gridBox[p.pos1X/grid.size][p.pos1Y/grid.size].color = p.color;

        grid.gridBox[p.pos2X/grid.size][p.pos2Y/grid.size].isFilled = true;
        grid.gridBox[p.pos2X/grid.size][p.pos2Y/grid.size].color = p.color;

        grid.gridBox[p.pos3X/grid.size][p.pos3Y/grid.size].isFilled = true;
        grid.gridBox[p.pos3X/grid.size][p.pos3Y/grid.size].color = p.color;

        grid.gridBox[p.pos4X/grid.size][p.pos4Y/grid.size].isFilled = true;
        grid.gridBox[p.pos4X/grid.size][p.pos4Y/grid.size].color = p.color;
    }
}