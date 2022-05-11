import java.io.BufferedReader;
import java.io.InputStreamReader;

//Задача lev06: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.

public class Solution02 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countNumbers = 5;//количество чисел для сортировки
        int[] originalArray = new int[countNumbers];
        for (int i = 0; i < countNumbers; i++) {
            originalArray[i] = Integer.parseInt(reader.readLine());
        }
        int[] sortedArray = bubble_sort(originalArray);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i]);
        }
        //напишите тут ваш код
    }

    //Пузырьковая сортировка
    public static int[] bubble_sort(int[] array) {
        for(int i = 0; i < (array.length - 1); i++) {
            for(int j = array.length - 1; j > i; j-- ){
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }
}
