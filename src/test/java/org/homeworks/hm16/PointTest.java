package org.homeworks.hm16;

import org.junit.jupiter.api.*;

public class PointTest {

    Point point1, point2, point3;
    @BeforeEach
    public void createPoint() {
        point1 = new Point(2, 3);
        point2 = new Point(point1);
        point3 = new Point(5,7);
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
        System.out.println(result);
    }

    @Test
    void pointEquals() {
        Boolean result = point1.equals(point2);
        Assertions.assertEquals(true, result);
    }

    @Test
    void pointNotEquals() {
        Boolean result = point1.equals(point3);
        Assertions.assertEquals(false, result);
    }

    @Test
    void pointClonedConstructor() {
        Point pointCopy = new Point(point2);
        Assertions.assertEquals(true, pointCopy.equals(point2));
        System.out.println("Copied point by constructor: " + pointCopy.toString());
    }

    @Test
    void pointCloneMethod() throws CloneNotSupportedException {
        Point pointCopy = (Point) point3.clone();
        Assertions.assertEquals(true, pointCopy.equals(point3));
        System.out.println("Copied point by method clone: " + pointCopy.toString());
    }

    @Test
    void DistanceBetweenPoints() {
        int result = Point.distanceBetweenPoints(point1, point3);
        Assertions.assertEquals(5, result);
        System.out.println("The distance between matched points is: " + result);
    }

    @Test
    void sameDistanceBetweenPoints() {
        int result = Point.distanceBetweenPoints(point1, point2);
        Assertions.assertEquals(0, result);
        System.out.println("Points have the same coordinates");
    }

    @Test
    void nullDistanceBetweenPoints() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Point.distanceBetweenPoints(point3, null));
    }

    @Test
    void DistanceBetweenPointsOneArg() {
        int result = point2.distanceBetweenPoints(point3);
        Assertions.assertEquals(5, result);
        System.out.println("The distance between matched points is: " + result);
    }
    @Test
    void SameDistanceBetweenPointsOneArg() {
        int result = point2.distanceBetweenPoints(point1);
        Assertions.assertEquals(0, result);
        System.out.println("Points have the same coordinates");
    }

    @Test
    void nullDistanceBetweenPointsOneArg() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> point1.distanceBetweenPoints(null));
    }
}
