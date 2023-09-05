import java.util.*;
public class Main {
    public static void main(String[] args) {
       //можно вкладывать объекты друг в друга и вызовем нашу "матрешку"
        new StudentTime(new Student()).learn();

    }
}