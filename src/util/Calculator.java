package util;

public class Calculator {
    public static final double PI = 3.14159265358979323846;

    public static double circumference(double radius) {
        return 2 * Math.PI * radius;
    }
    public static double volume(double radius) {
        return 4.0 * PI*radius * radius * radius / 3;
    }
}
