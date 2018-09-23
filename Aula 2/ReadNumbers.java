import java.util.Scanner;

public class ReadNumbers {
    public static void main(String[] args) {

	Scanner stdin = new Scanner(System.in);

	// Ler a quantidade de numeros que se seguem
        int n = stdin.nextInt();
	
	// Cria um novo array com espaço para 10 inteiros
        int v[] = new int[n];	

        // Ler os numeros a partir do stdin
        for (int i=0; i<n; i++)
            v[i] = stdin.nextInt();

        // Escrever os numeros no stdout
        for (int i=0; i<n; i++)
            System.out.println("v[" + i + "] = " + v[i]);

	//soma, media e amplitude
	int soma = 0, max=v[0], media = 0, min=v[0], amp;
	for (int i=0; i<n; i++) {
	    soma = soma + v[i];
	    if (v[i] > max) {
		max = v[i];
	    }
	    else if (v[i] < min) {
		min = v[i];
	    }
	}
	amp = max - min;
	media = (soma/n);
	System.out.println("soma: " + soma);
	System.out.println("media: " + media);
	System.out.println("amplitude: " + amp);
    }
}
