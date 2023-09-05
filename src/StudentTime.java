import java.util.*;
import java.text.*;

public class StudentTime implements Learner {
    //Поле объекта
    private Learner learner;
    //Конструктор
    public StudentTime(Learner learner) {
        this.learner = learner;
    }
    //Переопределим реализуем метод learn
    @Override
    public void learn() {
        learner.learn();
        SimpleDateFormat time_formatter = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Текущее время(HH:mm:ss): ");
        System.out.println(time_formatter.format(new Date()));

    }
}