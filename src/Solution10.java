import java.io.BufferedReader;
import java.io.InputStreamReader;

//lev07: Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.

public class Solution10 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    //Пузырьковая сортировка
    public static void sort(int[] array) {
        for (int i = 0 ; i < (array.length - 1); i++)
        {
            for (int j = array.length - 1; j > i; j--)
            {
                if (array[j - 1] < array[j])
                {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        //напишите тут ваш код
    }//void sort
}

