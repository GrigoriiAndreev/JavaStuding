import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int operand1 = scanner.nextInt();
        String operand = scanner.nextLine();
        int operand2 = scanner.nextInt();

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