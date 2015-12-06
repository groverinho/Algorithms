import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class DFS_CR {
	static final int MAX = 500;
	static int adyacencia[][] = new int[ MAX ][ MAX ];     //matriz de adyacencia
	static int vertices, padres[] = new int[ MAX ];
	
	
	public static void bfs(int inicio,int fin){
		int pasos = 0, actual; //max = 0
		boolean visitado[ ] = new boolean[ MAX ];//Matriz booleana de visitados
		Arrays.fill( visitado , false );//Pongo mi matriz en false	

		padres[ inicio ] = -1;
		
		Stack<Integer>P = new Stack<Integer>();
		//Queue<Integer> Q = new LinkedList<Integer>();
		P.push( inicio );
		while( !P.isEmpty() ){
			//max = Math.max( max , Q.size() );				//ver memoria usada en cola
			actual = P.pop();
			pasos++;

			if( actual == fin )break;						//si se llego al destino

			visitado[ actual ] = true;

			for( int i = 0 ; i < vertices ; ++i ){	    			//vemos adyacentes a nodo actual
				int v = adyacencia[ actual ][ i ];
				if( v != 0 && !visitado[ i ] ){				//no visitado agregamos a cola
					System.out.println( actual +" -> "+ i); //vemos recorrido de todo BFS
					padres[ i ] = actual;						//para ver recorrido de nodo inicio a fin
					P.push( i );
				}
			}
		}

		//System.out.println("Memoria maxima: " + max );
		System.out.println("Nro Pasos: " + pasos);

		PrintRecorrido( inicio , fin );

	}
	
	//Imprimimos recorrido para llegar de nodo inicio a fin
	static void PrintRecorrido( int ini , int fin ){

		System.out.println("Recorrido de nodos para llegar de nodo "+ini+" a " +fin);
		List<Integer> camino = new ArrayList<Integer>();

		for( ;; ){
			camino.add( fin );
			if( padres[ fin ] == -1 )break;
			fin = padres[ fin ];
		}

		for( int i = camino.size() - 1 , k = 0 ; i >= 0 ; --i ){
			if( k != 0 ) System.out.print( "->");
			System.out.print( camino.get( i ) );
			k = 1;
		}
		System.out.println();
	}
	
	public static void main( String args[] ){
		int aristas , u , v;
		Scanner sc = new Scanner( System.in );
		vertices = sc.nextInt();   //Numero de vertices
		aristas = sc.nextInt();	//Numero de aristas

		for( int i = 0 ; i < aristas ; ++i ){
			u = sc.nextInt(); v = sc.nextInt(); //enlace origen - destino
			adyacencia[ u ][ v ] = 1;
		}
		System.out.println("Nodo raiz: ");//incio de recorrido
		int inicio = sc.nextInt();
		System.out.println("Nodo final: ");//destino recorrido
		int fin = sc.nextInt();	
		bfs(inicio,fin);
	}
}