
public class KMP {

	static char[] T, P; 
	  static int n, m;
	  static int [] b; 



	  static void kmpPreprocess() { 
	    int i = 0, j = -1; b[0] = -1;
	    while (i < m) { 
	      while (j >= 0 && P[i] != P[j]) j = b[j]; 
	      i++; j++; 
	      b[i] = j; 
	  } }       

	  static int kmpSearch() {
	    int i = 0, j = 0,cont=0; 
	    while (i < n) { 
	      while (j >= 0 && T[i] != P[j]) j = b[j]; 
	      i++; j++; 
	      if (j == m) { 
	        
	    	  cont++;
	        j = b[j]; 
	      }
	      }
	    return cont;
	    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String cad1 = in.next();
		String cad2 = in.next();
		T  = cad1.toCharArray();
		P  = cad2.toCharArray();
	    n = T.length;
	    m = P.length;
	    b = new int[400001];

	    kmpPreprocess();
		int contador = kmpSearch();
	    System.out.println(contador);

	}

}
