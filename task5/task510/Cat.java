package task5.task510;

public class Cat {
    //напишите тут ваш код
    
    //private String name = "безымянный кот";
	String name;
	int age;
	int weight;
	String address;
	String color;
	
	public void initialize(String name) {
		this.name = name;
		this.age = 2;
		this.weight = 3;
		this.color = "white";
	}
	
	public void initialize(String name, int weight, int age) {
		this.name = name;
		this.weight = weight;
		this.age = age;
		this.color = "white";
	}
	
	public void initialize(String name, int age) {
		this.name = name;
		this.weight = 3;
		this.age = age;
		this.color = "white";
	}

	
	public void initialize(int weight, String color, String address) {
		this.weight = weight;
		this.age = 2;
		this.color = color;
		this.address = address;
	}
	
	public void initialize(int weight, String color) {
		this.weight = weight;
		this.age = 2;
		this.color = color;
		//this.address = address;
	}

    public static void compare(int number) {
       

    }

    public static void main(String[] args) {

    }
}
