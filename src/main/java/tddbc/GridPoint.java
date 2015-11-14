package tddbc;

public class GridPoint {
    private int x;
    private int y;

    public GridPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return this.y;
    }

    public String getNotation() {
        return "(" + String.valueOf(x) + "," + String.valueOf(y) + ")";
    }

    public boolean hasSameCoordinatesWith(GridPoint target) {
        return this.x == target.x && this.y == target.y;
    }
}
