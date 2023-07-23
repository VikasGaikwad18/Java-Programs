package Arrays;

public class BinarySearch2 {

	public static void main(String[] args) {

    int[]a = {1,2,3,4,5,6,7,7};
    
    int num = 98;
    
    int start =0;
    int end = a.length-1;
    int mid = (start+end)/2;
    
    while(start<=end)
    {
    	if(num==a[mid]) {
    		System.out.println("found at index : "+mid);
    	break;
    	}
    	else if(num>=a[mid])
    	{
    		start = mid+1;
    	}else {
    		end = mid-1;
    	}
    	mid =(start+end)/2;
    	if(start>end)
    		System.out.println("not found");
    	
    	
    	
    }
	}

}
