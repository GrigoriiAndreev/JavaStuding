package task06.task0601;

public class Cat {
	
	public static int catCounter;
	
	public Cat() {
		
		}
	
    protected void finalize() throws Throwable
    {
    	System.out.println("Finalize");
        
    }
    
    public static void main(String[] args) {

    	//Cat cat = new Cat();
    	
    	//cat.finalize();
    }

}
