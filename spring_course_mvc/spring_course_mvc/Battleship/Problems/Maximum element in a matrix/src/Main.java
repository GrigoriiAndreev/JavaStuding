import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int arraySizeN = scanner.nextInt();
        int arraySizeM = scanner.nextInt();
        int[][] intArray= new int[arraySizeN][arraySizeM];
//            boolean answer = false;

        for (int i = 0; i < arraySizeN; i++) {
            for (int k = 0; k < arraySizeM; k++) {
                intArray[i][k] = scanner.nextInt();
            }
        }


//        boolean symmetric = isSymmetric(intArray);
        int maxRow = 0;
        int maxCol = 0;
        int maxElement = Integer.MIN_VALUE;

        for (int i = 0; i < arraySizeN; i++) {
            for (int j = 0; j < arraySizeM; j++) {
                if (intArray[i][j] > maxElement) {
                    maxElement = intArray[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.println(maxRow + " " + maxCol);
    }
}