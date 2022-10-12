package Lesson72;

public class Accountant implements Work{
    String post = "Бухгалтер";
    @Override
    public void post() {
        System.out.println("Я " + post );
    }
}
