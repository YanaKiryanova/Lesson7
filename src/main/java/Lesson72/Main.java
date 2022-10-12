package Lesson72;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Work> arr = new ArrayList<>();
        arr.add(new Director());
        arr.add(new Worker());
        arr.add(new Accountant());
        for(Work i : arr){
            i.post();
        }
    }
}
