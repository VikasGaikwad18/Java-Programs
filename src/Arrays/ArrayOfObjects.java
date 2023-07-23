package Arrays;

public class ArrayOfObjects {

	public static void main(String[] args) {
		Student s1 = new Student(4,"Somu",40);
		Student s2 = new Student(2,"Gomu", 41);
		Student s3 = new Student (3,"Somya", 39);
		Student s4 = new Student(1,"Gomya" , 38);
		
		Student [] s = {s1,s2,s3,s4};
		
		
		for (int i= 0;  i< s.length; i++) 
		{
			for(int j= i+1; j<s.length; j++)
			{
				if(s[i].marks>s[j].marks)
				{
					Student temp = s[i];
					s[i]= s[j];
					s[j]=temp;
				}
			}
			
		}
		for(int i=0; i<s.length; i++)
		{
			System.out.println(s[i].id+" "+s[i].name+" "+s[i].marks);
		}
			

	}

}
