public class FindSecondLargest
{
    public static int findSecondLargest(int arr1[])
    {
    		int largest = Integer.MIN_VALUE;
    		int secondLargest = Integer.MIN_VALUE;	
    		for(int i=0; i<arr1.length; i++)
    		{
    			if(arr1[i] > largest)
    			{
    				secondLargest = largest;
    				largest = arr1[i];
    			}
    			else if(arr1[i] > secondLargest && arr1[i] != largest)
    			{
    				secondLargest = arr1[i];
    			}
    	 }
    	
    	if(secondLargest == Integer.MIN_VALUE)
    	{
    		System.out.println("No second number ");
    		return -1;
    	}
    	return secondLargest;		
  }
  public static void main(String args[])
  {
      int arr1[] = { 12, 35, 1, 10, 34, 1 };
  		System.out.println(findSecondLargest(arr1));     
  }
}

