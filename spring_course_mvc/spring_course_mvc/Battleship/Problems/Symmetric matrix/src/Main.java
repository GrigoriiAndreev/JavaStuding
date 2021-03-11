import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

            Scanner scanner = new Scanner(System.in);
            int arraySize = scanner.nextInt();
            int[][] intArray= new int[arraySize][arraySize];
//            boolean answer = false;

        for (int i = 0; i < arraySize; i++) {
            for (int k = 0; k < arraySize; k++) {
                intArray[i][k] = scanner.nextInt();
            }
        }


//        boolean symmetric = isSymmetric(intArray);

        boolean symmetric = true;

        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++)            {
                if (intArray[i][j] != intArray[j][i])                 {
                    symmetric = false;
                    break;
                }
            }
        }

        if (symmetric)         {
            System.out.println("YES");
        }
        else         {
            System.out.println("NO");
        }
    }
}
