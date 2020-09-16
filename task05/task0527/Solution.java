package task05.task0527;

public class Solution {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doger dog1 = new Doger("Hund", 10, 15);
		Cat cat1 = new Cat("Hund", 10, 15);
		Mouse mouse1 = new Mouse("Hund", 10, 15);
		

	}
	
	public static class Doger {
		String name;
		int age;
		int weight;		
		
		public Doger (String name, int age, int weigth) {
			this.name = name;
			this.age = age;
			this.weight = weigth;
		}
	}
	
	public static class Cat {
		String name;
		int age;
		int weight;	
		
		public Cat (String name, int age, int weigth) {
			this.name = name;
			this.age = age;
			this.weight = weigth;
		}
	}
	
	public static class Mouse {
		String name;
		int age;
		int weight;	
		
		public Mouse (String name, int age, int weigth) {
			this.name = name;
			this.age = age;
			this.weight = weigth;
		}
	}



}
