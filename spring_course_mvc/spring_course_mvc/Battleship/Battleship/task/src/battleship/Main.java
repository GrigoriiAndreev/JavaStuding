package battleship;

public class Main {

    static char[][] battleArea = new char[10][10];

    public static void main(String[] args) {
        // Write your code here

        initialization();
        showBattleArea();
        System.out.println("Enter the coordinates of the Aircraft Carrier (5 cells):");

    }
    public static void initialization() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                battleArea[i][j] = '~';
            }
        }
    }

    public static void showBattleArea() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        for (int row = 1; row <= 10; row++) {
            System.out.print(row);
            for (int col = 1; col <= 10; col++) {
                System.out.print(battleArea[row][col]);
            }
            System.out.println();
        }
    }
}
