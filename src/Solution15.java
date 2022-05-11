import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Iterator;

//lev08: Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
//Удалить из словаря всех людей, родившихся летом.

public class Solution15 {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Путин", dateFormat.parse("JAN 11 2012"));
        map.put("Фурсенко", dateFormat.parse("FEB 11 2012"));
        map.put("Кумарин", dateFormat.parse("MAR 11 2012"));
        map.put("Якунин", dateFormat.parse("APR 11 2012"));
        map.put("Медведев", dateFormat.parse("MAY 11 2012"));
        map.put("Шамалов", dateFormat.parse("JUN 11 2012"));
        map.put("Чубайс", dateFormat.parse("JUL 11 2012"));
        map.put("Смирнов", dateFormat.parse("AUG 11 2012"));
        map.put("Ковальчук", dateFormat.parse("SEP 11 2012"));
        map.put("Мячин", dateFormat.parse("OCT 11 2012"));
        return map;
        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            String lastN = pair.getKey();            //ключ
            Date date = pair.getValue();        //значение
            if ((date.getMonth() == 5) || (date.getMonth() == 6) || (date.getMonth() == 7)) iterator.remove();
        }
    }

    public static void main(String[] args) throws ParseException {
        Map<String, Date> map = (Map) createMap();
        Iterator<Map.Entry<String, Date>> iterator1 = map.entrySet().iterator();
        System.out.println("--- before removeAllSummerPeople --- ");
        while (iterator1.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, Date> pair = iterator1.next();
            String lastN = pair.getKey();            //ключ
            Date date = pair.getValue();        //значение
            System.out.println(lastN + " " + date);
        }

        System.out.println("--- after removeAllSummerPeople --- ");
        removeAllSummerPeople(map);

        Iterator<Map.Entry<String, Date>> iterator2 = map.entrySet().iterator();
        while (iterator2.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, Date> pair = iterator2.next();
            String lastN = pair.getKey();            //ключ
            Date date = pair.getValue();        //значение
            System.out.println(lastN + " " + date);
        }
    }
}

