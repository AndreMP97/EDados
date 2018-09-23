public class TestStack {
  public static void main(String args[]) {
    Stack<Integer> s = new Stack<Integer>();
    for (int n=52;n>0;n=n/2) 
	LibStack.push(s,n%2);
    System.out.println(LibStack.toString(s));
  }
}
