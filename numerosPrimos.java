
public class numerosPrimos 
{
	public static void convencional(int[] vector)
	{		
		for (int i=4; i<Math.sqrt(vector.length); i++)
		{
			for (int j=2; j<i; j++)
			{
				if (i%j==0)
				{
					vector[i]=1;
					break;
				}
			}
		}			
	}
	public static void cribaEratostenes(int[] vector)
	{		
		for (int i=2; i<Math.sqrt(vector.length); i++)
		{
			if(vector[i]==0)
			{
				for (int j=i+i; j<vector.length; j=j+i)
			    {		
					vector[j]=1;
				}
			}
		}			
	}
	public static void mostrarPrimos(int[] vector)
	{
		for (int i = 2; i<vector.length ; i++)
			if(vector[i]==0)
				System.out.print(i+",");
	}
	public static int contarPrimos(int[] vector)
	{
		int contador=0;
		for (int i = 2; i<vector.length ; i++)
			if(vector[i]==0)
				contador++;
		return contador;
	}

	public static void main(String[] args) 
	{
      int[] vector1 = new int[1000000];
      int[] vector2 = new int[20];
      double mSegIniNormal = System.currentTimeMillis();
      convencional(vector1);
	  double mSegFinNormal = System.currentTimeMillis();
      mostrarPrimos(vector1);
      //System.out.println(" Primos Met.Convencional ="+contarPrimos(vector1)+" tiempo:"+((mSegFinNormal-mSegIniNormal)/1000)+" Segs.");
      double mSegIniCriba = System.currentTimeMillis();
      cribaEratostenes(vector2);
	  double mSegFinCriba = System.currentTimeMillis();
      //mostrarPrimos(vector2);
      System.out.println(" Primos Met.Criba Eratos.="+contarPrimos(vector2)+" tiempo:"+((mSegFinCriba-mSegIniCriba)/1000)+" Segs.");
     
      
      
      
      
      
      
      /*EJECUCION PARA UN VECTOR DE UN MILLON
       *  Primos Met.Convencional =78498 tiempo:187.094 Segs.
 	   *  Primos Met.Criba Eratos.=78498 tiempo:0.013 Segs.
       */
	}

}
