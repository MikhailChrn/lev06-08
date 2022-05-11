import java.util.HashSet;
import java.util.Set;

//lev08: Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
//Удалить из множества все числа больше 10.

public class Solution14 {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> hashSet = new HashSet<Integer>();
        while (hashSet.size()<20) hashSet.add((int) (25*Math.random()));
        return hashSet;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        set.removeIf(integer -> integer > 10);
        return set;
    }

    public static void main(String[] args) {
        Set<Integer> hashSet = (HashSet<Integer>) createSet();
        System.out.println("------- Before removeAllNumbersGreaterThan10 --------");
        for (int i : hashSet) System.out.println(i);
        System.out.println();
        System.out.println("------- Before removeAllNumbersGreaterThan10 --------");
        removeAllNumbersGreaterThan10(hashSet);
        for (int i : hashSet) System.out.println(i);
    }
}

