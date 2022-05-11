import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//lev07: Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
//Если таких строк несколько, то должны быть учтены самые первые из них.

public class Solution03 {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<String>();
        //Заполнение ArrayList
        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }
        //Поиск величины короткой строки
        int minLeng = strings.get(0).length();
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() < minLeng) {
                minLeng = strings.get(i).length();
            }
        }
        //Поиск величины длинной строки
        int maxLeng = strings.get(0).length();
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() > maxLeng) {
                maxLeng = strings.get(i).length();
            }
        }
        //Поиск того, что встретиться раньше: самая длинная или самая короткая
        System.out.println(minLeng + " " + maxLeng);
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
            if ((strings.get(i).length() == minLeng) | (strings.get(i).length() == maxLeng) ) {
                System.out.println(strings.get(i));
                break;
            }
        }
    }
}