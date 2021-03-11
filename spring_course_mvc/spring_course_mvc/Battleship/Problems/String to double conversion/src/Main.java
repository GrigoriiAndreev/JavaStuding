import java.util.Scanner;

class Converter {

    /**
     * It returns a double value or 0 if an exception occurred
     */
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String line = scanner.next();
        double number = 0;

        try {
            number = convertStringToDouble(line);
        } catch (Exception e) {
            number = 0;
        }
        System.out.println(number);

    }
    public static double convertStringToDouble(String input) {

        return Double.parseDouble(input);
    }
}