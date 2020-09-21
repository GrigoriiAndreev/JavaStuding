package task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> listString = new ArrayList<String>();
		int numberN;
		int numberM;
		
//		String s = reader.readLine();
		numberN = Integer.parseInt(reader.readLine());
//		String s1 = reader.readLine();
		numberM = Integer.parseInt(reader.readLine());
		
		// Заполнение listString
		for ( int i = 0; i < numberN; i++) {
//			String s2 = reader.readLine();
			listString.add(reader.readLine());
		}
		
		
		// Обработка listString
		for ( int i = 0; i < numberM; i++)
			listString.add(listString.remove(0));
		
		// Вывод listString
		for ( int i = 0; i < listString.size(); i++) {
			//String s = reader.readLine();
			System.out.println(listString.get(i));
		}

	}

}