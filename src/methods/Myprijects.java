package methods;

public class Myprijects {

	public static void main(String[] args) {
		
		User u = new User();
		u.setUsername("abcd");
		
		u.setpassWord("9865");
		
		String username = u.getUsername();
		String passWord = u.getpassWord();
		
		System.out.println(username);
		System.out.println(passWord);
		

	}

}
