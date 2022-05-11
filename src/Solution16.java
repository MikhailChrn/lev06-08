import java.util.*;

//lev08:Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
//Удалить людей, имеющих одинаковые имена.

public class Solution16 {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> employes = new HashMap<String, String>();
        employes.put("Путин", "Владимир");
        employes.put("Фурсенко", "Сергей");
        employes.put("Кумарин", "Владимир");
        employes.put("Якунин", "Владимир");
        employes.put("Медведев", "Дмитрий");
        employes.put("Шамалов", "Николай");
        employes.put("Чубайс", "Анатолий");
        employes.put("Смирнов", "Владимир");
        employes.put("Ковальчук", "Юрий");
        employes.put("Мячин", "Сергей");
        return employes;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        ArrayList<String> listNames = new ArrayList<String>();
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            listNames.add(pair.getValue());
        }

        HashSet<String> duplNames = new HashSet<String>();
        for (String s : listNames) {
            if (Collections.frequency(listNames, s) > 1) duplNames.add(s);
        }
        for (String s : duplNames) removeItemFromMapByValue(map, s);
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = (Map) createMap();
        removeTheFirstNameDuplicates(map);
    }
}

