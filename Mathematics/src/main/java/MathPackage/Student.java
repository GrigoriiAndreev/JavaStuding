package MathPackage;

/**
 * This class may be deleted, created for studying.
 * The class Student extends abstract class Person.
 * Author: Grigorii Andreev
 * Data: 09 March 2021
 */

public class Student extends Person implements Doing{

    @Override
    public String whatDoing() {
        return "Student is";
    }

    public static void main(String[] args) {

        Student student = new Student();
        student.setName("Ivanov");
        student.setAge(20);

        System.out.println(student.getName() + " " +
                student.getAge());
        System.out.println(student.whatDoing() + " = " + Doing.profession );
    }
}
