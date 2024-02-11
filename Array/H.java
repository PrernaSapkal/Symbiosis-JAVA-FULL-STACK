package com.Demo;

public class H {
	public static int Demo(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i]>=0)
			{
				arr[i]=0-arr[i];
			}
			else if(arr[i]<0)
			{
				arr[i]=0-arr[i];
			}
		}
			for(int arr1 :arr) {
	        	System.out.println(arr1);
	        
		}
		return 0;
	}
	public static void main(String[] args) {
		H obj = new H();
		int arr[]= {1,2,3,-4};
		obj.Demo(arr);
		
	}

}
