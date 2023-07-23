package methods;



public class Water {
	
		 public void printSolid() {
			 System.out.println("in solid");
		 }
		 
		 public void printSolid(double i) {
			 System.out.println("in liquid");
		 }
		 public void printSolid(String str) {
			 System.out.println("in gas");
		 }
		 public static void main(String[] args)
		 {
			 Water obj = new Water();
			 obj.printSolid();
			 obj.printSolid("10 12 30");
		 }
	}


