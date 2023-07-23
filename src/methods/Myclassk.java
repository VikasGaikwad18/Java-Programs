package methods;

public class Myclassk extends Studentk {
	
	public Integer add()
	{
		System.out.println("Addition");
		return 0;
		
	}

	public static void main(String[] args) {
		
		Myclassk obj= new Myclassk();
		
		obj.add();
		
		Studentk obj2 = new Studentk();
		obj2.add();
		
		

	}

}
