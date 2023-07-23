package methods;


public class Math1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Vikas obj = new Vikas();
      obj.Mul();
      obj.Add();
	}

}

class example{
	void Add() {
		int tot = 5+6;
		System.out.println(tot);
	}
}
class Vikas extends example{
	
	void Mul() {
		int mul = 5*5;
		System.out.println(mul);
	}
}
