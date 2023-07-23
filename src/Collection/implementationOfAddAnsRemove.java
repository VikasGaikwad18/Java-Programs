package Collection;

public class implementationOfAddAnsRemove  {

	
		private int[] a = new int[3];
		int index = 0;
		public void remove(int userIndex)
		{
			if(userIndex>=index || userIndex<0)
				throw new ArrayIndexOutOfBoundsException();
			
			for(int i=userIndex; i<index; i++)
				a[i] = a[i+1];
			index--;
		}

	
public void add(int userIndex, int data)
{
	
	if(userIndex>index || userIndex<0)
		throw new ArrayIndexOutOfBoundsException();
	
	if(index>=a.length)
		grow();
	if(userIndex==index)
	{
		a[index] = data;
		index++;
		
	}
}


private void grow() {
	int[] b = new int[a.length*2];
	for(int i=0; i<a.length; i++)
		b[i] = a[i];
	
	a= b;
	
}
}
