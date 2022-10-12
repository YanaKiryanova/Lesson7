package Lesson71;
// L = 2 * r * p  / r - радиус p - 3,14159
public class Circle implements Figure {
    private final double P = Math.PI;
    private double radius;
    private double square;
    private double perimeter;

    public Circle (double radius){
        this.radius = radius;
    }
    @Override
    public double square() {
         square = (2 * radius) * P;
        return  square;
    }

    @Override
    public double perimeter() {
        perimeter = 2 * P * radius;
        return perimeter;
    }


}
