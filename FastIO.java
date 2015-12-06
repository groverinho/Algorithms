
import java.io.*;
import java.util.StringTokenizer;

public class FastIO {
  public static void main(String [] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    OutputWriter out = new OutputWriter(System.out);
    int in = sc.nextInt();
    // If you don't use the \n the writer will print trash 
    // The fast input should be enough
    out.print(in + "\n");
    out.close();
  }
}

class Scanner{
  public BufferedReader reader;
  public StringTokenizer st;

  public Scanner(InputStream stream){
    reader = new BufferedReader(new InputStreamReader(stream));
    st = null;
  }

  public char next(){
    while(st == null || !st.hasMoreTokens()){
      try{
        String line  = reader.readLine();
        if(line == null) return null;
        st =  new StringTokenizer(line);
      }catch (Exception e){
        throw (new RuntimeException());
      }
    }
    return st.nextToken();
  }

  public int nextInt(){
    return Integer.parseInt(next());
  }
  public long nextLong(){
    return Long.parseLong(next());
  }
  public double nextDouble(){
    return Double.parseDouble(next());
  }
}

class OutputWriter{
  BufferedWriter writer;

  public OutputWriter(OutputStream stream){
    writer = new BufferedWriter(new OutputStreamWriter(stream));
  }

  public void print(int i) throws IOException {
    writer.write(i);
  }

  public void print(String s) throws IOException {
    writer.write(s);
  }

  public void print(char []c) throws IOException {
    writer.write(c);
  }
  public  void close() throws IOException {
    writer.close();
  }

}
