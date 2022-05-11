import java.io.BufferedReader;
import java.io.InputStreamReader;

//lev08: Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке. Каждое слово - с новой строки.

public class Solution20 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String word : array) {
            System.out.println(word);
        }
    }//end main

    public static void sort(String[] array) {
        //напишите тут ваш код
        String temp;
        for (int out = 0; out < (array.length - 1); out++) {
            for (int in = (array.length - 1); in >out; in--) {
                if (isGreaterThan(array[in - 1], array[in]) == true) {
                    temp = array[in];
                    array[in] = array[in - 1];
                    array[in - 1] = temp;
                }
            }//end for IN
        }//end for OUT
    }//end void sort

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}


