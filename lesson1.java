
public class Car {
	
	public void start() {
		System.out.println("Поехали");
	}
	
	public void stop() {
		System.out.println("Стоп машина");
	}
	
	public int drive(int howlong) {
		int distance = howlong * 60;
		//System.out.println("Мы проехали ="+ distance);
		return distance;
	}
	
	
	
}
