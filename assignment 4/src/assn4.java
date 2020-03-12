import java.util.Arrays;

public class assn4 {
	int a;
	int b;
	int c;
	
	public static void sortThreeNumbers(int a, int b, int c) { 
		int lo;
		if(a<b && a<c)
		{
				lo=a;
				if(b<c)
					System.out.println(a+" "+b+" "+c);
				else
					System.out.println(a+" "+c+" "+b);
		}
		
		if(b<c && b<a)
		{
				lo=b;
				if(a<c)
					System.out.println(b+" "+a+" "+c);
				else
					System.out.println(b+" "+c+" "+a);
		}
		
		if(c<a && c<b)
		{
				lo=c;
				if(a<b)
					System.out.println(c+" "+a+" "+b);
				else
					System.out.println(c+" "+b+" "+a);
		}
		
		
		
	}
	
	public static void main(String[] args) {
		sortThreeNumbers(2, 10, 1);
	}
}
