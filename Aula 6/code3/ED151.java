import java.util.Scanner;

class ED151 {

    static void reverse(Stack<Integer> s, int n) {
	int array[] = new int[n];
	for(int i=0;i<n;i++)
	    array[i]=LibStack.pop(s);
	for(int i=0;i<n;i++)
	    LibStack.push(s,array[i]);
    }
    public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    Stack<Integer> s = new Stack<Integer>();
    int size = in.nextInt();
    for (int i=0; i<size; i++) {
	int x = in.nextInt();
	LibStack.push(s, x);
    }
    int n = in.nextInt();
    System.out.println("Pilha Inicial: " + LibStack.toString(s));
    System.out.println("Invertendo com n = " + n);
    reverse(s, n);
    System.out.println("Pilha Final:   " + LibStack.toString(s));
    }
}
