import java.text.SimpleDateFormat;
import java.util.Date;

//lev08:1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true,
// если количество дней с начала года - нечетное число, иначе false
//2. String date передается в формате FEBRUARY 1 2013
//Не забудь учесть первый день года.

public class DateExample {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date input = new Date(date);
        SimpleDateFormat ff = new SimpleDateFormat("D");
        int x = Integer.parseInt(ff.format(input));
        return x%2 != 0;
    }
}


