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
    public void 同じ座標を持つかテスト(){
        GridPoint sut = new GridPoint(4,7);
        GridPoint target = new GridPoint(4,7);
        boolean actual = sut.hasSameCoordinatesWith(target);

        assertThat(actual,is(true));
    }

    @Test
    public void 異なる座標の格子点のテスト() {
        GridPoint sut = new GridPoint(3, 7);
        GridPoint target = new GridPoint(4, 6);
        boolean actual = sut.hasSameCoordinatesWith(target);

        assertThat(actual, is(false));
    }

}
