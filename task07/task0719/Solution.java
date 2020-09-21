package task07.task0719;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Solution {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] array = new int[20];
		ArrayList<Integer> listInteger = new ArrayList<Integer>();
		
		for ( int i = 0; i < 10; i++) {
			String s = reader.readLine();
			listInteger.add(Integer.parseInt(s));
		}
		
		for ( int i = 0; i < listInteger.size(); i++) {
			//String s = reader.readLine();
			System.out.println(listInteger.get(i));
		}

	}

}
