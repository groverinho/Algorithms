import java.util.Scanner;
import java.util.Stack;
public class Pila {

	/**
	 * LIFO
	 * push = Introducir dato
	 * pop = quitar el ultimo dato
	 * peek = ver ultimo dato que se introdujo
	 * empty = comprobacion de pila vacia
	 */
	public static void main(String[] args) {
		/*1*/
		Stack pila = new Stack();//declarar una pila
		Scanner in = new Scanner(System.in);
		/*2*/
		int n = in.nextInt();
		for (int i = 1; i <= n; i++)
		{
			pila.push(in.nextInt());// ingresar datos a la pila
		}
		/*3*/
		pila.pop(); // quitar el ultimo dato
		/*4*/
		System.out.println(pila.peek()); //ver el ultimo dato que se introdujo,, 
		//por ejm si primero ingresas 1 luego 2 y luego 3, el dato que primero mostraria seria 3
		//por que es una estructura LIFO, luego si es quieres sacar un dato de la pila lo hace con el pop()
		// y vuelves a ver el ultimo dato con peek(), entonses  te motraria el 2.
		
		/*5*/
		while(pila.empty()==false)//con el empty lo que haces es ver si la pila esta vacia, en este caso
		{//lo que haces con el while es que trabaje mientras no sea o no este vacio
			pila.pop();//y esto lo ira quitando mientras este vacion
		}
	}

}
