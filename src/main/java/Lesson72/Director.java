package Lesson72;

public class Director implements Work{
    String post = "Директор";
    @Override
    public void post() {
        System.out.println("Я " + post );
    }
}
