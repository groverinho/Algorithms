import java.util.Scanner;


public class FloydWarshall
{

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		int nodo = entrada.nextInt();//cantidad de nodos
		int n = entrada.nextInt();//cantidad de vertices - conexiones
		int [][] matrizAdyacencia = new int[nodo][nodo];
		
		// inicio todas las posiciones de mi matriz en 10000
		for (int i = 0; i < matrizAdyacencia.length; i++) 
		{
			for (int j = 0; j < matrizAdyacencia.length; j++) {
				matrizAdyacencia[i][j]=10000;
			}
		}
		//cargamos inicio, fin y pesos hasta n (cant de conexiones)
		for (int i = 0; i < n; i++) 
		{
				int a = entrada.nextInt();//nodo inical
				int b = entrada.nextInt();//nodo final
				int peso = entrada.nextInt();//su peso
				matrizAdyacencia[a-1][b-1]=peso;
				
				
		}
		//mostramos matriz sin recorrer en el algoritmo
		for (int i = 0; i < matrizAdyacencia.length; i++)
		{
			for (int j = 0; j < matrizAdyacencia.length; j++)
			{
				System.out.print(matrizAdyacencia[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("----------------------hola :)-------------------------");
		//recorremos nuestra matriz en el algoritmo de floyd
		int[][]nueva = floyd(matrizAdyacencia,nodo);
		//mostramos matriz luego de recorrer en floyd
		for (int i = 0; i < nueva.length; i++)
		{
			for (int j = 0; j < nueva.length; j++)
			{
				System.out.print(nueva[i][j]+"\t");
			}
			System.out.println();
		}
	}
	//algoritmo de floyd-warshall
	static int[][] floyd (int w[][],int n)
	{
		for (int k = 0; k < n; k++) 
		{
			for (int i = 0; i < n; i++) 
			{
				for (int j = 0; j < n; j++) 
				{
					if(i!=j)
					w[i][j]=Math.min(w[i][j],w[i][k]+w[k][j]);//anadimos ruta minima en la posision
				}
			}
		}
		return w;
	}

}
