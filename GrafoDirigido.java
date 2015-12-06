import java.util.Scanner;


public class GrafoDirigido {

	public static void main(String[] args)
	{
		Scanner in  =new Scanner(System.in);
		int nodo = in.nextInt();
		int aristas = in.nextInt();
		int[][] matriz = new int[nodo][nodo];
		for (int i = 0; i < aristas; i++)
		{
			int a = in.nextInt();
			int b = in.nextInt();
				matriz[a-1][b-1]= 1;
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
 5
6
1
3
1
2
2
3
3
5
5
4
4
5
0	1	1	0	0	
0	0	1	0	0	
0	0	0	0	1	
0	0	0	0	1	
0	0	0	1	0
 */
