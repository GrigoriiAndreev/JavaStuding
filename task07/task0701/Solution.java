package task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	
	public static int[] initializeArray() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] array = new int[20];
		
		for ( int i = 0; i < 20; i++) {
			String s = reader.readLine();
			array[i] = Integer.parseInt(s);
		}
		return array;
	}
	
	public static int max(int[] array) {
		int max =0;
		
		for ( int i = 0; i < 20; i++) 
			if (max < array[i]) max = array[i];
		return max;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int array[] = initializeArray();
		int max = max(array);
        System.out.println(max);
	}

}
