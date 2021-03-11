import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int intArraySize = scanner.nextInt();
        int[] intArray = new int[intArraySize];

        //Filling int array
        for (int i = 0; i < intArraySize; i++) {
            intArray[i] = scanner.nextInt();
        }

        int checknumber = scanner.nextInt();
        //Checking the number
//        int counter = 0;
        boolean tobe = false;
        for (int i : intArray) {
            if (checknumber == i) {
                tobe = true;
            }
        }

        System.out.println(tobe);
    }
}