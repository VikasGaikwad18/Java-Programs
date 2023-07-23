package methods;

public class Truck extends Vehicle{
	
	public void seat() {
		System.out.println("in seat");
	}

	public static void main(String[] args) {
		
		Truck obj = new Truck();
		obj.tyre();
		
		obj.seat();
		
		obj.mirror();
		
		// TODO Auto-generated method stub

	}

}
