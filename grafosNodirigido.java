import java.util.Scanner;


public class grafosNodirigido {

	public static void main(String[] args)
	{
		Scanner in  =new Scanner(System.in);
		int n = in.nextInt();
		int[][] matriz = new int[n][n];
		for (int i = 0; i < matriz.length; i++)
		{
			int a = in.nextInt();
			int b = in.nextInt();
				matriz[a-1][b-1]= 1;
				matriz[b-1][a-1]= 1;
		}
		for (int i = 0; i < matriz.length; i++)
		{
			for (int j = 0; j < matriz.length; j++)
			{
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
/*
 7
1
7
7
4
7
3
3
5
2
5
6
2
6
7

0	0	0	0	0	0	1	
0	0	0	0	1	1	0	
0	0	0	0	1	0	1	
0	0	0	0	0	0	1	
0	1	1	0	0	0	0	
0	1	0	0	0	0	1	
1	0	1	1	0	1	0
 
 */