import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//lev08: Написать программу, которая вводит с клавиатуры строку текста.
//Программа заменяет в тексте первые буквы всех слов на заглавные.
//Вывести результат на экран.

public class Solution19 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder string = new StringBuilder(reader.readLine());

        if (Character.isAlphabetic(string.charAt(0)))//Проверяет, является ли символ №0 символом алфавита
            string.setCharAt(0, Character.toUpperCase(string.charAt(0))); //Заменяет на заглавную

        //напишите тут ваш код
        for (int i = 1; i < string.length(); i++) {
            //Проверяет, является буква символом алфавита и имеется ли перед ним специальные символы
            //&& <- прекращает оценку, если первый операнд оценивается как ложный, так как результат будет ложным
            //& <- проверяет оба операнда
            if (Character.isAlphabetic(string.charAt(i)) && Character.isSpaceChar(string.charAt(i-1)))
                string.setCharAt(i, Character.toUpperCase(string.charAt(i)));
        }

        System.out.println(string);
    }
}


