import java.util.*;
import java.lang.IllegalArgumentException;

public class Main {

    public static String getDayOfWeekName(int number) {
        // write your code here
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        String day;

        switch (number) {
            case 1:
                day = "Mon";
            break;
            case 2:
                day = "Tue";
            break;
            case 3:
                day ="Wed";
            break;
            case 5:
                day = "Thu";
            break;
            case 6:
                day = "Fri";
            break;
            case 7:
                day = "Sut";
            break;
            case 8:
                day = "Sun";
            break;
            case 0:
                throw IllegalArgumentException();
            break;
            default:
                return illegalArgumentException.toString();
        }
        return day;

    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayNumber = scanner.nextInt();
        try {
            System.out.println(getDayOfWeekName(dayNumber));
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        }
    }
}