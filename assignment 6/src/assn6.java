public class assn6 {
	int n1,n2,nt;
	public static int fibonacci(int index) { 
		int n1,n2,nt;
		n1=0;
		n2=1;
		System.out.println(n1+" "+n2);
		for(int i=0;i<index;i++)
		{
			nt=n1+n2;             
			System.out.println(nt);  
			n1=n2;              
			n2=nt;
		}
		
		return 0; 
	}
	
	public static void main(String[] args) {
		fibonacci(5);
	}
}
