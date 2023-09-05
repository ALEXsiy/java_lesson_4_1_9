import java.text.*;
import java.util.Date;
import java.util.stream.IntStream;
//Класс студент с реализованным методом интерфейса learn
public class Student implements Learner {
    @Override
    public void learn() {
        System.out.println("Я учусь. .zZ");
        IntStream.range(0, 1000000).forEach(i -> Math.log(i));
        System.out.println("Я закончил учиться");
        /*SimpleDateFormat time_formatter = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Текущее время(HH:mm:ss): ");
        System.out.println(time_formatter.format(new Date()));*/
    }
}
