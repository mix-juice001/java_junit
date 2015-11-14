package tddbc;

public class GridPoints {

    private GridPoint one;
    private GridPoint another;

    public GridPoints(GridPoint one, GridPoint another) {
        this.one = one;
        this.another = another;
    }

    public boolean contains(GridPoint target) {
        return one.hasSameCoordinatesWith(target) || another.hasSameCoordinatesWith(target);
    }
}
