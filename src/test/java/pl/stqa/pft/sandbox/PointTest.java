package pl.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {

    @Test()
    public void distance1() {

        Point point = new Point(2.0, 4.0);
        Point point2 = new Point(2.0, 3.0);

        Assert.assertEquals(point.distance(point2), 1.0);
    }

    @Test()
    public void distance2() {

        Point point = new Point(2.0, 3.0);
        Point point2 = new Point(2.0, 4.0);

        Assert.assertEquals(point.distance(point2), 1.0);
    }

    @Test()
    public void distance3() {

        Point point = new Point(3.0, 4.0);
        Point point2 = new Point(0.0, 0.0);

        Assert.assertEquals(point.distance(point2), 5.0);
    }
}
