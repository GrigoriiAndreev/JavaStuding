package task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int[] numbers = new int[5]; 
				int number;
				for (int i = 0; i < 5; i++)
				{
				  String s = reader.readLine();
				  number = Integer.parseInt(s);
				  numbers[i] = number;
				}
				Arrays.sort(numbers);
				
				for (int i = 0; i < numbers.length; i++)
				    System.out.println( numbers[i] );
    }
}
