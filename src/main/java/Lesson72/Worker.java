package Lesson72;

public class Worker implements Work {
    String post = "Рабочий";
    @Override
    public void post() {
        System.out.println("Я " + post );
    }
}
