import java.util.Scanner;

import static java.lang.StrictMath.abs;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();

        for (int i = 0; i < arraySize; i++) {
            for (int k = 0; k < arraySize; k++) {
                System.out.print(abs(k - i) + " ");
            }
            System.out.println();
        }
    }
}
