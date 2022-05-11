import java.util.HashSet;
import java.util.Set;

//lev08: Слияние двух SET-ов

public class Solution18 {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set <Object> pets = join(cats, dogs);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<>();
        for (int i = 0; i < 4; i++) cats.add(new Cat());
        //напишите тут ваш код
        return cats;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> dogs = new HashSet<>();
        for (int i = 0; i < 3; i++) dogs.add(new Dog());
        //напишите тут ваш код
        return dogs;
    }

    //Слияние выполняется тут
    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> pets = new HashSet<>();
        for (Object ob : cats) pets.add(ob);
        for (Object ob : dogs) pets.add(ob);
        //напишите тут ваш код
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object ob : pets) System.out.println(ob);
    }

    public static class Cat {}

    public static class Dog {}

    //напишите тут ваш код
}

