import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int intArraySize = scanner.nextInt();
        int[] intArray = new int[intArraySize];
        int maxIndex = 0;
        int maxNumber;

        //Filling int array
        for (int i = 0; i < intArraySize; i++) {
            intArray[i] = scanner.nextInt();
        }

        maxNumber = intArray[0];

        for (int i = 0; i < intArray.length; i++) {
            if (maxNumber < intArray[i]) {
                maxNumber = intArray[i];
                maxIndex = i;
            }
        }

        System.out.println(maxIndex);
    }
}