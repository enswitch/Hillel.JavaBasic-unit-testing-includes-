package org.homeworks.hm16;

import org.junit.jupiter.api.*;

public class PointTest {

    Point point1;
    Point point2;
    Point point3;
    Point point4;

    @BeforeEach
    public void createPoints() throws CloneNotSupportedException {
        point1 = new Point(2, 3);
        point2 = new Point(point1);
        point3 = new Point(5, 7);
        point4 = (Point) point2.clone();

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
    void pointEqualsReflexivity() {
        Assertions.assertEquals(true, point1.equals(point1));
    }

    @Test
    void pointEqualsSymmetric() {
        Assertions.assertEquals(true, point1.equals(point2));
        Assertions.assertEquals(true, point2.equals(point1));
    }

    @Test
    void pointEqualsTransitive() {
        Assertions.assertEquals(true, point1.equals(point2));
        Assertions.assertEquals(true, point1.equals(point4));
        Assertions.assertEquals(true, point2.equals(point4));
    }

    @Test
    void pointEqualsConsistency() {
        Assertions.assertEquals(false, point1.equals(point3));
        Assertions.assertEquals(false, point1.equals(point3));
    }

    @Test
    void pointEqualsIsNull() {
        Assertions.assertEquals(false, point1.equals(null));
    }

    @Test
    void pointHashCodeEqualsConsistency() {
        Assertions.assertEquals(true, point1.hashCode() == point2.hashCode());
    }

    @Test
    void pointHashCodeInternalConsistency() {
        Assertions.assertEquals(true, point1.hashCode() == point2.hashCode());
        point1.setY(5);
        Assertions.assertEquals(false, point1.hashCode() == point2.hashCode());

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
    }

    @Test
    void distanceBetweenPointsIsSame() {
        int distanceIsSame = Point.distanceBetweenPoints(point1, point2);
        Assertions.assertEquals(0, distanceIsSame);
    }

    @Test
    void distanceBetweenPointCheckForNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Point.distanceBetweenPoints(point3, null));
    }

    @Test
    void distanceBetweenPointsOverload() { // contains one parameter
        int distanceExist = point2.distanceBetweenPoints(point3);
        Assertions.assertEquals(5, distanceExist);
    }

    @Test
    void distanceBetweenPointsIsSameOverload() {
        int distanceNotExist = point2.distanceBetweenPoints(point1);
        Assertions.assertEquals(0, distanceNotExist);
    }

    @Test
    void distanceBetweenPointsCheckForNullOverload() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> point1.distanceBetweenPoints(null));
    }


}
