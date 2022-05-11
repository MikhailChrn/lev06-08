import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//lev07:Создать массив на 20 чисел.
//Заполнить его числами с клавиатуры.
//Найти максимальное и минимальное числа в массиве.
//Вывести на экран максимальное и минимальное числа через пробел.

public class Solution07 {
    public static void main(String[] args) throws IOException {
        int[] ints = getInts();
        int maximum = ints[0];
        for (int max : ints) if (max > maximum) maximum = max;
        int minimum = ints[0];
        for (int min : ints) if (min < minimum) minimum = min;
        //напишите тут ваш код
        System.out.print(maximum + " " + minimum);
    }

    public static int[] getInts() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] ints = new int[20];
        for (int i = 0; i < ints.length; i++) ints[i] = Integer.parseInt(reader.readLine());
        return ints;
    }
    //напишите тут ваш код
}
