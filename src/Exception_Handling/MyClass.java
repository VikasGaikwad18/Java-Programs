package Exception_Handling;


class InvalidAgeException extends Exception 
{
	InvalidAgeException(String message)
	{
		super(message);
	}
}

class User{
	void register(int age)
	{
		if(age<18)
		{
			try
			{
				throw new InvalidAgeException("age<18");
			}catch(InvalidAgeException e)
			{
				System.out.println("Handledd");
			}
		}else
		{
			System.out.println("your voting id will be Generated...");
		}
	}
	
	
}

public class MyClass {

	public static void main(String[] args) {
		 User obj = new User();
		 obj.register(19);

	}

}
