import java.util.*;

//lev08: Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
//Удалить из словаря всех людей, у которых зарплата ниже 500.

public class Solution17 {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> employes = new HashMap<String, Integer>();
        employes.put("Путин", 250);
        employes.put("Фурсенко", 500);
        employes.put("Кумарин", 750);
        employes.put("Якунин", 1000);
        employes.put("Медведев", 750);
        employes.put("Шамалов", 500);
        employes.put("Чубайс", 250);
        employes.put("Смирнов", 150);
        employes.put("Ковальчук", 250);
        employes.put("Мячин", 500);
        return employes;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        ArrayList<Integer> listSalary = new ArrayList<Integer>();
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            listSalary.add(pair.getValue());
        }

        HashSet<Integer> salaryLess500 = new HashSet<>();
        for (Integer i : listSalary) {
            if (i < 500) salaryLess500.add(i);
        }

        for (Integer i : salaryLess500) removeItemFromMapByValue(map, i);
    }

    public static void removeItemFromMapByValue(Map<String, Integer> map, Integer value) {
        Map<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> map = (Map) createMap();
        removeItemFromMap(map);

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}

