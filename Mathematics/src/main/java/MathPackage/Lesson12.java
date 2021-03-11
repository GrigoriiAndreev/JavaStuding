package MathPackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

// Можно смело удалять
public class Lesson12 {
    static char[][] battleArea = new char[10][10];
    static int playerShips = 5;
    static int numRows = 10;
    static int numCols = 10;
    static int x1, x2, y1, y2;

    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);

        initialization();
        showBattleArea();
/*
        System.out.println("Enter the coordinates of the Aircraft Carrier (5 cells):");
        String coordinates1 = scanner.next();
        String coordinates2 = scanner.next();
        int x1 = coordinates1.charAt(0);
        int y1 = Character.digit(coordinates2.charAt(0), 10);
        System.out.println(x1 + " " + y1);
*/

        deployPlayerShips();
        showBattleArea();


    }

    public static void initialization() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                battleArea[i][j] = '~';
            }
        }
    }

    public static void showBattleArea() {
        System.out.print("  ");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();

        for (int row = 0; row < 10; row++) {
            System.out.print((char) (row + 65));
            for (int col = 0; col < 10; col++) {
                System.out.print(" " + battleArea[row][col]);
            }
            System.out.println();
        }
    }

    public static void deployPlayerShips(){
        Scanner input = new Scanner(System.in);

        System.out.println("\nDeploy your ships:");
        //Deploying five ships for player
        playerShips = 2;
        int shipLength = 0;
        int enteredShipLength = 0;

        for (int k = 1; k <= playerShips; k++) {
            if (k == 1) {
                System.out.print("Enter the coordinates of the Aircraft Carrier (5 cells):");
                shipLength = 5;
            }
            if (k == 2) {
                System.out.print("Enter the coordinates of the Battleship (4 cells):");
                shipLength = 4;
            }
            if (k == 3) {
                System.out.print("Enter the coordinates of the Submarine (3 cells):");
                shipLength = 3;
            }

            String rowCoord1 = input.next();
            String rowCoord2 = input.next();
            int x1 = (int) rowCoord1.charAt(0) - 64;
            if (rowCoord1.length() > 2) {
                int y1 = 10;
            } else {
                y1 = (int) rowCoord1.charAt(1) - 48;
            }
            int x2 = (int) rowCoord2.charAt(0) - 64;
            if (rowCoord2.length() > 2) {
                int y2 = 10;
            } else {
                y2 = (int) rowCoord2.charAt(1) - 48;
            }
            //Calculating the ship length
            if (x1 == x2) {
                enteredShipLength = y2 - y1 + 1;
            } else {
                enteredShipLength = x2 - x1 + 1;
            }
            if (shipLength != enteredShipLength) {
                System.out.println("Error! Wrong length of the Submarine! Try again:");
            }
            System.out.println(rowCoord1 + " " + rowCoord1.charAt(0) + " " + (int) rowCoord1.charAt(0) + " " + x1 + " " + y1);
            System.out.println(rowCoord2 + " " + rowCoord2.charAt(0) + " " + (int) rowCoord2.charAt(0) + " " + x2 + " " + y2);
            System.out.println("x1 = " + x1 + " y1 = " + y1 + " x2 = " + x2 + " y2 = " + y2 + " shipLength " + shipLength + " eneterdShipLength " + enteredShipLength);
            if (x1 == x2) {
                for (int i = y1; i <= y2; i++) {
                    battleArea[x1 - 1][i - 1] = 'O';
                }
            }
            if (y1 == y2) {
                for (int i = x1; i <= x2; i++) {
                    battleArea[i - 1][y1 - 1] = 'O';
                }
            }
//            System.out.print("Enter Y coordinate for your " + i + " ship: ");
//            int y = input.nextInt();

/*
            if((x >= 0 && x < numRows) && (y >= 0 && y < numCols) && (battleArea[x][y] == '~'))
            {
                battleArea[x][y] = 'O';
                i++;
            }
            else if((x >= 0 && x < numRows) && (y >= 0 && y < numCols) && battleArea[x][y] == 'O')
                System.out.println("You can't place two or more ships on the same location");
            else if((x < 0 || x >= numRows) || (y < 0 || y >= numCols))
                System.out.println("Error! Wrong ship location! Try again: " + numRows + " by " + numCols + " grid");
        }
*/
        showBattleArea();
        }
    }
}

