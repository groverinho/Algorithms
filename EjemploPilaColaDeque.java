import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Scanner;


public class EjemploPilaColaDeque {

	public static void main(String[] args) {
		ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
		//deque es una estructura que sirve para manejar colas O pilas
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		deque.add(n);//agregar elemento al deque 
		deque.add(2);
		deque.add(3);
		deque.add(4);
		System.out.println("---------------PILA----------");
		while(!deque.isEmpty())//verificar si esta vacio 
		{
			System.out.println(deque.getLast());//muestra el ultimo q ingresa
			int a = deque.getLast();
			deque.removeLast();//eliminas el ultimo
		}
		//
		deque.add(1);
		deque.add(2);
		deque.add(3);
		deque.add(4);
		System.out.println("Iterador descendiente");
		for(Iterator itr = deque.descendingIterator();itr.hasNext();) 
		{
		
	         System.out.println(itr.next());
	      }
		System.out.println("---------------COLA----------");
		//deque.removeFirstOccurrence(2);
		if(deque.contains(3))
		{
			while(!deque.isEmpty())
			{
				System.out.println(deque.getFirst());//muestra el primero q ingresa
				deque.removeFirst();//eliminas el primero
			}
		}
		 
		
	}

}
