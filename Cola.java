import java.util.LinkedList;
import java.util.Scanner;
public class Cola {

	/**
	 * FIFO
	 * offer = Añadir un dato
	 * poll = quitar un dato
	 * peek = ver ultimo dato que se introdujo
	 */
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		/*1*/
		LinkedList cola = new LinkedList();//declarar una cola
		/*2*/
		int n = in.nextInt();
		for (int i = 1; i <= n; i++)
		{
			cola.offer(in.next());// ingresar datos a la cola
		}
		/*3*/
		System.out.println(cola.peek());//ver el ultimo dato que se introdujo

		/*4*/
		if (cola.peek()!=null) //entonses para ver si la
		{					   //cola esta vacia lo que
			  				   //hacemos es comparar viendo si es diferente de null
		}
		/*5*/
		cola.poll();//para quitar un dato de la cola, y quitara de acuerdo a la regla de la cola First in first out
		/*6*/
		cola.isEmpty();//este creo q es para ver si esta vacia la cola 
	}

}
