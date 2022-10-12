package Lesson71;
//S = 0,5 * a * h , где a — основание, h — высота.
public class Triangle implements Figure{
    private double hypotenuse;
    private double height;
    private double legOne;
    private double legTwo;
    private double square;
    private double perimeter;


    public Triangle (double hypotenuse, double height, double legOne, double legTwo){
        this.hypotenuse = hypotenuse;
        this.height = height;
        this.legOne = legOne;
        this.legTwo = legTwo;
    }

    @Override
    public double square() {
        square = 0.5 * (hypotenuse * height);
        return square;
    }

    @Override
    public double perimeter() {
         perimeter = hypotenuse + legTwo + legOne;
        return perimeter;
    }

}
