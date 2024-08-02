
public class MissingNumber {
	public static int  findMissingNumber(int[] nums)
	{
		int n=nums.length;
		int actualNumber=0;
		int expectedNumber=n*(n+1)/2;
		for( int num:nums)
		{
			actualNumber+=num;
		}
		return expectedNumber-actualNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums= {0,3,1,6,7,5,2};
int missing=findMissingNumber(nums);
System.out.println("Missing Number is:"+missing);
	}

}
