public class assn10 {
	public static void main(String[] args) {
	int []arr = new int[2];
	int sum1=0,sum2=0;
	int [] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
	public void sumOfEvensAndOdds(int []nums) { 
		for(int i=0;i<10;i++)
		{
			if(nums[i]%2==0)
				sum1=sum1+nums[i];
			else
				sum2=sum2+nums[i];
		}
		
		arr[0] = sum1;
		arr[1] = sum2;
	}
	System.out.println(arr);
}}
