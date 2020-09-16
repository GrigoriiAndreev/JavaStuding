package task05.task0504;


public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat1 = new Cat("Kuza", 3, 4, 10);
        Cat cat2 = new Cat("Vasya", 4, 5, 9);
        Cat cat3 = new Cat("Murka", 1, 2, 15);
        
        //  Eщё вариант
        //   for (int i = 0; i < 3; i++)             new Cat("Cat"+i, i, i+10, i+5);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
