import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        double numberM = scanner.nextDouble();
        double numberP = scanner.nextDouble() / 100;
        double numberK = scanner.nextDouble();
        int year = 0;

        do {
            numberM = numberM + numberM * ( numberP );
            year++;
        } while (numberM <= numberK);

        System.out.println(year);
    }
}