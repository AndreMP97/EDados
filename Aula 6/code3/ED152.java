import java.util.Scanner;

class ED152 {

    static boolean balanced(String s) {
	Stack<Character> k = new Stack<Character>();
	for (int i=0;i<s.length();i++) {
	    if(s.charAt(i) == '(' || s.charAt(i) == '[') {
		LibStack.push(k,s.charAt(i));
	    }
	    else if(s.charAt(i) == ')') {
		if(LibStack.isEmpty(k))
		    return false;
		else if(LibStack.top(k) == '(') {
		    LibStack.pop(k);
		}
	    }
	    else if(s.charAt(i) == (']')) {
		if(LibStack.isEmpty(k))
		    return false;
		else if(LibStack.top(k) == '[') {
		    LibStack.pop(k);
		}
	    }
	}
	if (LibStack.isEmpty(k))
	    return true;
	else
	    return false;
    }
    
    public static void main(String[] args) {	
	Scanner in = new Scanner(System.in);	
	int n = in.nextInt();
	for (int i=0; i<n; i++) {
	    String s = in.next();
	    System.out.println(s + ": " + balanced(s));
	}
    }
}
