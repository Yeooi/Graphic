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
                    System.out.println("Detach");
                    return true;
                }
            }
        }
        return false;
    }
}