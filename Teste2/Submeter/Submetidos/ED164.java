import java.util.Scanner;
import java.util.Arrays;

public class ED164 {
    public static void main(String args[]) {
	Scanner stdin = new Scanner(System.in);
	int n    = stdin.nextInt();
	int conta=1;
        String s[] = new String[n]; 
	for (int i = 0; i<n; i++)
	    s[i] = stdin.next();
       	
	// Chamada ao sort padrao da linguagem Java
	// Usa o comparador padrao do tipo do array
	Arrays.sort(s);
	
	for (int i = 0; i<n-1; i++) {
	    if(!s[i].equals(s[i+1])) {
		conta++;
	    }
	}	
	System.out.println(conta);
    }
}
