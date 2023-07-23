package Variation;

public class SquareEndsWithDigit {

	public static void main(String[] args) {
		
		int num = 10;
		int sq = num*num;
		
		String s1Str = Integer.toString(sq);
		String numStr = Integer.toString(num);
		
		System.out.println(s1Str.endsWith(numStr));

	}

}
