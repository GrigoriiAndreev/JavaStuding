package task06.task0613;

public class Solution {
    public static void main(String[] args) {
        // ������ 10 �����
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        Cat cat7 = new Cat();
        Cat cat8 = new Cat();
        Cat cat9 = new Cat();
        Cat cat10 = new Cat();

        // ������ �������� ���������� catCount
        System.out.println(Cat.catCount);
    }

    public static class Cat {
        // ������ ����������� ���������� catCount
        public static int catCount;

        // ������ �����������
        public Cat(){
            Cat.catCount++;
        }
    }
}
