package Collection;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		
		int ch = 0;
		Scanner sc = new Scanner(System.in);
		Dao obj = new Dao();
		
		while( ch != 4)
		{
			System.out.println("Enter\n1: print All Students  Eneter\n2: Add new Student Eneter\n3:delete sutudent Enter\n4: exit");
			ch = sc.nextInt();
			sc.nextLine();
			
			if(ch==1) {
				dao.read();
			}else if(ch==2)
			{
				System.out.println("Enetyer id, name , marks");
				int id = sc.nextInt();
				sc.nextLine();
				dao.remove(id);
				System.out.println("done");				
			}
			else if(ch==4)
				System.out.println("khatam tata bye bye");
		else
			
		System.out.println("wrong input");
		}
	}

}
