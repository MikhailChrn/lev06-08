import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

//lev08: Измерить, сколько времени занимает 10 тысяч вызовов get для каждого списка.
//Метод getGetTimeInMs должен вернуть время своего исполнения в миллисекундах.

public class Solution13 {
    public static void main(String[] args) {
        //Сравнение работы ArrayList и LinkedList
        System.out.println(getGetTimeInMs(fill(new ArrayList())));
        System.out.println(getGetTimeInMs(fill(new LinkedList())));
    }

    public static List fill(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long getGetTimeInMs(List list) {
        // напишите тут ваш код
        Date beforeTime = new Date();
        get10000(list);
        Date afterTime = new Date();
        return afterTime.getTime() - beforeTime.getTime();
        // напишите тут ваш код
    }

    public static void get10000(List list) {
        if (list.isEmpty()) {
            return;
        }
        int x = list.size() / 2;

        for (int i = 0; i < 10000; i++) {
            list.get(x);
        }
    }
}

