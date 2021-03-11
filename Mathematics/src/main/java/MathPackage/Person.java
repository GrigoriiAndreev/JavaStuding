package MathPackage;

/**
 *  This class may be deleted (learning purpose).
 *  Abstract class Person.
 *  Author: Grigorii Andreev
 *  Data: 09 March 2019
 */


public abstract class Person {

    private String name;
    private int age;

    public static void main(String[] args) {
//        Person person= new Student();

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
