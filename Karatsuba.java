import java.util.Scanner;

public class Karatsuba
{
	/*public static long convertir(char[] argumento)
	{
		long resultado=0;
		for (int i = 0; i < argumento.length; i++) 
		{
			resultado +=(Character.getNumericValue(argumento[i]))*Math.pow(10, argumento.length-1-i);
		}
		return resultado;
	}*/
	public static long calcularKaratsuba(char[] multiplicando, char[] multiplicador)
	{//formula= 10elevado ala n ac + 10 n/2 (ad+bc)+bd
		long resultadoFinal=1;
		int tamanio = multiplicando.length;
		int tamanio2 = multiplicador.length;
		if (tamanio>1 && tamanio2>1)
		{			
		char []a = new char [tamanio/2];
		char []b = new char [tamanio/2];
		char []c = new char [tamanio/2];
		char []d = new char [tamanio/2];
		for (int i = 0; i < tamanio/2; i++) 
		{
			a[i]= multiplicando[i];
			c[i]= multiplicador[i];
			b[i]=multiplicando[i+(tamanio/2)];
			d[i]= multiplicador[i+(tamanio/2)];
		}
		long resultado1=((int)Math.pow(10, tamanio))*calcularKaratsuba(a, c);
		long resultado2=((int)Math.pow(10, tamanio/2))*(calcularKaratsuba(a, d)+(calcularKaratsuba(b, c)));
		long resultado3=(calcularKaratsuba(b, d));
		resultadoFinal = resultado1+resultado2+resultado3;
		}
		else
		{
			resultadoFinal = Character.getNumericValue(multiplicando[0])*Character.getNumericValue(multiplicador[0]);
		}
		return resultadoFinal;
	}
	
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese el primer numero");
		String primer=entrada.next();
		System.out.println("ingrese el segundo numero");
		String segundo=entrada.next();
		char[] multiplicando= new char[primer.length()];
		char[] multiplicador=new char [segundo.length()];
		for (int i = 0; i < primer.length(); i++) 
		{
			multiplicando[i]= primer.charAt(i);
		}
		for (int j = 0; j < segundo.length(); j++) 
		{
			multiplicador[j]= segundo.charAt(j);
		}
		long resultado = calcularKaratsuba(multiplicando, multiplicador);
		System.out.println("resultado es: "+resultado);
	}

}
