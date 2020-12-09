package MathPackage;

import java.util.Arrays;
import java.ArrayUtils;

public class Study {

    public static class Person {
        String name;
        int age;
    }

    public static void main(String[] args) {

        //Declaring the variable of array type
        int[] intArray;
        String[] stringArray = null;
        Person [] personArray = null;

        //Assigned the array address to variable
        int[] intArray10Elements = new int[10];
        String[] stringArray10Elements = new String[4];
        Person[] personArray10Elements = new Person[10];

        //Initialization the array
        int[] intArr = {11, 2, 31, 14, 52, 16,};
        String[] stringArr = {"Первый", "Второй", "Третий", "Четвертый"};
//        String stringArray10Elements = {"Первый", "Второй", "Третий", "Четвертый"};

        //Printing the arrays
        System.out.println("Adress of array= " + intArr);

        //Methods
        System.out.println("The address of array = " + intArr);
        System.out.println("The content of array = " + Arrays.toString(intArr));
        System.out.println("The length of array = " + intArr.length);
        System.out.print("Printing of each member of array. Method foreach = ");
        for (int i : intArr)
            System.out.print(i + " ");
        System.out.println();
        System.out.print("Printing of each member of array. Method for = ");
        for (int i=0; i<intArr.length; i++)
            System.out.print(intArr[i] + " ");
        System.out.println();
        Arrays.sort(intArr);
        System.out.println("Sorted: " + Arrays.toString(intArr));
        int[] intCopy = Arrays.copyOf(intArr,3);
        System.out.println("Copy of array (Arrays.copyOf): " + Arrays.toString(intCopy));
        System.arraycopy(intArr,0, intCopy,0,0);
        System.out.println("Copy of array (System.arraycopy): " + Arrays.toString(intCopy));
        int[] intConcatenationArray = ArrayUtils.addAll(intArr, intCopy);






    }
}
