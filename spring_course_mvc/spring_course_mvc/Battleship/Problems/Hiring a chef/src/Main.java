//put imports you need here

/*
import java.util.Scanner;

class Main {
    String name;
    int age;
    String education;
    String experience;
    String preferences;


    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        Main person = new Main();

        person.name = scanner.nextLine();
        person.age = scanner.nextInt();
        person.education = scanner.nextLine();
        person.experience = scanner.next();
        person.preferences = scanner.next();
        System.out.println("The form for " + person.name + " is completed. We will contact you " +
                "if we need a chef that cooks " + person.preferences + " dishes.");

    }
}*/


abstract class A {

    public static void staticFoo() { }

    public void instanceBar() { }

    public abstract void abstractFoo();

    public abstract void abstractBar();
}

abstract class B extends A {

    public static void anotherStaticFoo() { }

    public void anotherInstanceBar() { }

    @Override
    public void abstractBar() { }

    public abstract void qq();
}

class C extends B {

    @Override
    public void qq() {

    }

    @Override
    public void abstractFoo() {

    }
}