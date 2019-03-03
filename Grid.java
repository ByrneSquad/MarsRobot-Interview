

package marsrover;


// Grid

public class Grid {

    private int gridHeight;
    private int gridWidth;
    private static final int DEFAULT_VALUE = 4;
    public int getGridHeight() {
        return gridHeight;
    }

    public void setGridHeight(int gridHeight) {
        if(gridHeight>0)
        this.gridHeight = gridHeight;
        else
            this.gridHeight=DEFAULT_VALUE;
    }

    public int getGridWidth() {
        return gridWidth;
    }

    public void setGridWidth(int gridWidth) {
        this.gridWidth = gridWidth;
    }

    @Override
    public String toString() {
        return "Grid{" + "gridHeight=" + gridHeight + ", gridWidth=" + gridWidth + '}';
    }
    
    
}
