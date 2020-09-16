package task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
	
    public static void main(String[] args) throws Exception {
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	//String numberString1 = reader.readLine();
    	//String numberString2 = reader.readLine();
        //int number1 = Integer.parseInt(numberString1);
        int number2 = 0; //Integer.parseInt(numberString2);
        int summa = 0;
    	
    	while (true)
    	{
    		String s = reader.readLine();
    		if (s.equals("сумма"))
    			break;
    		else {
    			number2 = Integer.parseInt(s);
    			summa = summa + number2;
    		}
    	}
    	System.out.println(summa);
        }
}