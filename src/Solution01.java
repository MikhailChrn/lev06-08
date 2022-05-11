import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//lev06: Калькулятор индекса тела на соотношении роста и веса

public class Solution01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Величины вводить в метрах и килограммах
        double weight = Double.parseDouble(reader.readLine());
        double height = Double.parseDouble(reader.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        static double massIndex;
        public static void calculateMassIndex(double weight, double height) {
            // напишите тут ваш код
            massIndex = weight / (height * height);
            if (massIndex < 18.5) {System.out.println("Недовес: меньше чем 18.5"); }
            else if ((massIndex >= 18.5) & (massIndex < 25.0))
            {System.out.println("Нормальный: между 18.5 и 25");}
            else if ((massIndex >= 25.0) & (massIndex < 30.0))
            {System.out.println("Избыточный вес: между 25 и 30");}
            else if (massIndex >= 30.0)
            {System.out.println("Ожирение: 30 или больше");}
        }
    }
}
