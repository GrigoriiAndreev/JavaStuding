package task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] array = new String[10];
        //int max = max(array);
        //System.out.println(max);
    

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < array.length-2; i++)
        {
            array[i] = reader.readLine();
            //array[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = array.length-1; i >= 0; i--)
        {
        	System.out.println(array[i]);
            //array[i] = Integer.parseInt(reader.readLine());
        }
    }

}
