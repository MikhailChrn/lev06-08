//lev07: Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
//Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
//Вывести объекты на экран.

public class Solution09 {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grandFather1 = new Human("Дедушка1", true, 91);
        Human grandMother1 = new Human("Бабушка1", false, 88);
        Human grandFather2 = new Human("Дедушка2", true, 91);
        Human grandMother2 = new Human("Бабушка2", false, 88);
        Human father = new Human("Отец", false, 61, grandFather1, grandMother1);
        Human mother = new Human("Мать", false, 58, grandFather2, grandMother2);
        Human children1 = new Human("Мальчик", true, 35, father, mother);
        Human children2 = new Human("Девочка", false, 30, father, mother);
        Human children3 = new Human("Мальчик", true, 25, father, mother);

        System.out.println(grandFather1);
        System.out.println(grandMother1);
        System.out.println(grandFather2);
        System.out.println(grandMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(children1);
        System.out.println(children2);
        System.out.println(children3);
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = null;
            this.mother = null;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        //Переопределяем метод toString
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}
