package task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

public class Solution {
    
    public static void main(String[] args) throws Exception {
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	String stringNumberN = reader.readLine();
    	//String numberString2 = reader.readLine();
        int N = Integer.parseInt(stringNumberN);
        
        if (N > 0) {
        int currentNumber;
        int maximum;
    	
        String stringNumber = reader.readLine();
        maximum = Integer.parseInt(stringNumber);
        
    	for (int i = 0; i < N - 1; i++)
    	{
    		String stringNumber1 = reader.readLine();
    		currentNumber = Integer.parseInt(stringNumber1);
    		if (maximum < currentNumber) maximum = currentNumber;
     	}
    	
    	System.out.println(maximum);
        }
        }
}

