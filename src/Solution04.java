import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

//lev07: Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
//Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
//Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.

public class Solution04 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> mainInt = new ArrayList<Integer>();
        ArrayList<Integer> on3 = new ArrayList<Integer>();
        ArrayList<Integer> on2 = new ArrayList<Integer>();
        ArrayList<Integer> other = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {
            mainInt.add(Integer.parseInt(reader.readLine()));
            if ((mainInt.get(i) % 3) == 0) {on3.add(mainInt.get(i));}
            if ((mainInt.get(i) % 2) == 0) {on2.add(mainInt.get(i));}
            if (((mainInt.get(i) % 3) != 0) & ((mainInt.get(i) % 2) != 0)) {other.add(mainInt.get(i));}
        }

        printList(on3);
        printList(on2);
        printList(other);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
