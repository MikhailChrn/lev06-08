import java.util.ArrayList;

//lev07 :1. Создай список из слов "мама", "мыла", "раму".
//2. После каждого слова вставь в список строку, содержащую слово "именно".
//3. Вывести результат на экран, каждый элемент списка с новой строки.

public class Solution05 {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<String>();
        String[] source = {"мама", "мыла", "раму"};
        for (String s : source) {
            strings.add(s);
            strings.add("именно");
        }
        for (String s : strings) System.out.println(s);
    }
}
