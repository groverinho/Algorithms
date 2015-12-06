import java.util.Scanner;


public class euclides {

	
	public static int Euclides(int a, int b) 
	{
		int r=b;
		while (b> 0)
		{
			r=a%b;
			a=b;
			b=r;
		}
		return (a);
	}

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println(Euclides(a, b));


	}

}
//  3
//  1/12 7/12 3/12
//  3/7 2/8 10/5
