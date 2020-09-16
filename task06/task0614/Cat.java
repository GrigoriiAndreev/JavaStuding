package task06.task0614;

import java.util.ArrayList;

public class Cat {
	
	public static ArrayList<Cat> cats = new ArrayList<Cat>();
	
	public Cat() {
	}
	
	public static void printCats() {
		for (Cat cat : cats)
			System.out.println(cat);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			cats.add(new Cat());
		}
	}

}
