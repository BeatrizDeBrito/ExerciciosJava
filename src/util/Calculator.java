package util;

public class Calculator {
    public  final double PI = 3.14159265358979323846;

    public double circumference(double radius) {
        return 2 * Math.PI * radius;
    }
    public  double volume(double radius) {
        return 4.0 * PI*radius * radius * radius / 3;
    }
}