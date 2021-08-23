package unit12;

public class Grid
{
    char[][] grid = new char[3][3];
    boolean xWin, oWin, win = false;
    
    public Grid()
    {
        int counter = 1;
        int r = grid.length;
        int c = grid[0].length;
        
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                grid[i][j] = Integer.toString(counter).charAt(0);
                counter++;
            }
        }
    }
    public void printGrid()
    {
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[i].length; j++)
            {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public boolean makeMove(int x, char player)
    {
        int r,c;
        switch(x)
        {
            case 1: 
            r = 0;
            c = 0;
            break;
            
            case 2: 
            r = 0;
            c = 1;
            break;
            
            case 3: 
            r = 0;
            c = 2;
            break;
            
            case 4: 
            r = 1;
            c = 0;
            break;
            
            case 5: 
            r = 1;
            c = 1;
            break;
            
            case 6: 
            r = 1;
            c = 2;
            break;
            
            case 7: 
            r = 2;
            c = 0;
            break;
            
            case 8: 
            r = 2;
            c = 1;
            break;
            
            case 9: 
            r = 2;
            c = 2;
            break;
            
            default:
            r = -1;
            c = -1;
        }
        if(grid[r][c] != 'X' && grid[r][c] != 'O')
        {
            grid[r][c] = player;
            return true;
        }
        return false;
    }
    public boolean checkWin()
    {
        char winner = ' ';
        char[] row1 = grid[0];
        char[] row2 = grid[1];
        char[] row3 = grid[2];
        char[] col1 = {grid[0][0], grid[1][0], grid[2][0]};
        char[] col2 = {grid[0][1], grid[1][1], grid[2][1]};
        char[] col3 = {grid[0][2], grid[1][2], grid[2][2]};
        char[] upDiagonal = {grid[2][0], grid[1][1], grid[0][2]};
        char[] downDiagonal = {grid[0][0], grid[1][1], grid[2][2]};
        
        if(row1[0] == row1[1] && row1[1] == row1[2])
        {
            winner = row1[0];
            win = true;
            System.out.println("Row 1 Win");
        }
        if(row2[0] == row2[1] && row2[1] == row2[2])
        {
            winner = row1[0];
            win = true;
            System.out.println("Row 1 Win");
        }
        if(row3[0] == row3[1] && row3[1] == row3[2])
        {
            winner = row1[0];
            win = true;
            System.out.println("Row 1 Win");
        }
        if(col1[0] == col1[1] && col1[1] == col1[2])
        {
            winner = row1[0];
            win = true;
            System.out.println("Row 1 Win");
        }
        if(col2[0] == col2[1] && col2[1] == col2[2])
        {
            winner = row1[0];
            win = true;
            System.out.println("Row 1 Win");
        }
        if(col3[0] == col3[1] && col3[1] == col3[2])
        {
            winner = row1[0];
            win = true;
            System.out.println("Row 1 Win");
        }
        if(upDiagonal[0] == upDiagonal[1] && upDiagonal[1] == upDiagonal[2])
        {
            winner = row1[0];
            win = true;
            System.out.println("Row 1 Win");
        }
        if(downDiagonal[0] == downDiagonal[1] && downDiagonal[1] == downDiagonal[2])
        {
            winner = row1[0];
            win = true;
            System.out.println("Row 1 Win");
        }
        if(win && winner =='X')
        {
            xWin = true;
        }
        if(win && winner =='O')
        {
            oWin = true;
        }
        return win;
    }
}