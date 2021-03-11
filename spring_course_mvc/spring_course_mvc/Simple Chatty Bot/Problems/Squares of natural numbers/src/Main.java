import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int numberN = scanner.nextInt();
        int i = 1;

        while (i * i <= numberN) {
            System.out.println(i * i);
            i++;
        }
    }
}