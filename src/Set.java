import java.util.HashSet;

//lev08: работа с объектом SET

public class Set {
    public static void main(String[] args) {
        //напишите тут ваш код
        java.util.Set<String> set = new HashSet<String>();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("женьшень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");

        for (String str : set) System.out.println(str);
    }
}
