import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        String line;
        int number = 0;
        ArrayList<String> intArray = new ArrayList();

        do {
            line = scanner.nextLine();
            try {
                number = Integer.parseInt(line);
                if (number != 0) {
                    intArray.add(Integer.toString(number * 10));
                }
//                System.out.println(number);
            } catch (Exception e) {
//                System.out.println("Invalid user input: " + line);
                intArray.add("Invalid user input: " + line);
            }

        } while (number != 0);

        for (String i : intArray) {
            System.out.println(i);
        }
    }
}