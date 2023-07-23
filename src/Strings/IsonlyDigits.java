package Strings;

public class IsonlyDigits {

	public static void main(String[] args) {
		
		String s = "1234 ";
		
		
		if(isOnlyDigits(s))
			System.out.println("only Digits");
		else
			System.out.println("not only digits");
	
	}

	private static boolean isOnlyDigits(String s) {
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			
			if(ch<'0')
				return false;
			if(ch>'9')
				return false;
		}
		return true;
	}

}
