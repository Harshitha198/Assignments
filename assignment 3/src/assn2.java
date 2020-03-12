public class assn2 {
	
	int num;
	static boolean isPrimeNumber(int num) { 
		if(num==2)
			return true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
				return false;
		}
			return true; 
	}
	
	public static void main(String[] args) {
		System.out.println(isPrimeNumber(13));
	}
}
