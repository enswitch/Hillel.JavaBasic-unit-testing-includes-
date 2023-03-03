package org.homeworks.hm16;

import org.junit.jupiter.api.*;

public class PointTest {

    Point point1;
    Point point2;
    Point point3;


    @BeforeEach
    public void createPoints() throws CloneNotSupportedException {
        point1 = new Point(2, 3);
        point2 = new Point(2, 3);
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
    void pointCloneConstructor() {
        String savePoint = point3.toString();
        Point pointCopy = new Point(point3);

        Assertions.assertEquals(point3, pointCopy);
        Assertions.assertEquals(savePoint, point3.toString()); // if test failed, it means that copy constructor was changed!
    }

    @Test
    void pointCloneMethod() throws CloneNotSupportedException {
        Point pointCloned = (Point) point3.clone();
        Assertions.assertEquals(point3, pointCloned);
    }

    @Test
    void pointEquals() throws CloneNotSupportedException {
        Assertions.assertTrue(point1.equals(point1)); // reflexivity

        Assertions.assertTrue(point1.equals(point2)); // symmetric
        Assertions.assertTrue(point2.equals(point1));

        Point clonedPoint = new Point(point1);        // transitive
        Assertions.assertTrue(point1.equals(point2));
        Assertions.assertTrue(point1.equals(clonedPoint));
        Assertions.assertTrue(point2.equals(clonedPoint));

        Assertions.assertFalse(point1.equals(point3)); // consistency
        Assertions.assertFalse(point1.equals(point3));

        Assertions.assertFalse(point1.equals(null));   // null check
    }

    @Test
    void pointHashCode() {
        Assertions.assertEquals(point1, point2);
        Assertions.assertEquals(point1.hashCode(), point2.hashCode()); // equals consistency

        int hashInt = point1.hashCode();   // internal consistency
        point1.setY(5);
        Assertions.assertNotEquals(hashInt, point1.hashCode());
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
