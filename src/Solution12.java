import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

//lev08: Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
//Метод getInsertTimeInMs должен вернуть время своего исполнения в миллисекундах.

public class Solution12 {
    public static void main(String[] args) {
        //Сравнение работы ArrayList и LinkedList
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        // напишите тут ваш код
        Date beforeTime = new Date();
        insert10000(list);
        Date afterTime = new Date();
        return afterTime.getTime() - beforeTime.getTime();
        // напишите тут ваш код
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
