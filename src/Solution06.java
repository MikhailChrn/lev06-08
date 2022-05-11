import java.util.ArrayList;

//lev07: 1. Создай список слов, заполни его самостоятельно.
//2. Метод fix должен:
//2.1. удалять из списка строк все слова, содержащие букву "р"
//2.2. удваивать все слова содержащие букву "л".
//2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
//2.4. с другими словами ничего не делать.

/*
1. Используйте contains, работает он примерно так list.get(i).contains("p")  - проверяет есть ли в i-том элементе массива символ "р".
2. Не забывайте, что при удалении и добавлении элемента в массив нужно отнимать или добавлять единицу к счетчику соответственно.
3. А этот пункт - ода моей невнимательности. Сделал все, но забыл что метод fix должен возвращать list, а не null.
И недоумевал почему все работает а ва
 */

public class Solution06 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        ArrayList<String> newStrings = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            if ((strings.get(i).contains("л")) & (strings.get(i).contains("р"))) {
                newStrings.add(strings.get(i));
            } else if ((strings.get(i).contains("р"))) {
                continue;
            } else if ((strings.get(i).contains("л"))) {
                newStrings.add(strings.get(i));
                newStrings.add(strings.get(i));
            } else {
                newStrings.add(strings.get(i));
            }
        }
        return newStrings;
    }
}

