package task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float sum = 0;
        int counter = 0;

        while(true) {
            String numberString = reader.readLine();
            int number = Integer.parseInt(numberString);
            if(number == -1)
                break;
            counter++;
            sum = sum + number;
        }
        System.out.println(sum/counter);
    }
}
