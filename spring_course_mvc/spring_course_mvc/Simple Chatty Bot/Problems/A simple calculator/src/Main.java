import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        long operand1 = scanner.nextLong();
        String operand = scanner.next();
        long operand2 = scanner.nextLong();

        switch (operand) {
            case "+":
                System.out.println(operand1 + operand2);
                break;
            case "-":
                System.out.println(operand1 - operand2);
                break;
            case "*":
                System.out.println(operand1 * operand2);
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(operand1 / operand2);
                }
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }

    }
}