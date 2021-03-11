import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number = scanner.nextInt();
        int digit1 = number / 100;
        int digit2 = number % 100 / 10;
        int digit3 = number % 10;

        if (digit3 == 0) {
            System.out.println(digit2 + "" + digit1);
        }
        else if (digit2 == 0 && digit3 == 0) {
            System.out.println(digit1 + "");
        }
        else {
            System.out.println(digit3 + "" + digit2 + "" + digit1);
        }
    }
}