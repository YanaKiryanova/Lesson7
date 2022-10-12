package Lesson71;
//S = a × b, где S — площадь; a, b — длина и ширина.
public class Rectangle implements Figure {
   private double height;
   private double width;
    private double square;
    private double perimeter;

   public Rectangle (double height, double width) {
       this.height = height;
       this.width = width;
   }
    @Override
    public double square() {
         square = height * width;
        return square;
    }

    @Override
    public double perimeter() {
         perimeter = (height + width) * 2;
        return perimeter;
    }

}
