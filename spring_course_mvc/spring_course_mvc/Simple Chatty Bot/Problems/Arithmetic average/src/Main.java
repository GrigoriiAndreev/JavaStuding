import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();
        double sum = 0, counter = 0;

        double average;

        for (int i = start; i <= end; i++) {
            if (i % 3 == 0) {
                counter++;
                sum = sum + i;
            }
        }
        average = sum / counter;
        System.out.println(average);

    }
}