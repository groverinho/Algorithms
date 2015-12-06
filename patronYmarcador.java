import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class patronYmarcador {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String cadena = in.nextLine();
		
		Pattern patron = Pattern.compile("Hola");
		Matcher marcador = patron.matcher(cadena);
		int cont = 0;
		while (marcador.find())
		{
			cont++;
		}
		System.out.println(cont);
		
	}

}
