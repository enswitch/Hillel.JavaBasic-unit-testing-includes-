package org.homeworks.hm16;

import org.junit.jupiter.api.*;

public class PointTest {

    Point point1, point2, point3;

    @BeforeEach
    public void createPoints() {
        point1 = new Point(2, 3);
        point2 = new Point(point1);
        point3 = new Point(5, 7);
    }

    @Test
    void pointSetAndGet() {
        point2.setX(-4);
        point2.setY(-6);
        Assertions.assertEquals(-4, point2.getX());
        Assertions.assertEquals(-6, point2.getY());

    }

    @Test
    void pointInfoShow() {
        String result = point1.toString();
        Assertions.assertEquals("Point: " + "x =" + 2 + ", y =" + 3, result);
    }

    @Test
    void pointEquals() {
        Boolean resultEqual = point1.equals(point2);
        Assertions.assertEquals(true, resultEqual);

        Boolean resultNotEqual = point1.equals(point3);
        Assertions.assertEquals(false, resultNotEqual);
    }

    @Test
    void pointClonedConstructor() {
        Point pointCopy = new Point(point2);
        Assertions.assertEquals(true, pointCopy.equals(point2));
    }

    @Test
    void pointCloneMethod() throws CloneNotSupportedException {
        Point pointCopy = (Point) point3.clone();
        Assertions.assertEquals(true, pointCopy.equals(point3));
    }

    @Test
    void distanceBetweenPoints() { // contains two parameters
        int distanceExist = Point.distanceBetweenPoints(point1, point3);
        Assertions.assertEquals(5, distanceExist);

        int distanceNotExist = Point.distanceBetweenPoints(point1, point2);
        Assertions.assertEquals(0, distanceNotExist);

        Assertions.assertThrows(IllegalArgumentException.class, () -> Point.distanceBetweenPoints(point3, null));
    }

    @Test
    void distanceBetweenPointsOverload() { //must contain one parameter only
        int distanceExist = point2.distanceBetweenPoints(point3);
        Assertions.assertEquals(5, distanceExist);

        int distanceNotExist = point2.distanceBetweenPoints(point1);
        Assertions.assertEquals(0, distanceNotExist);

        Assertions.assertThrows(IllegalArgumentException.class, () -> point1.distanceBetweenPoints(null));

    }

}
