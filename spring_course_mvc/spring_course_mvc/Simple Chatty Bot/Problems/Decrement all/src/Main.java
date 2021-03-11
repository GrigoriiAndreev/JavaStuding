import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int number = 0;
        for (int i = 0;  i < 4; i++) {
            number = scanner.nextInt();
            System.out.print(--number + " ");
        }
    }
}
