package Lesson71;

public class Main {
    public static void main(String[] args) {
        Figure[] figure = new Figure[5];
        figure[0] = new Triangle(30.0, 10.0,9.0,9.0);
        figure[1] = new Rectangle(8.0,5.0);
        figure[2] = new Circle(76.0);
        figure[3] = new Rectangle(3.0,2.0);
        figure[4] = new Circle(6.0);

        double sumPerimtr = 0.0;
        double sumPl = 0.0;

        for (Figure i : figure){
            sumPl += i.square();
            sumPerimtr += i.perimeter();
        }
        System.out.println("Сумма периметров 5 фигур " + Math.round(sumPerimtr) + " Сумма площади 5 фигур " + Math.round(sumPl));
    }
}
