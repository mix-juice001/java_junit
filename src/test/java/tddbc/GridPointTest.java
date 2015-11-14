package tddbc;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GridPointTest {

    @Test
    public void X座標を取得するテスト() {
        GridPoint sut = new GridPoint(4,7);
        int actual = sut.getX();
        assertThat(actual, is(4));
    }

    @Test
    public void X座標_10を取得するテスト() {
        GridPoint sut = new GridPoint(10, 7);
        int actual = sut.getX();
        assertThat(actual, is(10));
    }

    @Test
    public void Y座標を取得するテスト() {
        GridPoint sut = new GridPoint(3, 4);
        int actual = sut.getY();
        assertThat(actual, is(4));
    }

    @Test
    public void 格子点の文字列取得テスト() {
        GridPoint sut = new GridPoint(4, 7);
        String actual = sut.getNotation();
        assertThat(actual, is("(4,7)"));
    }

    @Test
    public void 同じ座標を比較するテスト(){
        GridPoint sut = new GridPoint(4,7);
        GridPoint target = new GridPoint(4,7);
        boolean actual = sut.hasSameCoordinatesWith(target);

        assertThat(actual,is(true));
    }

    @Test
    public void 異なる座標を比較するテスト() {
        GridPoint sut = new GridPoint(3, 7);
        GridPoint target = new GridPoint(4, 6);
        boolean actual = sut.hasSameCoordinatesWith(target);

        assertThat(actual, is(false));
    }

    @Test
    public void 右側の点か判定するテスト(){
        GridPoint sut = new GridPoint(4,7);
        GridPoint target = new GridPoint(5,7);
        boolean actual = sut.isNeighborOf(target);

        assertThat(actual,is(true));
    }

    @Test
    public void 右側の点でないことを判定するテスト(){

        GridPoint sut = new GridPoint(4,7);
        GridPoint target = new GridPoint(6,7);
        boolean actual = sut.isNeighborOf(target);

        assertThat(actual,is(false));
    }

    @Test
    public void 左側の点か判定するテスト() {
        GridPoint sut = new GridPoint(4,7);
        GridPoint target = new GridPoint(3,7);
        boolean actual = sut.isNeighborOf(target);

        assertThat(actual,is(true));
    }

    @Test
    public void 上側の点か判定するテスト(){
        GridPoint sut = new GridPoint(4,7);
        GridPoint target = new GridPoint(4,8);
        boolean actual = sut.isNeighborOf(target);

        assertThat(actual,is(true));
    }

    @Test
    public void 下側の点か判定するテスト(){
        GridPoint sut = new GridPoint(4,7);
        GridPoint target = new GridPoint(4,6);
        boolean actual = sut.isNeighborOf(target);

        assertThat(actual,is(true));
    }

    @Test
    public void 斜めは隣ではない() {
        GridPoint sut = new GridPoint(4,7);
        GridPoint target = new GridPoint(3,6);
        boolean actual = sut.isNeighborOf(target);

        assertThat(actual,is(false));
    }

    @Test
    public void 遠い点は隣ではない() {
        GridPoint sut = new GridPoint(4,7);
        GridPoint target = new GridPoint(10,10);
        boolean actual = sut.isNeighborOf(target);

        assertThat(actual,is(false));
    }

    @Test
    public void 同じ座標は隣ではない(){
        GridPoint sut = new GridPoint(4,7);
        GridPoint target = new GridPoint(4,7);
        boolean actual = sut.isNeighborOf(target);

        assertThat(actual,is(false));
    }

    @Test
    public void 指定した格子点を含む() {
        GridPoints gridPoints = new GridPoints(new GridPoint(4, 7), new GridPoint(10, 13));
        GridPoint target = new GridPoint(4, 7);
        assertThat(gridPoints.contains(target), is(true));
    }

    @Test
    public void 指定した格子点を含まない() {
        GridPoints gridPoints = new GridPoints(new GridPoint(4, 7), new GridPoint(10, 13));
        GridPoint target = new GridPoint(-1, -9);
        assertThat(gridPoints.contains(target), is(false));
    }

}
